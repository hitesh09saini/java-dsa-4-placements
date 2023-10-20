public class secondLargestArr {
    public static void main(String[] args) {
        int a[] ={3,1};
        System.out.println(secondLargest(a,a.length));
    }

    private static int secondLargest(int[] a, int n) {
        int max= Integer.MIN_VALUE;
        for(int v:a){
            if(max < v){
                max = v;
            }
        }

        int prev  = 0;
        for(int v:a){
            if(v<max && prev<v){
                prev  = v;
            }
        }
        return prev;
    }
}
