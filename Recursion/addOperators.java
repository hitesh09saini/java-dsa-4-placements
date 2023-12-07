import java.util.ArrayList;
import java.util.List;

public class addOperators {
    public static void main(String[] args) {
        // Example usage
        List<String> result = add("232", 8);
        System.out.println(result);
    }

    static List<String> res;
    static int n;
    static String nu;
    static int t;

    public static List<String> add(String num, int target) {
        res = new ArrayList<>();
        nu = num;
        n = num.length();
        t = target;
        helper(0, 0, 0, new String());
        return res;
    }

    public static void helper(int idx, long total, long prev, String str) {
        if (idx == n) {
            if (total == t) {
                res.add(new String(str));
            }
            return;
        }

        for (int i = idx; i < n; i++) {
            String curr = nu.substring(idx, i + 1);
            long temp = Long.parseLong(curr);
 
            if (str.isEmpty()) {
                helper(i + 1, temp, temp, str + String.valueOf(temp));
            } else {
                helper(i + 1, total + temp, temp, str + "+" + curr);
                helper(i + 1, total - temp, -1 * temp, str + "-" + curr);
                helper(i + 1, total - prev + prev * temp, prev * temp, str + "*" + curr);
            }
            
            if (temp == 0) {
                break;
            }
        }
    }
}
