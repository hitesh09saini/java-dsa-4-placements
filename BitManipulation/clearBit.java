package BitManipulation;

public class clearBit {
    public static void main(String[] args) {
        int n = 10;
        int p = 1;
        int bit = ~(1 << p);

        System.out.println(bit&n);

    }
}
