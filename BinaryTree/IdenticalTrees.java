package BinaryTree;

public class IdenticalTrees {
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
       
         Node root1 = new Node(1);
        root1.left = new Node(1);
        root1.right = new Node(6);
        root1.left.left = new Node(1);


        System.out.println(IsIdenticals(root, root1));
    }

    private static boolean IsIdenticals(Node r, Node r1) {

        if(r1 == null&&r==null){
            return true;
        }

        if(r1==null||r==null||r1.data != r.data)return false;
       
        boolean l = IsIdenticals(r.left, r1.left);
        boolean rt = IsIdenticals(r.right, r1.right);

        if(l&&rt&&true){
          return true;
        }
        return false;
    }

}
