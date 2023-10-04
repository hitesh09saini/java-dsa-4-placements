package BinarySearchTree;

public class IsBst {
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

        root.right = new Node(81);
        root.right.left = new Node(42);
        root.right.left = new Node(87);
        root.right.left.right = new Node(66);
        root.right.left.right.left = new Node(45);

        root.right.right = new Node(87);
        root.right.right.right = new Node(90);

        System.out.println(isBST(root));
    }

    
    private static boolean isBST(Node root) {

       return isValid(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

     public static boolean isValid(Node root , int min , int max){
        if(root==null){
            return true;
        }
        
        if(root.data<=min || root.data>=max){
            return false;
        }
        
        return isValid(root.left,min,root.data) && isValid(root.right,root.data,max);
    }
    
}
