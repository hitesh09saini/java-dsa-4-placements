import java.util.Arrays;

public class zigZag {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(convert(s, 3));
    }

    private static String convert(String s, int r) {
        String[] strArr = new String[r];
        Arrays.fill(strArr, "");
        int j = 0;
        int i;
        while(j < s.length()){
            i = 0;
            while(i < r && j < s.length()){
                strArr[i++] += s.charAt(j++);
            }
            i--;
            while(i > 1 && j < s.length()){
                strArr[--i] += s.charAt(j++);
            }
        }
        String res = "";
        for(String s1 : strArr){
            res += s1;
        }
        return res;
    }
}
