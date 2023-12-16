public class findOccurance {
    public static void main(String[] args) {
        int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int k =2;
        occurance(arr, k, 0, arr.length);
    }

    private static void occurance(int[] a, int k,int i,int n) {

        if(i == n)return;

        if(a[i] == k){
            System.out.print(i+" ");
        }

        occurance(a, k, i+1, n);
    }
    
}
