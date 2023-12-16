
public class printSubArr {
    public static void main(String[] args) {
        int a[] = {2,5,1,9,8,0};
        print(a);
    }

    private static void print(int[] a) {
        for(int i=0;i<a.length;i++){
            for(int j =i+1;j<a.length;j++){
                for(int k =i;k<=j;k++){
                    System.out.print(a[k]+" ");
                }System.out.println();
            }
        }
    }
}
