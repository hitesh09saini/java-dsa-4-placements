public class largestEle {
    public static void main(String[] args) {
        int a[] = {3,2,6,4,9,1};

        System.out.println(largest(a, a.length));
    }

    private static int largest(int[] a, int n) {
         int max = Integer.MIN_VALUE;
         for(int v :a)max = Math.max(max, v);
        return max;
    }
    
}
