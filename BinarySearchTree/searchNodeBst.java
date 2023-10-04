package BinarySearchTree;

public class searchNodeBst {
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

        System.out.println(isPresent2(root, 87));
    }

    private static boolean isPresent(Node root, int x) {

        if (root == null)
            return false;
        if (root.data == x)
            return true;
        return root.data > x ? isPresent(root.left, x) : isPresent(root.right, x);
    }

    private static boolean isPresent2(Node root, int x) {

        while (root != null) {
            if (root.data > x) {
                root = root.left;
            } else if (root.data < x) {
                root = root.right;
            } else {
                return true;
            }
        }

        return false;
    }
}
