import java.util.ArrayList;
import java.util.List;

public class partission {
    public static void main(String[] args) {
        String s = "aab";
        System.out.println(partition(s));
    }

    public static List<List<String>> partition(String s) {

        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        func(0, s, path, res);
        return res;
    }

    private static void func(int inx, String s, List<String> path, List<List<String>> res) {
        if (inx == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = inx; i < s.length(); ++i) {
            if(isPalindrom(s, inx, i)){
                path.add(s.substring(inx, i+1));
                func(i+1, s, path, res);
                path.remove(path.size()-1);
            }
        }
    }

    private static boolean isPalindrom(String s, int inx, int i) {
        while(inx <= i){
            if(s.charAt(inx++)!= s.charAt(i--))return false;
        }
        return true;
    }
}
