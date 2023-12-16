
import java.util.Arrays;

public class firsrtandLastPOsition {
    public static void main(String[] args) {
        int a[] = { 5, 7, 7, 8, 8, 10 };
        int t = 8;

        int get[] = GEt(a, t);
        for (int i = 0; i < get.length; i++) {
            System.out.print(get[i] + " ");
        }
    }

    private static int[] GEt(int[] a, int t) {

        int ans[] = new int[2];
        Arrays.fill(ans, -1);

        int s = 0, e = a.length - 1;

        while (s <=e) {
            if(a[s]==t&&a[e]==t){
              ans[0] = s;
              ans[1] = e;
              break;
            }else if(a[s]<t){
                s++;
            }else {
                e--;
            }
    
        }
        
        return ans;
    }
}
