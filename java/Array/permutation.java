import java.util.ArrayList;
import java.util.Collections;

public class permutation {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        System.out.println(a);
        permute(a, 0);
        System.out.println(list);

    }

   static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

   public static void permute(ArrayList<Integer> a, int i) {
        if (i == a.size()) {
            list.add(new ArrayList<>(a)); 
            return;
        }

        for (int j = i; j < a.size(); j++) {
            // swap
            Collections.swap(a, i, j);
            permute(a, i + 1);
            Collections.swap(a, i, j);
        }
    }
}
