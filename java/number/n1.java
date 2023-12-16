package java.number;

public class n1 {
    public static void main(String[] args) {
        int n = 10899;
        int v =0;
        
        while(n>0){
          
            v = (v*10)+n%10;
            n = n/10;
             System.out.println(v+" "+n);
        }
       
    }
}
