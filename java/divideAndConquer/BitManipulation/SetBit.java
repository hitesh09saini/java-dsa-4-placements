package java.divideAndConquer.BitManipulation;

public class SetBit {
    public static void main(String[] args) {
        int n = 10;
        setBit(n, 2);
    }

    private static void setBit(int n, int i) {
        int bitmas  = 1<<i;
        System.out.println(n|bitmas);
    }
}
