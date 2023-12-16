
public class TraipingWater {

    public static void main(String[] args) {
        int a[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(TrapWater(a, a.length));
    }

    private static int TrapWater(int[] a, int n) {

        int max = Integer.MIN_VALUE;
        // left biggest
        int left[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                left[i] = a[i];
                max = a[i];
            }else{
                left[i] = max;
            }
        }
        // right biggest
        int right[] = new int[n];

        max = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (max < a[i]) {
                right[i] = a[i];
                max = a[i];
            }else{
                right[i] = max;
            }
        }

        // calculate
        int sum = 0;

        for(int i=0;i<n;i++){
            sum +=(Math.min(left[i], right[i])-a[i]);
        }

        return sum;
    }
}
