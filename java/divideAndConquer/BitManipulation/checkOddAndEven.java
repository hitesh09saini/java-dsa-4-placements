package java.divideAndConquer.BitManipulation;

public class checkOddAndEven {
    /*
     * 
     *   0 = 000
     *   1 = 001  <-
     *   2 = 010
     *   3 = 011  <-
     *   4 = 100
     *   5 = 101  <-
     * 
     *   we know odd num have lsb is 1
     * 
     *   lsb = 1 <- odd
     *   lsb = 0 <- even
     */
    
    public static void main(String[] args) {
        // System.out.println(3&(1));

        int n = 10;
        for(int i=1;i<=n;i++){
            if((i&1)==1){
               System.out.println(i);
            }
            
        }
    }
}
