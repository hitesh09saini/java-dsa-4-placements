package java.divideAndConquer.BitManipulation;

public class checkPowerOfTwo {
    
    public static void main(String[] args) {
        System.out.println(checkPowerOfTwo(4));
    }

    private static boolean checkPowerOfTwo(int i) {

        /*
         *   4 = 100 , 3= 011  & 0000
         *   8 = 1000, 7 0111 & 0000 
         * 
         *  if ans is 0 then num is power of 2
         *   
         *  3 = 011 , 2 =010  & 010 not 0
         *   is not power of two
         * 
         */
      
        return (i&(i-1))==0;
    }
}
