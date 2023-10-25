import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class majorityEle {

    public static void main(String[] args) {
        int a[] ={1,2};
        System.out.println(majorityElement(a));
    }

     public static List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        List<Integer> li = new ArrayList<>();
        for(int v:nums){
            m.put(v, m.getOrDefault(v, 0 )+1);
        }

        for(int v: m.keySet()){
           if(m.get(v) > nums.length/3){
               li.add(v);
           }
        }

        Collections.sort(li);
        return li;
    }
    
}
