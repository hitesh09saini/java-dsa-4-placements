public class insertionSorting {

    public static void main(String[] args) {
        int a[] = { 5, 4, 1, 3, 2 };

        print(a);
        InsertionSort(a);
        print(a);
    }

    private static void InsertionSort(int[] a) {

        int n = a.length;
        for(int i =1;i<n;i++){
            int cur = a[i];
            int prev = i-1;

            // finding out correct position
            while(prev >= 0&& a[prev]> cur){

                a[prev+1] = a[prev] ;
                prev--;
            }

            // insertion

            a[prev+1]  =cur;

        }

    }

    private static void print(int[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
