import java.util.*;

public class y {
    public static class Node {

        Node left;
        int data;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preorderr(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preorderr(root.left);
        preorderr(root.right);
    }

    public static ArrayList<Integer> ali = new ArrayList<>();

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        ali.add(root.data);
        inorder(root.right);
    }

    /////////////////////////////
    // sorted array to balance bst
    public static Node blt(int[] li, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(li[mid]);
        root.left = blt(li, st, mid - 1);
        root.right = blt(li, mid + 1, end);
        return root;
    }

    public static Node blte(ArrayList<Integer> li, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(li.get(mid));
        root.left = blte(li, st, mid - 1);
        root.right = blte(li, mid + 1, end);
        return root;
    }

    //////////////////// convert bst ro balance d bst
    public static Node balce(ArrayList<Integer> ai, Node root) {
        inorder(root);
        return blte(ai, 0, ai.size() - 1);
    }

    //////////////////////////////////////// find largest binary tree
    public static class info {
        boolean isbst;
        int size;
        int min;
        int max;

        info(boolean isbst, int size, int min, int max) {
            this.isbst = isbst;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int max = 0;

    public static info bigbst(Node root) {
        info leftinfo = bigbst(root.left);
        info rightinfo = bigbst(root.right);
        int size = leftinfo.size + rightinfo.size + 1;
        int min = Math.min(root.data, Math.max(leftinfo.min, rightinfo.min));
        int max = Math.max(root.data, Math.max(leftinfo.max, rightinfo.max));
        if (root.data <= leftinfo.max || root.data >= rightinfo.min) {
            return new info(false, size, min, max);
        }
        if (leftinfo.isbst && rightinfo.isbst) {
            max = Math.max(max, size);
            return new info(true, size, min, max);
        }
        return new info(false, size, min, max);

    }

    ////////////////////////////////////// murge 2 bst
    public static void inordere(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        inordere(root.left, arr);
        arr.add(root.data);
        inordere(root.right, arr);
    }

    public static Node merge(Node root1, Node root2) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        inordere(root1, a1);
        inordere(root2, a2);
        ArrayList<Integer> finall = new ArrayList<>();
        int i = 0, j = 0;
        while (i != a1.size() - 1 && j != a2.size() - 1) {
            if (a1.get(i) > a2.get(j)) {
                finall.add(a2.get(j));
                j++;
            } else {
                finall.add(a1.get(i));
                i++;

            }
        }
        while (i != a1.size() - 1) {
            finall.add(a1.get(i));
        }
        while (j != a2.size() - 1) {
            finall.add(a2.get(j));
        }
        return blte(finall, 0, finall.size() - 1);
    }

    public static void main(String[] args) {
        int[] a = { 3, 5, 7, 9, 10, 12, 13, 14, 16, 18, 52 };
        Node root = blt(a, 0, a.length - 1);
        // Node root1 = balce(ali, root);
        // preorderr(root1);
        System.out.println(bigbst(root).max);
    }
}
