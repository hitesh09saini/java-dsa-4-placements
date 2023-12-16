public class p1 {
    public static void main(String[] args) {
        int n = 6;
        print(n);
    }

    private static void print(int n) {

        int num = 0;
        for (int i = 1; i <= n; i++) {
            num += i;
        }

        // print
        int v = num;
        System.out.println(v + " ");

        for (int i = 2; i <= n; i++) {
            v = v - i;
            int t = v;
            for (int j = 1; j <= i; j++) {

                System.out.print(v + " ");

                v++;
            }
            v = t;
            System.out.println();

        }
    }
}
