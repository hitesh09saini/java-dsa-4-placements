package String;

public class palindrom {
    
    public static void main(String[] args) {
        String s = "madam";

        System.out.println(isPalindrom(s,s.length()));
    }

    private static boolean isPalindrom(String st, int n) {

        int s = 0,e = n-1;
        while(s<=e){
            if(st.charAt(s)!=st.charAt(e)){
                   return false;
            }
            s++;e--;
        }

        return true;
    }
}
