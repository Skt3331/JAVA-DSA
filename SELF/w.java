import java.util.*;

public class w {
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

    public static void kth(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k - 1) {
            System.out.println(root.data + " ");
        }
        kth(root.left, level + 1, k);
        kth(root.right, level + 1, k);
    }

    /// level comman acceaster
    // public static boolean anc(Node root, int n, ArrayList<Node> path) {
    // if (root == null) {
    // return false;
    // }
    // path.add(root);
    // if (root.data == n) {
    // return true;
    // }
    // boolean leftf = anc(root.left, n, path);
    // boolean rightf = anc(root.right, n, path);
    // if (leftf || rightf) {
    // return true;
    // }
    // path.remove(path.size() - 1);
    // return false;
    // }

    // public static Node lca(Node root, int n, int n2) {
    // ArrayList<Node> path1 = new ArrayList<>();
    // ArrayList<Node> path2 = new ArrayList<>();
    // anc(root, n, path1);
    // anc(root, n2, path2);

    // int i = 0;
    // for (; i < path1.size() && i < path1.size(); i++) {
    // if (path1.get(i) != path2.get(i)) {
    // break;
    // }
    // }
    // Node lca = path1.get(i - 1);
    // return lca;

    // }
    ///////////////////// :Lca optimized
    public static Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node lef = lca(root.left, n1, n2);
        Node rig = lca(root.right, n1, n2);
        if (rig == null)
            return lef;
        if (lef == null)
            return rig;
        return root;
    }

    ///////////////////////////////// minimum sistance between two nodes
    public static int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        } else if (leftDist == -1) {
            return rightDist + 1;
        } else {
            return leftDist + 1;
        }
    }

    public static int minimum(Node root, int n1, int n2) {
        Node lca1 = lca(root, n1, n2);
        int d1 = lcaDist(lca1, n1);
        int d2 = lcaDist(lca1, n2);
        return d1 + d2;
    }

    ///////////////////////////////////////////// kth kancestor
    public static int kane(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftd = kane(root.left, n, k);
        int rigtd = kane(root.right, n, k);
        if (leftd == -1 && rigtd == -1) {
            return -1;
        }
        int max = Math.max(leftd, rigtd);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }

    ////////////////////////////////////////////// Transform to sum tree
    public static int trans(Node root) {
        if (root == null) {
            return 0;
        }
        int lefrd = trans(root.left);
        int righd = trans(root.right);
        int data = root.data;
        int newlef = root.left == null ? 0 : root.left.data;
        int newrig = root.right == null ? 0 : root.right.data;

        root.data = newlef + lefrd + newrig + righd;
        return data;
    }

    public static void preorder(Node root) {
        if (root == null) {
            System.out.print("-1 >");
            return;
        }
        System.out.print(root.data + " >");
        preorder(root.left);
        preorder(root.right);

    }

    public static void main(String[] args) {
        w tee = new w();
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.right.left = new Node(7);
        // kth(root, 0, 1);
        // System.out.println((lca(root, 4, 5)).data);
        // System.out.println(minimum(root, 5, 6));
        // kane(root, 4, 1);
        preorder(root);
        trans(root);
        System.out.println();
        preorder(root);

    }

}
