package java.LinkedList;

public class OELL {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int v) {
            this.val = v;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode li= new ListNode(1);
        li.next = new ListNode(2);
        li.next.next = new ListNode(3);
        li.next.next.next = new ListNode(4);
        li.next.next.next.next = new ListNode(5);
        System.out.println(length(li));

       
        Print(removeNthFromEnd(li, 2));
    }

    private static void Print(ListNode li) {

        while(li!=null){
            System.out.print(li.val+" ");
            li = li.next;
        }System.out.println();
    }

    public static ListNode oddEvenList(ListNode head) {
        if(head==null||head.next == null)return head;
        int inx = 0;
        ListNode h1= new ListNode(-1), t = h1, temp = head;
        while(temp != null){
          if(inx%2!=0){
              t.next = new ListNode(temp.val);
              t = t.next;
          }
          inx++;
          temp= temp.next;
        }

         // remove even
        temp = head; 
        while(temp.next != null&&temp.next.next!=null){
            temp.next = temp.next.next;
            temp = temp.next;
        }
  

        temp.next = h1.next;
        return head;

    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)return null;
        int l = length(head);
        if(l<n)return head;
        if(l==n)return head.next;
        int c =1;
        ListNode h = head;
        while(h != null){
           if(c == l-n && h.next != null){
               h.next = h.next.next;
           }c++;
           h = h.next;
        }

        return head;
    }

    public static int length(ListNode h){
        int c = 0;
        while(h!=null){
           c++;
           h= h.next;
        }
        return c;
    }
}
