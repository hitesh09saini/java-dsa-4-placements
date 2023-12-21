public class acc6 {
    public static void main(String[] args) {
        System.out.println(replaceCha("apples", 'a', 'p'));
    }

    private static String replaceCha(String s, char ch1, char ch2) {

        String st = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch1) {
                st += ch2;
            } else if (s.charAt(i) == ch2) {
                st += ch1;
            } else {
                st += s.charAt(i);
            }
        }

        return st;
    }
}
