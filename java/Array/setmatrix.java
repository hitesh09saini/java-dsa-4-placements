import java.util.ArrayList;
import java.util.List;

public class setmatrix {

    public static void main(String[] args) {
        int matrix[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

        List<List<Integer>> zeros = new ArrayList<>();
        int colL = matrix[0].length;
        int roL = matrix.length;

        for (int i = 0; i < roL; i++) {
            for (int j = 0; j < colL; j++) {
                if (matrix[i][j] == 0) {
                    List<Integer> li = new ArrayList<>();
                    li.add(i);
                    li.add(j);
                    zeros.add(li);
                }
            }
        }

        for (int i = 0; i < zeros.size(); i++) {
            int s = zeros.get(i).get(0);
            int e = zeros.get(i).get(1);
            // up - down
            for (int j = 0; j < colL; j++) {
                matrix[s][j] = 0;
            }

            // left - right

            for (int j = 0; j < roL; j++) {
                matrix[j][e] = 0;
            }
        }

        for (int i = 0; i < roL; i++) {
            for (int j = 0; j < colL; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
