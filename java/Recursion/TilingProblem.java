
public class TilingProblem {
    public static void main(String[] args) {
        System.out.println(tiling(3));
    }

    public static int tiling(int n ){
        if(n == 0||n==1)return 1;

        int  fnm1  =  tiling(n-1);
        int  fnm2  =  tiling(n-2);

        return fnm1+fnm2;

    }
}
