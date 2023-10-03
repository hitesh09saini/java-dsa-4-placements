package BinaryTree;

public class DiameterOfBinaryTre {
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

        System.out.println(DiameterApproch2(root).Diameter);

    }

    private static int Diameter(Node root) {

        if(root == null){
            return 0;
        }


        int l = Diameter(root.left);
        int r = Diameter(root.right);
        int v = Height(root.left)+Height(root.right)+1;

        return Math.max(Math.max(r, l),v);
    }

    private static int Height(Node root) {

        if(root == null){
            return 0;
        }

       int l = Height(root.left);
       int r = Height(root.right);

        return Math.max(l,r)+1;
    }


    public static class Info{
        int Height;
        int Diameter;

        Info(int h , int d){
            this.Diameter = d;
            this.Height = h;
        }

    }


    public static Info DiameterApproch2(Node root){

        if(root == null){
 
            return new Info(0, 0) ;
        }

        Info leftInfo = DiameterApproch2(root.left);
        Info righInfo = DiameterApproch2(root.right);

        int dia = Math.max(Math.max(leftInfo.Diameter, righInfo.Diameter),leftInfo.Height+righInfo.Height+1);
        int ht = Math.max(leftInfo.Height,righInfo.Height)+1;


        return new Info(ht, dia);

    }
}
