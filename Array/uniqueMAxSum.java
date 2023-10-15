import java.util.HashMap;
import java.util.Map;

public class uniqueMAxSum {
    public static void main(String[] args) {
        int arr[] = {42, 33, 60};

        System.out.println(maxSum(arr, arr.length));
        
    }

    private static int maxSum(int[] a, int n) {
      
        int ans = -1;-
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : a){
            int d = digitSum(num);
            if(map.containsKey(d)){
                int prevOne = map.get(d);
                ans = Math.max(ans, prevOne + num);
                map.put(d, Math.max(prevOne, num));
            }else{
                map.put(d, num);
            }
        }
        return ans;
    }

    private static int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }
}
