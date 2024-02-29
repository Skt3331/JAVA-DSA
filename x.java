import java.util.*;

public class x {
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

    ////////////////////// build tree
    public static Node build(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (root.data < data) {
            root.right = build(root.right, data);
        } else {
            root.left = build(root.left, data);
        }
        return root;
    }

    ////////////////// inorder;
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + "->");
        inorder(root.right);
    }

    ////////////////////////////////// search in bst
    public static boolean isexist(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        boolean lh = isexist(root.left, key);
        boolean rh = isexist(root.right, key);
        return lh || rh;
    }

    ////////////////////////////////////////// delete a node
    public static Node delete(Node root, int key) {
        if (root == null) {

        }
        if (root.data < key) {
            root.right = delete(root.right, key);
        } else if (root.data > key) {
            root.left = delete(root.left, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {

                return root.left;
            }
            Node Is = findInorder(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);
        }
        return root;
    }

    public static Node findInorder(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    ///////////////////////////////////////// print in range
    public static void printin(Node root, int n1, int n2) {
        if (root == null) {
            return;
        }
        if (root.data >= n1 && root.data <= n2) {
            printin(root.left, n1, n2);
            System.out.println(root.data + "->");
            printin(root.right, n1, n2);
        } else if (root.data < n1) {
            printin(root.left, n1, n2);
        } else {
            printin(root.right, n1, n2);
        }
    }

    ////////////////////////////////// Root to leaf path
    public static void printarray(ArrayList<Integer> j) {
        for (int n : j) {
            System.out.print(n + "->");
        }
        System.out.println();
    }

    public static void path(Node root, ArrayList<Integer> rut) {
        if (root == null) {
            return;
        }
        rut.add(root.data);
        if (root.left == null && root.right == null) {
            printarray(rut);
        }
        path(root.left, rut);
        path(root.right, rut);
        rut.remove(rut.size() - 1);
    }

    /////////////////////////////////////// validate bst
    public static boolean isvalidbst(Node root, Node min, Node max) {
        if (root == null)
            return true;
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data)

        {
            return false;
        }
        return isvalidbst(root.left, min, root) && isvalidbst(root.right, root, max);
    }

    public static Node createMirror(Node root) {
        if (root == null) {
            return null;
        }
        Node leftSubtree = createMirror(root.left);
        Node rightSubtree = createMirror(root.right);

        root.right = leftSubtree;
        root.left = rightSubtree;
        return root;
    }

    public static void main(String args[]) {

        int[] a = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int n : a) {
            root = build(root, n);
        }
        inorder(root);
        // System.out.println(isexist(root, 9));
        // delete(root, 8);
        System.out.println();
        // printin(root, 5, 10);
        // inorder(root);
        // path(root, new ArrayList<>());
        // System.out.println(isvalidbst(root, null, null));
        Node root1=createMirror(root);
        inorder(root1);


    }
}
