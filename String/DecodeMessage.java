package String;

import java.util.HashMap;

public class DecodeMessage {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String mess = "vkbs bs t suepuv";

        System.out.println(decode(key, mess));

    }

    private static String decode(String key, String mess) {

        StringBuilder st = new StringBuilder();
        HashMap<Character, Character> set = new HashMap<>();
        char c = 'a';
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) != ' '&& !set.containsKey(key.charAt(i))) {
                set.put(key.charAt(i), c);
                System.out.println(key.charAt(i)+" "+c);
                c++;
            }
        }

        for (int i = 0; i < mess.length(); i++) {
            if (mess.charAt(i) != ' ') {
                st.append(set.get(mess.charAt(i)));
            } else {
                st.append(" ");
            }
        }

        return st.toString();
    }
}
