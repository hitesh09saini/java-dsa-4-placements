import java.util.Stack;

public class palindromLinkedLIst {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new  ListNode(2);
        head.next.next.next = new ListNode(1);


        System.out.println(isPalindrome(head));
        System.out.println(st.size());
    }

    static Stack<Integer> st = new Stack<>();

    public static boolean isPalindrome(ListNode head) {
        if (head == null)return true;

        if (!st.isEmpty() && st.peek() == head.val){
            st.pop();
        }else{
            st.push(head.val);
        }
        
        isPalindrome(head.next);

        return st.size() <= 1 ;
    }
}
