package String;

public class isPalind {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
  
        return checkPalindrome(s);
    }

    public static boolean checkPalindrome(String s) {
        int length = s.length();
        if (length <= 1) {
            return true;
        } else if (s.charAt(0) != s.charAt(length - 1)) {
            return false;
        } else {
            return checkPalindrome(s.substring(1, length - 1));
        }
    }

}
