package BitManipulation;

public class getBit {


    public static void main(String[] args) {
        int n = 6;
        System.out.println(ithBit(10,3));
    }
    /*
     *   if num is 0010  we get 1 bit
     *   
     *   0010 >> 1 = 0001
     *   0001 & 0001 = 0001 = 1 is 1 
     *   if 
     *   0010 >> 2 = 0000
     *   0000 & 0001 = 0000 = 0 is 0 
     *    
     */

    private static int ithBit(int n, int i) {

         int v = (n>>i)&1;
        return v;
    }
}
