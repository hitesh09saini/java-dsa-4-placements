import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int A[] = {2};
        System.out.println(missingNumber(A,2));
    }
    static int missingNumber(int a[], int n) {
        // Your Code Here
      
        Arrays.sort(a);
    
        for(int i=1;i<=n;i++){
            if(a[i-1]!= i)return i;
        }
        
        return -1;
    }
}
