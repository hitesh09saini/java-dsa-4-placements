
public class power {

    public static void main(String[] args) {
        System.out.println(powerOp(2, 4));
    }

    private static int powerOp(int v, int p) {

        if (p == 0)
            return 1;

        int po = power(v, p / 2) * power(v, p / 2);

        if (p % 2 != 0) {
            po = v * po;
        }

        return po;

    }

    private static int power(int v, int p) {

        if (p == 0)
            return 1;
        return power(v, p - 1) * v;
    }

}
