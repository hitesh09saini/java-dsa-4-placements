package Array;

public class KeySearchIn2Dmatrix {
    public static void main(String[] args) {
        int a[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        System.out.println(search(a, a.length, a[0].length, 29));
    }

    private static boolean search(int[][] a, int n, int m, int k) {

        int s = 0, e = m - 1;
        while (s < n && e >=0) {

            if (a[s][e] < k) {
                s++;
            }
            if (a[s][e] > k) {
                e--;
            }
            if (k == a[s][e]) {
                System.out.println(s + "  " + e);
                return true;
            }

        }

        return false;
    }
}
