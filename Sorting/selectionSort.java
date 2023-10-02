public class selectionSort {
    public static void main(String[] args) {
        int a[] ={5,4,1,3,2};

        print(a);
        Selection(a);
        print(a);
    }

    private static void print(int[] a) {

       for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
       }System.out.println();
    }

    private static void Selection(int[] a) {
        int n = a.length;
        for(int i =0;i<n;i++){
            // swap
            int inx = smallest(a,i ,n);
            int t = a[inx];
            a[inx] = a[i];
            a[i] = t;

        }
    }

    private static int smallest(int[] a, int i, int n) {

        int min = Integer.MAX_VALUE;
        int inx = 0;
        for(int j = i;j<n;j++){
            if(min>a[j]){
                min = a[j];
                inx = j;
            }
        }

        return min;
    }
}
