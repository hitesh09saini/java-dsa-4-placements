package java.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ZIgZagTrav {
    public static class Node {
        int data;
        Node left, right;

        Node(int i) {
            this.data = i;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.right.left = new Node(5);
        root.left.right = new Node(6);
        root.left.left = new Node(7);

        ZigZagTravesal(root);

    }

    public static void ZigZagTravesal(Node root) {

        if (root == null)
            return;
        boolean ltor= true;
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();

        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> li = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node cur = q.remove();
                if (ltor) {
                    li.add(cur.data);
                } else {
                    li.add(0, cur.data);
                }
                if (cur.left != null)
                    q.add(cur.left);
                if (cur.right != null)
                    q.add(cur.right);
            }
        
            ltor = !ltor;
        
            for (int i : li) {
                res.add(i);
            }
        }
        
        System.out.println(res);

    }
}
