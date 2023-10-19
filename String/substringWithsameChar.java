package String;

import java.util.HashMap;

public class substringWithsameChar {
    public static void main(String[] args) {
        System.out.println(countSubstringWithEqualEnds("abc"));
    }
    
    static int countSubstringWithEqualEnds(String s) {
        // code here
        
        HashMap<Character, Integer> m = new HashMap<>();
        
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            m.put(c,m.getOrDefault(c, 0)+1);
            
        }
        
        
        int sum = 0;
        for(int v : m.values()){
               sum += v>1?v*v-1:v;
        }
        
        return sum;
    }
}
