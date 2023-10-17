import java.util.HashMap;

import java.util.Map;

public class Fraction {
    public static void main(String[] args) {
        int n = 16;
        int d = 13;
        System.out.println(solve(n,d));
    }

    private static String solve(int n, int d) {
 
        StringBuilder ans = new StringBuilder(Integer.toString(n / d));
        
        int rem = n % d;
        if (rem == 0)  return ans.toString();
        
        ans.append('.');
        Map<Integer, Integer> m = new HashMap<>();
        
        while (rem != 0) {
            if (m.containsKey(rem)) {
                ans.insert(m.get(rem), "(");
                ans.append(')');
                break;
            } else {
                m.put(rem, ans.length());
                int temp = (rem * 10) / d;
                ans.append(temp);
                rem = (rem * 10) % d;
            }
        }
 
        return ans.toString();
    }
    
}
