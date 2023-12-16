package java.number;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        PrimeRange(a);

    }

    private static void PrimeRange(int a) {
        for(int i=2;i<=a;i++){
          if(isPrimeOp(i)){
            System.out.println(i);
          }
        }
    }

    private static boolean isPrime(int a) {

        for (int i = 2; i < a; i++) {
            if (a % 2 == 0)
                return false;
        }

        return true;
    }

    private static boolean isPrimeOp(int a) {

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % 2 == 0)
                return false;
        }

        return true;
    }
}
