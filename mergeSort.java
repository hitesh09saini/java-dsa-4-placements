


public class mergeSort {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 3, 6 };
        mergeSortAlgo(arr, 0, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergeSortAlgo(int[] arr, int i, int j) {
        if (i >= j) {
            return;
        }

        int m = (i + j) / 2;
        mergeSortAlgo(arr, i, m);
        mergeSortAlgo(arr, m + 1, j);

        merge(arr, i, m, j);
    }

    private static void merge(int[] arr, int i, int m, int j) {
        int[] temp = new int[j - i + 1];
        int in = i;
        int jn = m + 1;
        int k = 0;

        while (in <= m && jn <= j) {
            if (arr[in] <= arr[jn]) {
                temp[k] = arr[in];
                in++;
            } else {
                temp[k] = arr[jn];
                jn++;
            }
            k++;
        }

        while (in <= m) {
            temp[k] = arr[in];
            in++;
            k++;
        }

        while (jn <= j) {
            temp[k] = arr[jn];
            jn++;
            k++;
        }

        for (int x = 0; x < temp.length; x++) {
            arr[i + x] = temp[x];
        }
    }

}
