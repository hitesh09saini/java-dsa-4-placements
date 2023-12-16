public class profitLoss {
    public static void main(String[] args) {
        int a[] = {7,1,5,3,6,4};
        System.out.println(profit(a));
    }
    private static int profit(int[] a) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int v:a){
            if(min > v)min = v;
            max = Math.max(max, v-min);
        }
        return max;
    }
}
