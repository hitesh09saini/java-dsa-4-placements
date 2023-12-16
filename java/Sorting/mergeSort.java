public class mergeSort {
    public static void main(String[] args) {
        int a[] = { 7, 4, 5, 3, 2 };
        Print(a);
        sort(a, 0, a.length - 1);
        Print(a);
    }

    // divide
    private static void sort(int[] a, int s, int e) {
        if (s >= e)
            return;

        int m = s + (e - s) / 2;
        sort(a, s, m);
        sort(a, m + 1, e);
        merge(a, s, m, e);

    }

    private static void merge(int[] a, int s, int m, int e) {
        int temp[] = new int[e - s + 1];

        int i = s;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <= e) {
            if (a[i] > a[j]) {
                temp[k++] = a[j++];
            } else {
                temp[k++] = a[i++];
            }
        }

        // if left exist

        while (i <= m) {
            temp[k++] = a[i++];
        }

        // if right exist
        while (j <= e) {
            temp[k++] = a[j++];
        }

        for (k = 0, i = s; k < temp.length; k++, i++) {
            a[i] = temp[k];
        }

    }

    private static void Print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
