public class missingNumbers {
    public static void main(String[] args) {
        int a[] ={2};
        // System.out.println(findKthPositive(a, 1));
        System.out.println(findKth(a, 1));
    }

    private static int findKth(int[] a, int k) {
        int l =0, h = a.length-1;

        while(l<=h){
            int m = (l+h)/2;
             int miss = a[m]-(m+1);
            if(miss<k){
                l = m+1;
            }else{
                h = m-1;
            }
        }   
        return k+h+1;
    }

    public static int findKthPositive(int[] a, int k) {
        int j =1;
        for(int i=0;i<a.length;i++,j++){
           while(j<a[i]){
             if(k==1)return j;
             j++;k--;
           }
        }
        if(k!=1)return k+j-1;
        return j;
    }
}
