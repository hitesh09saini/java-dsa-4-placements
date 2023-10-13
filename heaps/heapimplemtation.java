package heaps;

import java.util.ArrayList;

public class heapimplemtation {
    static class Heap {
        ArrayList<Integer> a = new ArrayList<>();

        // adding
        public void add(int data) {
            // add in last
            a.add(data);

            int x = a.size() - 1; // child inx
            int par = (x - 1) / 2; // par inx

            while (a.get(par) > a.get(x)) {
                // swaping
                int temp = a.get(x);
                a.set(x, a.get(par));
                a.set(par, temp);

            }

        }

        // peek value

        public int peek() {
            return a.get(0);
        }

        // remove value

        public int remove(){

            int v = a.get(0);

            a.remove(0);
            return v;
        }

    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(10);
        h.add(2);
        h.add(6);
        h.add(8);
        System.out.println(h.remove());
        System.out.println(h.remove());

    }
}
