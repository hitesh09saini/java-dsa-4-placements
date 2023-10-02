package String;

public class StringCompress {
    public static void main(String[] args) {
        String s = "aaabbcccdd";
        System.out.println(compress(s,s.length()));
    }

    private static String compress(String s, int n) {

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            Integer c= 1;

            while(i<n-1&& s.charAt(i) == s.charAt(i+1)){
                c++;
                i++;
            }
            sb.append(s.charAt(i));
            if(c>0){
                sb.append(c);
            }
        }

        return sb.toString();
    }
    
}
