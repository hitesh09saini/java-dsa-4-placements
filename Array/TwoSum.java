import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int arr[] = { 2,7, 11, 15 };
        int target = 9;
        int a[] = {-1,-1};
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (m.containsKey(target - arr[i])) {
                System.out.println(target - arr[i]);
                 a = new int[] { m.get(target - arr[i]), i };
                 
            }
            m.put(arr[i], i);
        }
        System.out.println(a[0]+" "+a[1]);
    }

}
