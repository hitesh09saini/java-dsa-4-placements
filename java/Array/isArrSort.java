public class isArrSort {

    public static void main(String[] args) {
        int a[] = { 1, 2, 30, 4, 5, 6, 7 };
        System.out.println(isSorted(a));
    }

    private static boolean isSorted(int[] a) {
        int p = a[0];
        for (int v : a) {
            if (p > v) return false;
            p = v;
        }
        return true;
    }

}
