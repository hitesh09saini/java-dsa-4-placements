public class isPalindrom {
    
    public static void main(String[] args) {
        int x = 10;
       System.out.println(isPalindrome(x));
    }
    public static  boolean isPalindrome(int x) {
        if(x<0)return false;
        return x == reverse(x);
    }

    public  static int reverse(int n) {
        long ans = 0;
        while(n != 0){
         ans =10*ans+n%10;
         n = n/10;
        }
 
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE)return 0;
        return (int) ans ;
    }
}
