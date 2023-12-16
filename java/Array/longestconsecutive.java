import java.util.Arrays;

public class longestconsecutive {

    public static void main(String[] args) {
        int a[] = { 100,4,200,1,3,2 };

        System.out.println(longestConsecutive(a));
    }

    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        
        if (n == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int cnt = 1;
        int maxi = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    cnt++;
                } else {
                    maxi = Math.max(maxi, cnt);
                    cnt = 1;
                }
            }
        }

        return Math.max(maxi, cnt);

    }

    static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
