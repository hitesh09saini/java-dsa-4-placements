package String;

public class largestNum {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));
    }

    public static String largestOddNumber(String num) {
        int i = num.length()-1;
        while(i>=0){
            if((int)num.charAt(i)%2!=0)return num.substring(0,i+1);
            i--;
        }
        return "";
    }
}
