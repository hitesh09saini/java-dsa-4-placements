public class rotateArray {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void rotate(int[] nums, int k) {
        /*
         * 1, 2, 3,| 4, 5 k = 2
         * 3, 2, 1,| 5, 4
         * 4, 5, 1, 2,
         */
        k = k%nums.length;

        int m = nums.length - k;
        reverse(nums, 0, m - 1);
        reverse(nums, m, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    
    }

    public static void reverse(int nums[], int s, int e) {
        while (s < e) {
            // swap
            int t = nums[s];
            nums[s] = nums[e];
            nums[e] = t;
            s++;
            e--;
        }
    }
}
