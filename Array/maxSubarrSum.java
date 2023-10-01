package Array;

public class maxSubarrSum {

    public static void main(String[] args) {
        int a[] = { 2, 5, 1, 9, 8, 0 };
        print(a);
    }

    private static void print(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum +=a[k];
                }
               if(max < sum)max = sum;
            }
        }
        System.out.println(max);
    }

}
