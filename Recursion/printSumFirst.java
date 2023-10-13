package Recursion;

public class printSumFirst {
    public static void main(String[] args) {
       System.out.println(SumNaturalNum(5));
    }

    private static int SumNaturalNum(int i) {
        if(i == 1)return 1;
        return i+SumNaturalNum(i-1);
    }
}
