import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Combination2 {
    public static void main(String[] args) {
        int c[] = { 10, 1, 2, 7, 6, 1, 5 };
        int t = 8;
        System.out.println(combinationSum2(c, t));
    }

    public static List<List<Integer>> combinationSum2(int[] c, int t) {
        Arrays.sort(c);
        Set<List<Integer>> li = new HashSet<>();
        combinations(0, c, new ArrayList<>(), li, t);
        
        return new ArrayList<>(li);
    }

    private static void combinations(int i, int[] a, ArrayList<Integer> l, Set<List<Integer>> li, int t) {

        if (i == a.length) {
            if (t == 0){
                li.add(new ArrayList<>(l));
            }
            return;
        }

        if (a[i] <= t) {
            l.add(a[i]);
            combinations(i + 1, a, l, li, t - a[i]);
            l.remove(l.size() - 1);
        }
        combinations(i + 1, a, l, li, t);
    }
}
