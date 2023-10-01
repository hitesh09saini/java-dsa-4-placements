package Array;

public class TwiceAppears {
    public static void main(String[] args) {
        int a[] = {1,2,3,5,0,9,5};
        System.out.println(Twice(a,a.length));
    }

    private static boolean Twice(int[] a, int n) {
      
       for(int i =0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i!=j){
                
                if(a[i]==a[j])return true;
            }
        }
       }

        return false;

    }
}
