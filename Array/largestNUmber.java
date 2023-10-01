package Array;

public class largestNUmber {
    public static void main(String[] args) {
        int a[] = {2,5,1,9,8,0};
        System.out.println(largestNUm(a));
    }

    private static int largestNUm(int[] a) {

        int max = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            if(max<a[i])max = a[i];
        }

        return max;
    }
}
