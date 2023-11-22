import java.util.ArrayList;

public class combinationSum {
    public static void main(String[] args) {
        int a[] = { 2, 3, 6, 7 };

        Combination(0, a, new ArrayList<>(), 7);
    }

    private static void Combination(int i, int[] a, ArrayList<Integer> li, int t) {

        if (i == a.length) {
            if (t == 0)
                System.out.println(li);
            return;
        }

        if (a[i] <= t) {
            li.add(a[i]);
            Combination(i, a, li, t - a[i]);
            li.remove(li.size() - 1);
        }

        Combination(i + 1, a, li, t);
    }
}
