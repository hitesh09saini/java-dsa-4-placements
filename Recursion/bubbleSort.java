
public class bubbleSort {
    public static void main(String[] args) {
        int a[] = { 3, 5, 1, 2, 4 };
        print(a);
        sort(a, a.length, 0, a.length - 1);
        print(a);
    }

    private static void sort(int[] a, int n, int i, int j) {

        if (i == j)
            return;

        // swaping
        if (a[i] > a[i + 1]) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }

        sort(a, n, i + 1, j);
        sort(a, n, i, j-1);

    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }
}
