
import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int a[] = {2,5,1,9,8,0};
        Arrays.sort(a);
        int k =5;
        System.out.println(largestNUm(a,k));
    }

    private static int largestNUm(int[] a,int k) {

        int s =0,e= a.length;

        while(s<=e){
             
            int m = (s+e)/2;

            if(a[m] >k){
                e = m-1;
            }
            if(a[m]<k){
                s = m+1;
            }
            if(a[m]==k){
                return m;
            }


        }

        return -1;
    }
}
