package String;

public class reverseWord {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int st = n - 1, e = n;

        while (st >= 0) {
            while (st >= 0 && s.charAt(st) == ' ') {
                st--;
            }
            e = st + 1;

            while (st >= 0 && s.charAt(st) != ' ') {
                st--;
            }

            sb.append(s.substring(st + 1, e));

            if (st >= 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
