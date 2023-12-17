public class removeDuplicatesSortArr {
    public static void main(String[] args) {
        int nums[] ={0,0,1,1,1,2,2,3,3,4};
        System.out.println(remove(nums));
    }

    private static int remove(int[] nums) {
        if(nums.length<=1)return 0;
        int k =0;
        for(int i=1;i<nums.length;i++){
             if(nums[k] != nums[i]){
                k++;
                nums[k] = nums[i];
             }
        }

        return k+1;
    }
}
