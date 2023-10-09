package Array;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> li = PascalTriangle(n);
        System.out.println(li);
    }

    private static List<List<Integer>> PascalTriangle(int n) {
        List<List<Integer>> li = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <=i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(li.get(i-1).get(j - 1) + li.get(i-1).get(j));
                }
            }
            li.add(i, list);
        }
        return li;
    }
}
