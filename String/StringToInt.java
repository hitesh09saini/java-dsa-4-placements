package String;

public class StringToInt {

    public static void main(String[] args) {
        System.out.println(myAtoi("     -41"));

    }

    public static int myAtoi(String s) {
        if (s.length() == 0)
            return 0;

        boolean neg = false;
        int ans = 0, i = 0;
        for (; i < s.length(); i++) {
            if (s.charAt(i) == '-')
                neg = true;
            if ((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57) {
                ans *= 10;
                ans += ((int) s.charAt(i) - 48);
            }
        }

        return neg ? -ans : ans;
    }
}
