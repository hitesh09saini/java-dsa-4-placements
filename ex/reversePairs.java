package ex;
public class reversePairs {

    public static void main(String[] args) {
        int a [] ={2,4,3,5,1};
        // System.out.println(pairs(a));
        int c =0;
        devide(a, 0, a.length);
   
    }

    // O(n^2)
    private static int pairs(int[] a) {

        int c =0;
        for(int i =0;i<a.length-1;i++){
            for(int j =i+1;j<a.length;j++){
                if(a[i] > a[j]*2)c++;
            }
        }

        return c;
    }
    
     public static void devide(int a[], int s , int e){

        if(s>= e)return;
        int m = s+(e-s)/2;
        devide(a, s, m);
        devide(a, m+1, e);

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

}
