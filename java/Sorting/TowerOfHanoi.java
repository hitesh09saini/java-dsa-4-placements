public class TowerOfHanoi {
    public static void main(String[] args) {
        int d = 2;
        steps(d, "S", "H", "D");
        System.out.println(c);
    }

    static int c = 0;
    private static void steps(int disk, String s, String h, String d) {
         if(disk == 1){
            c++;
            System.out.println("transfer disk "+disk+" from "+s+" to "+d);
            return ;
         }

         steps(disk-1, s, d, h);
         c++;
          System.out.println("transfer disk "+disk+" from "+s+" to "+d);
         steps(disk-1, h, s, d);
     
    }
}
