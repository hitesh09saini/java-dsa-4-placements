public class QuickSort {
    public static void main(String[] args) {
        int a[] = { 6, 3, 9, 8, 2, 5 };

        print(a);
        quickSort(a, 0, a.length - 1);
        print(a);
    }

    private static void quickSort(int[] a, int s, int e) {

        if (s >= e)
            return;
        int pi = partitation(a, s, e);
        quickSort(a, s, pi - 1);
        quickSort(a, pi + 1, e);
    }

    private static int partitation(int[] a, int s, int e) {
        int p = a[e];
        int i = s - 1;
        for (int j = s; j < e; j++) {
            if (a[j] <= p) {
                i++;
                // swap
                int t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }

        i++;
        // swap
        int t = p;
        a[e] = a[i];
        a[i] = t;
        return i;
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }
}
