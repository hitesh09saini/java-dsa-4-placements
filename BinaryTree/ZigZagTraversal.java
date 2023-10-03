package BinaryTree;

public class ZigZagTraversal {
    public static class Node{
        int data;
        Node left , right;

        Node(int i){
            this.data = i;
            left  = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(1);
        root.right.left = new Node(1);
        root.left.right = new Node(1);
        root.left.left = new Node(1);

        ZigZagTravesal(root);
    }

    private static void ZigZagTravesal(Node root) {

        if(root == null)return;

        
        

    }
}
