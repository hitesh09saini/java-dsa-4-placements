package Recursion;

public class fibnacciNum {
    public static void main(String[] args) {
        System.out.println(FibonacciBUm(6));
      
    }

    
    private static int FibonacciBUm(int n) {
        if(n==1 || n==0)return n;
        return FibonacciBUm(n-1)+FibonacciBUm(n-2);
    }

}
