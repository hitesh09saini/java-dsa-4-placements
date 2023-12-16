package java.LinkedList;

public class findMiddle {
    static class Node {
        int val;
        Node next;

        Node(int v) {
            this.val = v;
            next = null;
        }
    }

    public static void main(String[] args) {
            
        Node li= new Node(1);
        li.next = new Node(2);
        li.next.next = new Node(3);
        li.next.next.next = new Node(4);
        li.next.next.next.next = new Node(5);

        Node slow = li,fast = li;

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.val);
    }
}
