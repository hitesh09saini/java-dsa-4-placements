
public class friendPairingProb {
    public static void main(String[] args) {
        System.out.println(friendPairs(2));
    }

    private static int friendPairs(int n) {

        if(n == 1||n==2)return n;
        return friendPairs(n-1)+(n-1)*friendPairs(n-2);
    }
}
