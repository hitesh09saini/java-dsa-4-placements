package String;

import java.util.HashMap;
import java.util.PriorityQueue;

public class frq {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
     public static String frequencySort(String s) {
       HashMap<Character, Integer> frq  = new HashMap<>();
       for(int i=0;i<s.length();i++){
           frq.put(s.charAt(i), frq.getOrDefault(s.charAt(i), 0)+1);
       }
        
        String ans="";
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->(frq.get(b)-frq.get(a)));
        pq.addAll(frq.keySet());
        while(!pq.isEmpty()){
           char ch=pq.poll();
           for(int i=0; i<frq.get(ch); i++){
               ans+=ch+"";
           }
        }
        return ans;
    }
}
