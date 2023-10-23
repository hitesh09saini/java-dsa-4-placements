public class update {

    public static void main(String[] args) {
        int a[] = { 3, 1, -2, -5, 2, -4 };

        Print(a);
        Print(update(a));
    }

    private static int[] update(int[] a) {

        int i = 0, j = 0,c=0;

         for(int v : a)if(v<0)c++;
         
         int po[] = new int[a.length-c];
         int na[] = new int[c];
         
        
        for (int k = 0; k < a.length;k++) {
            if(a[k]<0){
                na[i++] = a[k];
            }else{
                po[j++] = a[k];
            }
        }

           i =0;j=0;
        for(int  k = 0;k<a.length;k++){
            if(k%2==0){
                a[k] = po[i++];
            }else{
                a[k] = na[j++];
            }
        }

        return a;
    }

    private static void Print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
