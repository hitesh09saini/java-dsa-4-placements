
public class reverse {
    public static void main(String[] args) {
        int a[] = {2,5,1,9,8,0};
        int ar[]=ReverseArr(a);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }

    private static int[] ReverseArr(int[] a) {

        int s = 0, e= a.length-1;

        while(s<e){

          
                // swap
                int t = a[s];
                a[s]= a[e];
                a[e] = t;
           
          s++;
          e--;

        }
        
        return a;
    }
}
