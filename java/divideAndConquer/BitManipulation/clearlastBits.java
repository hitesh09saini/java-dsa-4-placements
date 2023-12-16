package java.divideAndConquer.BitManipulation;

public class clearlastBits {
    public static void main(String[] args) {
       System.out.println( clearBits(15, 2));
    }

    public static int clearBits(int n , int i){
        int bitmark = ~(0)<<i;


        return bitmark&n;
    }
}
