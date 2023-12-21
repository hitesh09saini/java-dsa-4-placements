import java.util.Arrays;

public class acc1 {

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 7, 5, 4 };
        System.out.println(largeSmallSum(arr));
    }

    private static int largeSmallSum(int[] arr) {
        int[] oddElements = new int[(arr.length + 1) / 2];
        int[] evenElements = new int[arr.length / 2];

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenElements[i / 2] = arr[i];
            } else {
                oddElements[i / 2] = arr[i];
            }
        }

        // Find the second smallest element at odd positions
        int secondSmallestOdd = findSecondSmallest(oddElements);

        // Find the second largest element at even positions
        int secondLargestEven = findSecondLargest(evenElements);

        // Return the sum of the second smallest at odd and second largest at even positions
        return secondSmallestOdd + secondLargestEven;
    }

    private static int findSecondSmallest(int[] arr) {
        Arrays.sort(arr);
        return arr[1];
    }

    private static int findSecondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }
}
