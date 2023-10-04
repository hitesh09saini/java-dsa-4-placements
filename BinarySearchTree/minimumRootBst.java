package BinarySearchTree;

public class minimumRootBst {
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

        System.out.println(Minimum(root));
    }

    private static int Minimum(Node root) {
        if (root == null)
            return -1;

        if (root.left == null)
            return root.data;

        return Minimum(root.left);
    }
}
