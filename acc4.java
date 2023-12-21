public class acc4 {
    public static void main(String[] args) {
      
        System.out.println(DectoNBase(21,5678));
    }

    private static String DectoNBase(int n, int num) {
        if (!(1 < n && n <= 36)) {
            throw new IllegalArgumentException("Base n should be between 2 and 36 inclusive.");
        }

        if (num < 0) {
            throw new IllegalArgumentException("Input number should be a positive integer.");
        }

        if (num == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        String symbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while (num > 0) {
            int remainder = num % n;
            result.insert(0, symbols.charAt(remainder));
            num = num / n;
        }

        return result.toString();
    }
}
