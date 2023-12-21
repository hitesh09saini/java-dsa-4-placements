import java.util.Arrays;

public class acc3 {

    public static void main(String[] args) {
        int arr[] = { 9,8,-7,3,9,3};
        System.out.println(ProductsSum(arr, 4));
    }

    private static int ProductsSum(int[] arr, int sum) {
        if (arr.length < 2)
            return -1;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] + arr[i + 1]) < sum) {
                return (arr[i]*arr[i+1]);
            }
        }
        return 0;
    }
}
