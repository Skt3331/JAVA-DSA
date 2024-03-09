public class o {
    public static void print(int a[]) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    ///////////////////////////////////// print 1 to n -2 with back traking
    public static void disd(int n[], int i, int k) {
        if (n.length == i) {
            print(n);
            return;
        }
        n[i] = k;
        disd(n, i + 1, k + 1);
        n[i] = n[i] - 2;
    }

    /////////////////////////////// print subset of string
    public static void findsubset(String st, String ans, int n) {
        // base case
        if (n == st.length()) {
            if (ans == "")
                System.out.print("null");
            else
                System.out.println(ans);
            return;
        }
        // recursion
        findsubset(st, ans + st.charAt(n), n + 1);

        findsubset(st, ans, n + 1);
    }

    /////////////////////////////// permutation
    public static void permutation(String st, String ans) {
        if (st.length() == 0) {
            System.out.println(ans);
        }
        for (int i = 0; i < st.length(); i++) {
            String ste = st.substring(0, i) + (st.substring(i + 1));

            permutation(ste, ans + st.charAt(i));
        }
    }

    /////////////////////////////////////////////// Grid eays
    public static int gridways(int i, int j, int n, int m) {
        if (i == m - 1 && j == m - 1)
            return 1;
        else if (i == n || j == m)
            return 0;

        int w1 = gridways(i + 1, j, n, m);
        int w2 = gridways(i, j + 1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        // int[] a = new int[10];
        // disd(a, 0, 0);
        // print(a);
        // }
        String g = "abcd";
        // findsubset(g, "", 0);
        // permutation(g, "");
        System.out.println(gridways(0, 0, 3, 3));
    }
}
