import java.util.HashMap;

public class majorityElements {
    public static void main(String[] args) {
        int nums[] ={3,2 ,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
       HashMap<Integer, Integer> m = new HashMap<>();
       m.put(0, 0);
       for(int i: nums){
           m.put(i, m.getOrDefault(i, 0)+1);
       }

       int c = 0;
       for(int i : m.keySet()){
          if(m.get(i)>m.get(c)){
            c = i;
          }
       }

       return c;
    }
}
