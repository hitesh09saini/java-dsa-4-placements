package java.BinarySearchTree;

public class creaetBst {
    public static class Node {
        int data;
        Node left, right;

        Node(int i) {
            this.data = i;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        int a[] ={1,2,3,4,5,6,7,8};
         Node root = CreateBst(a,a.length);
    }

    private static Node CreateBst(int[] a, int n) {
        if(n==0)return null;
        

        Node root = new Node(-1);
        
        return root;
    }
}
