public class FloydTriangle {

    public static void main(String[] args) {

        int v =1;
        for (int i = 0; i < 5; i++) {

            for (int j= 0; j < i; j++) {
              System.out.print(v++ +" ");
            }System.out.println();

        }
    }
}
