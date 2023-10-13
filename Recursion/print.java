package Recursion;

public class print {
    public static void main(String[] args) {
        print(6);
    }

    private static void print(int i) {
        if(i == 0)return;

        print(i-1);
        System.out.println(i);
    }
    
}
