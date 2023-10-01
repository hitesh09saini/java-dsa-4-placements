package number;

public class palindrome {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(isPalindome(n));

    }

    private static boolean isPalindome(int n) {

        int v = 0,p=0, r= n;
        while (n > 0) {

            int s = n%10;
            v = (int) (v+s * Math.pow(10, p++));
            n = n/10;
        }
        System.out.println(v);

        if (v != r)
            return false;

        return true;
    }
}
