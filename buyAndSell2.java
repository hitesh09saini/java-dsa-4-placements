public class buyAndSell2 {
    public static void main(String[] args) {
        int p [] = {7,1,5,3,6,4};

        System.out.println(maxProfit(p));
    }

    private static int maxProfit(int[] prices) {

        int buy = prices[0], ans = 0;

        for(int i=1;i<prices.length;i++){
            if(buy> prices[i]){
                buy = prices[i];
            }else{
                ans += prices[i]-buy;
                buy = prices[i];
            }
        }

        return ans;
    }
}
