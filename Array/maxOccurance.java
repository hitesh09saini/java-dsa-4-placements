
import java.util.HashMap;

public class maxOccurance {
    public static void main(String[] args) {
        int a[] = { 6, 5, 5 };
        System.out.println(majorityElement(a));
    }

    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i])) {
                int v = m.get(nums[i]);
                v++;
                m.replace(nums[i], v);
            } else {
                m.put(nums[i], 1);
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (m.get(nums[i]) > max) {

                max = m.get(nums[i]);
                ans = nums[i];
            }
        }

        System.out.println(m);

        return ans;

    }
}
