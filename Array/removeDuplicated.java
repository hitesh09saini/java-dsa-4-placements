import java.util.Arrays;

public class removeDuplicated {
    public static void main(String[] args) {
        int a[] = {1,1,2,3,4,5,5,2,};
        print(a,a.length);
       int n  = remove(a,a.length);
       print(a, n);
    
    }

    private static int remove(int[] a, int n) {
        if(n ==0)return 0;
        Arrays.sort(a);
        int c = 0;
        int k = 0;
        for(int i=0;i<n-1;i++){
            a[k] = a[i];
           if(a[i] != a[i+1]){
             c++;
             k++;
            }
        }c++;
        a[k] = a[n-1];

        return c;
    }

    private static void print(int[] a,int n) {
        for (int i = 0; i <n; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }
}
