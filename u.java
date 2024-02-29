import java.util.*;

public class u {
    public static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    static int index = -1;

    public static node buildree(int[] a) {
        index++;
        if (a[index] == -1) {
            return null;
        }
        node Node = new node(a[index]);
        Node.left = buildree(a);
        Node.right = buildree(a);

        return Node;
    }

    ////////////////////////////////////// preorder
    public static void preorder(node root) {
        if (root == null) {
            System.out.print(" -> " + "-1");
            return;
        }
        System.out.print(" -> " + root.data);
        preorder(root.left);
        preorder(root.right);
    }

    ////////////////////////////////////// inorder
    public static void inorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);

    }

    /////////////////////////////////// post order
    public static void postorder(node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    /////////////////////////////////// level order ravelsal
    public static void levelorder(node root) {
        if (root == null)
            return;
        Queue<node> qu = new LinkedList<>();
        qu.add(root);
        qu.add(null);
        while (!qu.isEmpty()) {
            node currNode = qu.remove();
            if (currNode == null) {
                System.out.println();
                if (qu.isEmpty()) {
                    break;
                } else {
                    qu.add(null);
                }
            } else {
                System.out.println(currNode.data + " ");
                if (currNode.left != null) {
                    qu.add(currNode.left);
                }
                if (currNode.right != null) {
                    qu.add(currNode.right);
                }
            }
        }
    }

    /////////////////////////////////////////// hight of tree
    public static int height(node root) {
        if (root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;

    }

    ///////////////////////////////////////////// count of node in a tree
    public static int counter(node root) {
        if (root == null) {
            return 0;
        }
        int lc = counter(root.left);
        int rc = counter(root.right);

        return lc + rc + 1;

    }

    ////////////////////////////////////////// sum of nodes
    public static int sum(node root) {
        if (root == null) {
            return 0;
        }
        int ls = sum(root.left);
        int rs = sum(root.right);

        return ls + rs + root.data;
    }

    public static void main(String[] args) {

        int[] a = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        u tree = new u();
        node root = u.buildree(a);
        // tree.preorder(root);
        // tree.inorder(root);
        // tree.postorder(root);
        // tree.levelorder(root);
        // System.out.println(tree.height(root));
        // System.out.println(tree.counter(root));
        System.out.println(tree.sum(root));

    }
}
