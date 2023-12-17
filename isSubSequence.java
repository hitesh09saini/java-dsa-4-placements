public class isSubSequence {

    public static void main(String[] args) {
        String s = "b", t = "abc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
       int n = s.length(),k=0;
        for (int i = 0; i < t.length() && k<s.length(); i++) {
           if(s.charAt(k)==t.charAt(i)){
             n--;
             k++;
           }
        }
        return n==0;
    }
}
