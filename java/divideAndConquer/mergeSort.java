package java.divideAndConquer;

public class mergeSort {
    // nlogn
    public static void main(String[] args) {
        int a[] = { 6, 3, 9, 5, 2, 8 };

        print(a, a.length);
        mergeSort(a, 0, a.length - 1);
        print(a, a.length);
    }

    public static void print(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    private static void mergeSort(int[] a, int s, int e) {

        if (s >= e) {
            return;
        }

        int m = s + (e - s) / 2;
        mergeSort(a, s, m);
        mergeSort(a, m + 1, e);
        mergeArr(a, s, m, e);
    }

    private static void mergeArr(int[] a, int s, int m, int e) {
        int tmp[] = new int[e - s + 1];
        int i = s;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <= e) {

            if (a[i] < a[j]) {
                tmp[k] = a[i];
                i++;

            } else {
                tmp[k] = a[j];
                j++;

            }
            k++;

        }

        while (i <= m) {
            tmp[k] = a[i];
            k++;
            i++;
        }

        while (j <= e) {
            tmp[k] = a[j];
            k++;
            j++;
        }

        for(k = 0, i = s;k<tmp.length;i++,k++){
            a[i] = tmp[k];
        }

    }
}
