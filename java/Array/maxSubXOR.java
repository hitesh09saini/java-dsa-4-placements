public class maxSubXOR {

    public static void main(String[] args) {
        int a[] = {4,2,2,6,4};

        int b = 6;

        System.out.println(solve(a, b));
    }

    public static int solve(int[] A, int B) {
        int c = 0;
        int sum = A[0];
        for (int i = 1; i < A.length; i++) {
            if (sum == B)
                c++;
                System.out.println(sum);
            sum ^= A[i];
        }

        return c;
    }

}
