package java.LinkedList;

public class deleteMiddle {
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
        
        // Print(deleteMiddle(li));

        System.out.println(num(li));      
        // Print(sortList(li));
    }

    private static void Print(ListNode li) {

        while(li!=null){
            System.out.print(li.val+" ");
            li = li.next;
        }System.out.println();
    }

    public static ListNode deleteMiddle(ListNode head) {
        if(head == null)return null;
        if(head.next == null)return head.next;
        ListNode slow = head,p=head, fast= head;
        while(fast != null&&fast.next != null){
            fast = fast.next.next;
            p = slow;
            slow = slow.next;   
        }
        p.next = slow.next;


        return head;
    }

    public static ListNode sortList(ListNode head) {
        if(head == null||head.next == null)return head;
        int n= num(head);
        for(int i= n;i>=1;i--){
            ListNode t = head;
            int c = 1;
            while(t != null && t.next != null){
                if(c == i)break;
                if(t.val > t.next.val){
                    int temp = t.val;
                    t.val = t.next.val;
                    t.next.val = temp;
                }
                t = t.next;
                c++;
            }
        }

        return head;
    }

    public static int num(ListNode h){
        int c = 0;
        while(h!=null){
            h = h.next;
            c++;
        }
      return c;
    }
}
