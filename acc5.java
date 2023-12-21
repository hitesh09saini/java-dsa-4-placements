public class acc5 {
    public static void main(String[] args) {
        System.out.println(sum(23, 563));
    }

    private static int sum(int n1, int n2) {
        int ans = 0, carry = 0;

        while (n1 > 0 || n2 > 0) {
            int l = n1 % 10;
            int r = n2 % 10;
            int sum = l + r + carry;

            if (sum >= 10) {
                carry = 1;
                ans++;
            } else {
                carry = 0;
            }

            n1 /= 10;
            n2 /= 10;
        }

        return ans;
    }
}
