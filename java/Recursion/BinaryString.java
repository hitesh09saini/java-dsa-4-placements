
public class BinaryString {

    public static void main(String[] args) {
       PrintBinaryString(3, 0, "");
    }

    private static void PrintBinaryString(int n, int lastPlace, String str) {
        if(n ==0 ){
            System.out.println(str);
            return;
        }

            PrintBinaryString(n-1, 0, str+"0");
        if(lastPlace == 0){
            PrintBinaryString(n-1, 1, str+"1");
        }
    
    }

    
    
} 
