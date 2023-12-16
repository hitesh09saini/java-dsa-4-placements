package java.BinarySearchTree;

public class medium {

    public static class Node {
        int data;
        Node left, right;

        Node(int i) {
            this.data = i;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(40);
        root.left.left = new Node(30);
        root.left.right = new Node(45);
        root.left.left.left = new Node(20);
        root.left.left.right = new Node(21);

        root.right = new Node(75);

        root.right.right = new Node(90);
        root.right.right.left = new Node(80);
        root.right.right.right = new Node(100);

         find(root, 7, 0);
    }

    static int c =0;

    private static int find(Node root, int k,int i) {
        
        if(root == null)return 0;

        find(root.left, k, i);
         c++;
         if(c==k){
            mediun(root,i);
            System.out.println(c+" "+root.data);
         }

        find(root.right, k, i);

        return i;
    }

    private static int mediun(Node root,int i) {
       
        if(root == null)return 0;


        i += root.data;
        mediun(root.left, i);
        mediun(root.right, i);
        return i;
    }

}
