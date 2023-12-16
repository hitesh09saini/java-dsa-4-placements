package java.BinarySearchTree;

public class DuplicateSubtree {
    public static class Node {
        int data;
        Node left, right;

        Node(int i) {
            this.data = i;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(2);
        root.right.right.left = new Node(4);
        root.right.right.right = new Node(5);
        
       findDuplicate(root);
       System.out.println(c);
    }

    static int c =0;
    private static void findDuplicate(Node root) {
            
        if(root == null)return;

         if(check(root)){
            c++;
         }

        findDuplicate(root.left);
        findDuplicate(root.right);
    }
    private static boolean check(Node root) {
        if(root == null)return false;
        if(root.left != root.right )return false;
        return check(root.left)&&check(root.right);
    }
}
