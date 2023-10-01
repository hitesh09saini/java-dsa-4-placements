package Array;

public class miniJump {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        System.out.println(MIniJump(arr, arr.length));
    }

    private static int MIniJump(int[] a, int n) {

        int ans = 0, st = 0, end = 0;

        while (end < n-1) {
            ans++;
            int f = end;
            for(int i =st;i<=end;i++){
    
                f = Math.max(f, i+a[i]);

            }

            st = end+1;
            end = f;

        }

        if(n==1)return 0;

        return ans;
    }
}
