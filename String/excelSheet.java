package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class excelSheet {
    public static void main(String[] args) {
        int a[] = {2,1,3,3,3,2};
        HashMap<Integer, Integer> map = new HashMap<>();

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                int v = map.get(a[i]);
                v++;
                map.replace(a[i], v);
            } else {
                map.put(a[i], 1);
            }
            
        }

        for (int v : map.keySet()) {

            for (int i = 0; i < map.get(v);) {

                List<Integer> li = new ArrayList<>();
                for (int j = 0; j < v; j++) {
                    li.add(v);
                    i++;
                }
                list.add(li);
            }

        }
        System.out.println(list);

    }
}
