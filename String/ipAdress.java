package String;

public class ipAdress {
    public static void main(String[] args) {
        String s = "1.1.1.1";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '.') {
                sb.insert(i, '[');
                sb.insert(i + 2, ']');
                i += 2; 
            }
        }
        System.out.println('1'-'3');

       
    }
}
