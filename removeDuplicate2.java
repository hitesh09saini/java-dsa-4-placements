import java.util.Arrays;
import java.util.HashMap;

public class removeDuplicate2 {
    public static void main(String[] args) {
        int a[] = {1, 1, 1, 2, 2, 3 };
        int n = removeDuplicates(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int orderCount=1;
        int m=1;
        int k=2;
        if(nums.length == 0) return 0;

        for(int i=1;i<nums.length;i++){
            if (nums[i-1]==nums[i]){
                if(orderCount<k){
                    nums[m++]=nums[i];
                }
                orderCount++;
            }else{
                orderCount=1;
                nums[m++]=nums[i];
            }
        }
        return m;
    }
}
