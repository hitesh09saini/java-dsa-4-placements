public class ConvertIntoNum {
    public static void main(String[] args) {
        int v = 2019;
         StringBuilder st = new StringBuilder();
        convert(v, st);
        System.out.println(st);
    }

    public  static String []st = {"zero","one", "two","three","four","five","six","seven","eigth","nine"};

    private static void convert(int v, StringBuilder str) {
       if(v ==0)return;
       convert(v/10, str);
       str.append(st[v%10]+" ");
    }
}
