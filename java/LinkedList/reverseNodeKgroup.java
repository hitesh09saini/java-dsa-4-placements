package java.LinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class reverseNodeKgroup {
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
      
       Print(reverseKGroup(li, 2));
    }

    private static void Print(ListNode li) {
        if(li == null)return ;
        System.out.print(li.val+" ");
        Print(li.next);
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }
    
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode start = temp;
        int count = 1;
    
        while (head != null) {
            
            if (count % k == 0) {
                start = reverse(start, head.next);
                head = start.next;
            } else {
                head = head.next;
            }
            count++;
        }
    
        return temp.next;
    }
    
    private static ListNode reverse(ListNode start, ListNode end) {
        ListNode prev = start.next;
        ListNode curr = prev.next;
    
        while (curr != end) {
            prev.next = curr.next;
            curr.next = start.next;
            start.next = curr;
            curr = prev.next;
        }
    
        return prev;
    }
    
}
