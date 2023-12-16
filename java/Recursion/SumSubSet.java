
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumSubSet {
    public static void main(String[] args) {
        int a[] = { 4,4,4,1,4};
        Arrays.sort(a);
        Set<List<Integer>> l = new HashSet<>();

        Subset(a, l, new ArrayList<>(), 0);
        System.out.println(l);
    }

    private static void Subset(int[] a, Set<List<Integer>> l, List<Integer> li, int i) {

        if (i == a.length) {
            Collections.sort(li);
            l.add(new ArrayList<>(li));
            return;
        }

        li.add(a[i]);
        Subset(a, l, li, i + 1);
        li.remove(li.size() - 1);

        Subset(a, l, li, i + 1);
    }
}
