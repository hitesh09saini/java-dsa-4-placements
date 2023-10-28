import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class mergeIntervals {
    public static void main(String[] args) {
        int a[][] = { { 1, 4 },  { 0, 4 }};
        int v[][] = merge(a);
        Print(v);
    }

    private static void Print(int[][] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] merge(int[][] a) {
        if (a.length == 1) {
            return a;
        }

        Arrays.sort(a, Comparator.comparingInt(i -> i[0]));
        
        List<List<Integer>> items = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            int start = a[i][0];
            int end = a[i][1];

            while (i + 1 < a.length && end >= a[i + 1][0]) {
                end = Math.max(end, a[i + 1][1]);
                i++;
            }

            List<Integer> row = new ArrayList<>();
            row.add(start);
            row.add(end);
            items.add(row);
        }

        int[][] result = new int[items.size()][2];
        for (int i = 0; i < items.size(); i++) {
            result[i][0] = items.get(i).get(0);
            result[i][1] = items.get(i).get(1);
        }

        return result;
    }
}
