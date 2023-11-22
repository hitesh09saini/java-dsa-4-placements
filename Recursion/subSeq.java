import java.util.ArrayList;
import java.util.List;

public class subSeq {
    
    public static void main(String[] args) {
        int a[] = {1,2,2,4,1,1};
        allSubSequence(0, a,new ArrayList<>(), 0, 2);
        System.out.println(li);
    }

    static List<List<Integer>> li = new ArrayList<>();
    private static void allSubSequence(int i, int[] a,List<Integer> l, int sum, int k) {
         if(i == a.length){
            if(sum == k)li.add(new ArrayList<>(l));
            return ;
         }
         l.add(a[i]);
         allSubSequence(i+1, a,l, sum+a[i], k);
         l.remove(l.size()-1);
         allSubSequence(i+1, a,l, sum, k);
    }
  
}
