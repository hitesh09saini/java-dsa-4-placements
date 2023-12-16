package java.divideAndConquer.BitManipulation;

public class checkIfIbits {

    public static void main(String[] args) {
        int n = 7;
        int k = 2;

        // System.out.println((n&(1<<k)) != 0);
        // System.out.println((n&1) == 0 ? "even": "odd");
        // System.out.println(((n&n-1)==0)?"power of two": "not");

        // int c = 0;
        // for(int i = 0;i<8;i++){
        // c+= (n&(1<<i)) != 0 ? 1: 0;
        // }
        // System.out.println(c);

        // ṣet/unset

        // if (n == 0) {
        //     n = 1; 
        // } else {
        //     n |= (n + 1);
        // }
        // System.out.println(n);
        System.out.println(divide(-1, 1));

    }

    public static int divide(int dividend, int divisor) {
        boolean isN = false;
        if(Integer.MAX_VALUE== dividend&& divisor == -1)return Integer.MIN_VALUE;
        if(Integer.MIN_VALUE== dividend&& divisor == 1)return Integer.MAX_VALUE;
        if(divisor<0||dividend<0)isN = true;
        if(divisor<0&&dividend<0)isN = false;
        int v = Math.abs(dividend);
        int d = Math.abs(divisor);
        
        int c = v/d;
        return isN?-c:c;
    }

}
