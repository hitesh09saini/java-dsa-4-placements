import java.util.ArrayList;

public class leaders {

    public static void main(String[] args) {
        int a[] = {16,17,4,3,5,2};
         System.out.println(leaders(a, a.length));
    }

    static ArrayList<Integer> leaders(int a[], int n){
        // Your code here
         int s =0, e= n-1;
          ArrayList<Integer> li = new  ArrayList<>();
         
         while(s<=e){
             int  i = max(a, s, e);
                s = i+1;
             li.add(a[i]);
         }
        
         return li;
    }
    
    static int max(int a[], int s, int e){
        int max = s;
        for(int i = s;i<=e;i++){
            if(a[max] < a[i]){
                max = i;
            }
        }
        return max;
    }
    
}
