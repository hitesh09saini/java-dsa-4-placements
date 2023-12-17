public class TwoSum2 {
    public static void main(String[] args) {
        int a[] = {2,3,4};
        int b[]= twoSum(a, 9);
        System.out.println(b[0]+" "+b[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i=0, j=numbers.length-1;
        while(i<=j){
            if(numbers[i]+numbers[j]==target){
                return new int[]{i+1, j+1};
            }else if(numbers[i]+numbers[j]>target){
                j--;
            }else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}
