
public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = { 3, 2, 2, 3 };
        int n = removeTarget(nums, 3);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static int removeTarget(int[] nums, int t) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != t) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
