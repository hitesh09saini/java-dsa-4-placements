import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class charSum {
    public static void main(String[] args) {
        int a[] = {1,0,-1,0,-2,2};

        System.out.println(fourSum(a, 0));

    }

     public static List<List<Integer>> fourSum(int[] a, int t) {
        Set<List<Integer>>list  = new HashSet<>();
        Arrays.sort(a);
         int c = 0;
         for(int i=0;i<a.length;i++){
            if(a[i]>=0){
            continue;
            }
            else{
                c++;
            }

        }
        if(t<0 && c ==0) return new ArrayList<>(list);

         
        for(int i = 0;i<a.length-1;i++){
          for(int j = i+1;j<a.length;j++){
            int s = j+1, e = a.length-1;
             while(s<e){
               List<Integer>li = new ArrayList<>();
               int v = a[i]+a[j]+a[s]+a[e];
               if(v == t){
                 li.add(a[i]);
                 li.add(a[j]);
                 li.add(a[s]);
                 li.add(a[e]);
                 list.add(li);
                 s++;
               }else if(v>t){
                 e--;
               }else{
                 s++;
               }
             }
          }
        }

        return new ArrayList<>(list);
    }
}
