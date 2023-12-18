public class bestTimeBuySellStock {
    public static void main(String[] args) {
        int n[] = { 2,4,1 };
        System.out.println(maxProfit(n));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
          minPrice = Math.min(minPrice, prices[i]);
          maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}
