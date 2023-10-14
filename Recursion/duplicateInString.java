package Recursion;

public class duplicateInString {
    public static void main(String[] args) {
        System.out.println(removeDuplicate("appnnacollege", new StringBuilder(), 0));
    }

    public static boolean a[] = new boolean[26];

    private static String removeDuplicate(String s, StringBuilder sb , int i) {
        if(i == s.length())return sb.toString();

        if(!a[s.charAt(i)-'a']){
           a[s.charAt(i)-'a'] = true;
           sb.append(s.charAt(i));
        }
        return removeDuplicate(s, sb, i+1);
    }
}
