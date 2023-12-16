public class BubbleSorting {
    public static void main(String[] args) {
        int a[] ={5,4,1,3,2};

        print(a);
        Bubble(a);
        print(a);
    }
    

    private static void print(int[] a) {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  " );
        }System.out.println();
    }

    // time complexcity is O(n2)

    private static void Bubble(int[] a) {

        int n = a.length;
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                // swap
                if(a[j]>a[j+1]){
                  int temp = a[j];
                  a[j]= a[j+1];
                  a[j+1] = temp;
                }
            }
        }

    }
}
