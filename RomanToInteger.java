import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "III";
        System.out.println(RomanTo(s));
    }

    private static int RomanTo(String s) {
        int ans = 0;
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println("ans:"+ans+" value:"+romanValues.get(s.charAt(i)));

            if (ans <= romanValues.get(s.charAt(i))) {
                ans += romanValues.get(s.charAt(i));
            } else {
                ans -= romanValues.get(s.charAt(i));
            }
        }

        return ans;
    }
}
