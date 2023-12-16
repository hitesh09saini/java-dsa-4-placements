public class duplicate {
    
    public static void main(String[] args) {
        int a[] = {3,3,7,7,10,11,11};
        System.out.println(find(a));
    }

    private static int find(int[] a) {
        
        int s  =0 , e = a.length-1;
        while(s<e){
            int m = s+(e-s)/2;
            if(m%2 == 1)m--;
            if(a[m] != a[m+1])e = m;
            else s = m+2;
        }
        return a[s];
    }
}
