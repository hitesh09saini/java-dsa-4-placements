package LinkedList;

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
        
        Print(oddEvenList(li));
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
}
