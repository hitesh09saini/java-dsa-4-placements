public class TailingZero {
    public static void main(String[] args) {
        int N = 5;

        int count =  0;

        while(N>=5){
            count += N/5;
            N = N/5;
        }
        System.out.println(count);
    }
}
