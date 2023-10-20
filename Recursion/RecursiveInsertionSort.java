public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int a[] = { 7, 4, 2, 8, 5, 1 };
        print(a);
        InsertionSort(a, 1, a.length);
        print(a);
    }

    private static void InsertionSort(int[] a, int i, int n) {

        if (i == n)
            return;
        int prev = i - 1;
        int curr = a[i];

        while (prev >= 0 && a[prev] > curr) {
            a[prev + 1] = a[prev];
            prev--;
        }
        a[prev + 1] = curr;
        InsertionSort(a, i + 1, n);
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }
}
