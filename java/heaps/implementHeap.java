package java.heaps;

import java.util.ArrayList;

public class implementHeap {

    public static class Heap {
        ArrayList<Integer> a = new ArrayList<>();

        public void add(int data) {
            a.add(data);

            int par = (a.size() - 2) / 2;
            int x = a.size() - 1;

            while (a.get(x) < a.get(par) && par >= 0) {

                // swap
                int t = a.get(x);
                a.set(x, a.get(par));
                a.set(par, t);

                x = par;
                par = (x - 1) / 2;

            }

        }

        public int get() {
            return a.get(0);
        }

        public int delete() {
            // swap
            int t = a.get(0);
            a.set(0, a.get(a.size() - 1));
            a.set(a.size() - 1, t);

            // remove
            t =  a.remove(a.size()-1);

            // balance heap

            




            return t;
        }

    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(10);
        h.add(6);

        System.out.println(h.delete());
    
    }

}
