
public class firstOcc {
    public static void main(String[] args) {
        int arr[] ={1,10,3,4,5};

        System.out.println(firstOCc(arr,0,11));
       
    }
    static int v = -1;
    private static int firstOCc(int[] arr, int i,int k) {
        if(i==arr.length-1)return v;

        if(arr[i] == k ) v =  i;

        return firstOCc(arr, i+1, k);
    }
}
