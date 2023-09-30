package number;

import java.util.Scanner;

public class n2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a= s.nextInt();
        int ans = 1;

        for(int i=a;i>=1;i--){
            ans *= i;
        }


        System.out.println(ans);

    }
    
}
