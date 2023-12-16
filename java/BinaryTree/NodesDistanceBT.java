package java.BinaryTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NodesDistanceBT {

    public static class Node {
        int data;
        Node left, right;

        Node(int i) {
            this.data = i;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(7);
        root.right = new Node(24);

        root.left.left = new Node(4);
        root.left.right = new Node(3);

        root.left.right.left = new Node(1);
        

        System.out.println(find(root, 7, 2));
    }

    private static ArrayList<Integer> find(Node root, int node, int dis) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();

        Maping(root, 0, map);
        

        for(int v : map.keySet()) {
           int valu = map.get(v);
           if(valu == map.get(node)&& node != v){
              if(valu+map.get(node)-dis==0)a.add(v);
           }else{
              if(valu-map.get(node)-dis==0)a.add(v);
           }
        }
        
        Collections.sort(a);
        return a;
    }

    private static void Maping(Node root, int d, Map<Integer, Integer> map) {
        if (root == null)
            return;
        map.put(root.data, d);
        Maping(root.left, d + 1, map);
        Maping(root.right, d + 1, map);
    }
}
