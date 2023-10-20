public class selectionSort {
    public static void main(String[] args) {
        int a[] = { 5, 2, 3, 1 };

        Print(a);
        sort(a, a.length);
        Print(a);
    }

    private static void sort(int[] a, int n) {
    
        for(int i= 0 ;i<n-1;i++){
            int v = i;
            for(int j= i+1;j<n;j++){
              if(a[v] > a[j]){
                 v = j;
              }
            }
            // swap

            int temp= a[v];
            a[v] = a[i];
            a[i] = temp;
        }
       

    }

  
    private static void Print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a + " ");
        }
    }
}
