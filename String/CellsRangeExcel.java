package String;

import java.util.ArrayList;
import java.util.List;

public class CellsRangeExcel {

    public static void main(String[] args) {
        String s = "A1:F1";
        System.out.println(get(s));
    }

    private static List<String> get(String s) {
        List<String> li = new ArrayList<>();

        String sa[] = s.split(":");

        for (int i = 0; i < sa.length-1; i++) {

            int st = (int) (sa[i].charAt(1) - 48);
            int en = (int) (sa[i + 1].charAt(1) - 48);
            char sc = sa[i].charAt(0);
            char ec = sa[i+1].charAt(0);

            checkList(sc, ec, st, en, li);
        }

        return li;
    }

    private static void checkList(char sc, char ec, int st, int en, List<String> li) {

        for (char c = sc; c <= ec; c++) {
            for (int i = st; i <= en; i++) {
                li.add(c + "" + i);
            }
        }
    }

}
