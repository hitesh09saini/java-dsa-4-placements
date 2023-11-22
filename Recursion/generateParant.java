import java.util.ArrayList;
import java.util.List;

public class generateParant {
    public static void main(String[] args) {
        int n = 3;
    
        System.out.println(generate(n));
    }
    
    private static List<String> generate(int n) {
        List<String> li = new ArrayList<>();
        generateAll(n, li, "", 0, 0);
        return li;
    }

    private static void generateAll(int n, List<String> li, String s, int open, int close) {
       if(s.length() == n*2){
        li.add(s);
        return ;
       }

       if(open< n){
        generateAll(n, li, s+"(", open+1, close);
       }

       if(close<open){
         generateAll(n, li, s+")", open, close+1);
       }
    }
    
}
