package BitManipulation;

public class ClearRangOfBit {
    
    public static void main(String[] args) {
        System.out.println(clearRange(10, 1,2));
    }

    private static int clearRange(int v, int i, int j) {

        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;  // 2^i -1

        int bitMask = a|b;

        return v & bitMask;
    }
}
