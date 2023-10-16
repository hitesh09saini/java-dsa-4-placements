public class lengthOfString {
    public static void main(String[] args) {
        String s = "hdbhjfbev";
        System.out.println(length(s));

    }

    private static int length(String s) {
        if (s.equals(""))
            return 0;
        else
            return length(s.substring(1)) + 1;
    }
}
