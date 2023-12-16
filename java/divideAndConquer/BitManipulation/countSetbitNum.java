package java.divideAndConquer.BitManipulation;

public class countSetbitNum {
   
    public static void main(String[] args) {
        int n = 15;
        System.out.println(Count(n));
    }

    private static int Count(int n) {

        int count =0;
        while(n>0){
            
            if((n&1)!=0)count++;
            n = n>>1;
        }

        return count;
    }
}
