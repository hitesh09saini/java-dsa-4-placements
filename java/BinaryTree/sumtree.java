package java.BinaryTree;

public class sumtree {
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
        

        System.out.println(isSumTree(root));

    }
    public static class Info {
    
        boolean b ;
        int d ;

        Info(boolean b,int d){
            this.b = b;
            this.d = d;
        }
        
    }

    public static Info helper(Node root){
        if(root == null)return new Info(true, 0);
        if(root.left == null&& root.right == null)return new Info(true, root.data);


        Info l = helper(root.left);
        Info r = helper(root.right);

        boolean lb= l.b;
        boolean rb = r.b;

        boolean ans = root.data == l.d+r.d;

        if(lb && rb && ans ){
            return  new Info(true, l.d+r.d+root.data);
        }

        return new Info(false,  0);

    }

    private static boolean isSumTree(Node root) {
        return helper(root).b;
    }
}
