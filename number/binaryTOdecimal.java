package number;

import java.util.Scanner;

public class binaryTOdecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        // BinaryToDecimal(a);
        DecimalToBinary(a);
    }

    private static void DecimalToBinary(int a) {

        int ans = 0,p=0;
        while(a>0){

            ans += a%2*(Math.pow(10, p));
            p++;
            a = a/2;
        }
        System.out.println(ans);
    }

    private static void BinaryToDecimal(int a) {
        int ans =0;
        int p =0;
        while(a>0){
           ans += (a%10)*Math.pow(2, p);
           p++;
           a = a/10;
        }
        System.out.println(ans);

    }
}
