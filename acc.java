public class acc {
    public static void main(String[] args) {
        System.out.println(differenceOfSum(10, 3));
    }

    private static int differenceOfSum(int n, int m) {

        int divi = 0, div = 0;
        int v = m;

        for (int i = 1;; i++) {
            if (v * i > n)
                break;
            divi += v * i;
        }

        for (int i = 1; i <= n; i++) {
            if (i % m != 0) {
                div += i;
            }
        }

        return (div - divi);
    }

}
