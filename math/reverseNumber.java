public class reverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int n) {
        long ans = 0;
        while (n != 0) {
            ans = 10 * ans + n % 10;
            n = n / 10;
        }

        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE)return 0;
        return (int)ans;
    }
}
