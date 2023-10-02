package String;

public class sortestPath {
    public static void main(String[] args) {
        String st = "WNEENESENNN";
        SortestPath(st);
    }

    private static void SortestPath(String st) {

        int x =0,y=0;
        for(int i=0;i<st.length();i++){

            if(st.charAt(i)=='W')x--;
            if(st.charAt(i)=='N')y++;
            if(st.charAt(i)=='S')y--;
            if(st.charAt(i)=='E')x++;

        }

        System.out.println(Math.sqrt(Math.abs(Math.pow(x, 2)+Math.pow(y, 2))));

       
    }
}
