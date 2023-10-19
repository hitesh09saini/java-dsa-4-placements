public class learn {
    
    public static void main(String[] args) {
        call(5);
    }

    private static void call(int i) {
        if(i <= 0)return ;
        System.out.println(i);
        call(i-1);
        
        call(i-1);
        
    }
}
