package java.hashmap;

import java.util.HashMap;

class antiqueCollections {
    
    public static void main(String[] args) {
        int items[] = {1, 2, 2, 3};
        int price[] = {3, 4, 5,6};
        System.out.println(antiqueItems(4, items, price));
    }

  public static int antiqueItems(int n, int items[], int price[]){
        HashMap<Integer, Integer> m = new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(m.containsKey(items[i])){
                if(m.get(items[i])>price[i]){
                    m.replace(items[i], price[i]);
                }
            }else{
                m.put(items[i], price[i]);
            }
        }
        int c = 0;
        for(int i : m.values()){
           c+=i;
        }
        return c;
    }

}