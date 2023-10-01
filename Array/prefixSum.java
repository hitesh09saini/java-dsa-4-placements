package Array;

public class prefixSum {
    public static void main(String[] args) {
        int a[]={ 2, 5, 1, 9, 8, 0 };
    
        System.out.println(prefixSum(a));
    }

    private static int prefixSum(int[] a) {

        int pr[] =new int[a.length];
        pr[0] = a[0];
        for(int i=1;i<a.length;i++){
            pr[i] = a[i]+pr[i-1];
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){

               int c = i==0?pr[j]:pr[j]-pr[i-1];

                if(max<c){
                    max= c;
                }

            }
        }

        

        return max;
    }
    
}
