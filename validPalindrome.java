public class validPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {

        int l = 0, r = s.length() - 1;
        char ll, rr, character;
        
        while (l < r) {

            // forward
            character = s.charAt(l);
            if ((character >= '0' && character <= '9') || (character >= 'a' && character <= 'z')
                    || (character >= 'A' && character <= 'Z')) {
                ll = (character >= 'A' && character <= 'Z') ? Character.toLowerCase(character) : character;
            } else {
                l++;
                continue;
            }
            // end
            character = s.charAt(r);
            if ((character >= '0' && character <= '9') || (character >= 'a' && character <= 'z')
                    || (character >= 'A' && character <= 'Z')) {
                rr = (character >= 'A' && character <= 'Z') ? Character.toLowerCase(character) : character;
                ;
            } else {
                r--;
                continue;
            }

            // equal
            if (ll == rr) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}
