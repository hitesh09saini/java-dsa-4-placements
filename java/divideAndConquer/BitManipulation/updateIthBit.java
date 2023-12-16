package java.divideAndConquer.BitManipulation;

public class updateIthBit {
    public static void main(String[] args) {
        int n = 10;
        int p = 1;

        // clear bit
        int bit = ~(1 << p);
        
        n = bit&n;

        int bitmask = 1<<p;

        System.out.println(n|bitmask);


    }

}
