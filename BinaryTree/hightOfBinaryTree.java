package BinaryTree;

public class hightOfBinaryTree {
    public static class Node{
        int data;
        Node left , right;

        Node(int i){
            this.data = i;
            left  = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(1);
        root.right.left = new Node(1);
        root.left.right = new Node(1);
  
     
        System.out.println(Height(root));

    }

    private static int Height(Node root) {

        if(root == null){
            return 0;
        }

       int l = Height(root.left);
       int r = Height(root.right);

        return Math.max(l,r)+1;
    }
}
