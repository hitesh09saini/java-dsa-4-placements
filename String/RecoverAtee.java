package String;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class RecoverAtee {
    public static class Node {
        int data;
        Node left, right;

        Node(int d) {
            this.data = d;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        String t = "1-2--3--4-5--6--7";
        Node root = recoverTree(null);
        println(root);
    }

    static ArrayList<Integer> a = new ArrayList<>();

    private static void Recover(String t) {
        String[] nodes = t.split("-");
        for (String s : nodes) {
            if (s != "")
                a.add(Integer.parseInt(s));
        }

    }

    static Node root = new Node(a.get(0));

    public static Node recoverTree(String t) {
        Recover(t);
        print(root);
        return root;
    }

    static int i = 1;

    private static void print(Node root) {
        if (root == null)
            return;

        root.data = a.get(i);
        print(root.left);
        print(root.right);
    }

    private static void println(Node root) {
        if (root == null)
            return;

        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }
}
