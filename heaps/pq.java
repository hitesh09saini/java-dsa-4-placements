package heaps;

import java.util.PriorityQueue;
public class pq {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(20);
        pq.add(200);
        pq.add(222);
        pq.add(22);

        while(!pq.isEmpty()){
            System.out.print(pq.remove()+" ");
        }
    }
}
