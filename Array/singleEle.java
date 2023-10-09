package Array;

import java.util.Arrays;

public class singleEle {
    public static void main(String[] args) {
        int a[] = { 4,4, 1, 1, 2 };
        System.out.println(singleNumber1(a));
    }


    // bitmanipulation approch 2

    private static int singleNumber1(int[] a) {
        int ans= a[0];
        for(int i =1;i<a.length;i++){
           ans ^= a[i];
        }
        return ans;
      
    }

//  approch 1
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0)
            return 0;

        for (int i = 0; i < nums.length; i++) {

            if ((i == 0 && nums[i] != nums[i + 1])) {
                return nums[i];
            } else if (i == nums.length - 1 && nums[i] != nums[i - 1]) {
                return nums[i];
            } else if (i != 0 && i != nums.length - 1 && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }

    
}
