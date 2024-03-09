import java.util.*;

import javax.sound.midi.MidiDevice.Info;

public class v {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    // public static int height(Node root) {
    // if (root == null)
    // return 0;
    // int lh = height(root.left);
    // int rh = height(root.right);

    // return Math.max(lh, rh) + 1;

    // }

    // static class Info {
    // int diam;
    // int high;

    // Info(int diam, int high) {
    // this.diam = diam;
    // this.high = high;
    // }
    // }

    // public static Info diameter(Node root) {
    // if (root == null) {
    // return new Info(0, 0);
    // }
    // Info leftd = diameter(root.left);
    // Info rightd = diameter(root.right);
    // int diam = Math.max(Math.max(leftd.diam, rightd.diam), leftd.high +
    // rightd.high + 1);
    // int ht = Math.max(leftd.high, rightd.high) + 1;
    // return new Info(diam, ht);
    // }

    // //////////////////////////////////////////////////// is subtree
    // public static boolean isIdentical(Node node, Node subRoot) {
    // if (node == null && subRoot == null) {
    // return true;
    // } else if (node == null || subRoot == null || node.data != subRoot.data) {
    // return false;
    // }
    // if ((!isIdentical(node.left, subRoot))) {
    // return false;
    // }
    // if ((!isIdentical(node.right, subRoot))) {
    // return false;
    // }
    // return true;

    // }

    // public static boolean issbtre(Node root, Node subroot) {
    // if (root == null) {
    // return false;
    // }
    // if (root.data == subroot.data) {
    // if (isIdentical(root, subroot)) {
    // return true;
    // }
    // }

    // return issbtre(root.left, subroot) || issbtre(root.right, subroot);
    // }

    ///////////////////////////////////////////////////// top view
    static class Infom {
        Node node;
        int hd;

        public Infom(Node node, int hd) {
            this.node = node;
            this.hd = hd;

        }
    }

    public static void topview(Node root) {
        Queue<Infom> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0;
        int max = 0;
        q.add(new Infom(root, 0));
        q.add(null);
        while (!q.isEmpty()) {
            Infom curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            }
            if (curr.node.left != null) {
                q.add(new Infom(curr.node.left, curr.hd - 1));
                min = Math.min(min, curr.hd - 1);
            }
            if (curr.node.right != null) {
                q.add(new Infom(curr.node.right, curr.hd - 1));
                max = Math.max(max, curr.hd + 1);
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.println(map.get(i).data);
        }
    }

    public static void main(String[] args) {
        v tee = new v();
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);

        v tree2 = new v();
        Node root1 = new Node(1);
        root1.left = new Node(2);

        root1.right = new Node(3);
        topview(root1);
        // System.out.println(diameter(root).diam);
        // System.out.println(diameter(root).high);
        // System.out.println(issbtre(root, root1));
    }
}
