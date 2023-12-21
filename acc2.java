public class acc2 {
    public static void main(String[] args) {
        System.out.println(isAnagram("Listen", "Silent"));
    }

    private static String isAnagram(String s, String s2) {
        s = s.toLowerCase();
        s2 =s2.toLowerCase();
        int n = 0;
        for(int i=0;i<s.length();i++){
           n += s.charAt(i)- s2.charAt(i);
        }
        return n==0?"Yes":"No";
    }
}
