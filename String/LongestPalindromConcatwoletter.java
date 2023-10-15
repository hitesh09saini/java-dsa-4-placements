package String;

import java.util.HashMap;

public class LongestPalindromConcatwoletter {
    public static void main(String[] args) {
        String s[] = {"ab","ty","yt","lc","cl","ab"};
        System.out.println(longestPalindrom(s));
    }

    private static int longestPalindrom(String[] s) {
        HashMap<String, Integer> m = new HashMap<>();

        for (String v : s) {
            m.put(v, m.getOrDefault(v, 0) + 1);
        }

        int l = 0;

        for (String v : s) {
            if (v.charAt(0) != v.charAt(1)) {

                String st = "" + v.charAt(1) + v.charAt(0);

                if (m.containsKey(st)) {
                    l += 4 * Math.max(m.get(st), m.get(v));
                    m.remove(st);
                    m.remove(v);
                }
            }

        }

        int max = Integer.MIN_VALUE;

        for (String key : m.keySet()) {
            if (key.charAt(0) == key.charAt(1)) {
                if (max < m.get(key)) {
                    max = m.get(key);
                }
            }
        }
        l += max * 2;

        for (String key : m.keySet()) {
            if (key.charAt(0) == key.charAt(1)) {
                if (m.get(key) % 2 == 0) {
                    l += 2 * m.get(key);
                }
            }
        }

        return l;
    }

}
