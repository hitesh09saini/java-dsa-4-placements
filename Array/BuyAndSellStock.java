
public class BuyAndSellStock {
    public static void main(String[] args) {
        int stocks[] = {7,1,5,3,6,4};

        System.out.println(Profit(stocks, stocks.length));
    }

    private static int Profit(int[] stocks, int n) {

        int buy = Integer.MAX_VALUE;
        int sell = Integer.MIN_VALUE;

        // buy
        int bi =0,si=0;
        for(int i =0;i<n;i++){
            if(buy >stocks[i]){  
                buy = stocks[i];
                bi = i;
            }

        }

        // selling

         for(int i =bi;i<n;i++){
            if(sell<stocks[i]){
                sell  =  stocks[i];
                si = i;
            }
        }


        return (sell-buy)<0?0:sell-buy;
    }
}
