public class reverseWords {
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        int i = s.length()-1;
        StringBuilder ans = new StringBuilder();
        while(i>=0){
            while(i >= 0 && s.charAt(i) ==' ') i--;
            int j=i;
            if(i<0)  break;
            while(i >= 0 && s.charAt(i) !=' ') i--;
            if(ans.isEmpty()){
            ans = ans.append(s.substring(i+1,j+1));
            }else{
             ans = ans.append(" "+s.substring(i+1,j+1));
            }
        } return ans.toString();
    }
}
