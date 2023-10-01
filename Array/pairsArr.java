package Array;

public class pairsArr {
    
    public static void main(String[] args) {
        int a[] ={2,4,6,8,10};
        pair(a);
    }

    private static void pair(int[] a) {
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
               System.out.print("("+a[i]+", "+a[j]+")   ");
            }
        }
    }
}
