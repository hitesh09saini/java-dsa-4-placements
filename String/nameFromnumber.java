package String;

public class nameFromnumber {
    
    public static void main(String[] args) {
        int n = 28;
        System.out.println(ColumnName(n));
    }

    public static String ColumnName(int n){
        n = n-1;
        StringBuilder ans = new StringBuilder();
        
        while(n >= 1) {
            System.out.println((char)((int)(n%26) + 'A'));
            ans.append((char)((int)(n%26) + 'A'));
            n = (n/26)-1;
        }

        if(n == 0) ans.append((char)((int)(n%26) + 'A'));
        return ans.reverse().toString();
    }
}
