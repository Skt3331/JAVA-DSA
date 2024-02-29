public class m {
    ///////////////////////// print number in decending order

    public static void desn(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        desn(n - 1);

    }

    //////////////////////////////////// printn number in asssending
    public static void accen(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        accen(n - 1);
        System.out.println(n);
    }

    /////////////////////////////////////// print fact n
    public static int fact(int n) {
        int fac;
        if (n == 1) {
            return n;
        }
        fac = fact(n - 1) * n;
        return fac;
    }

    /////////////////////////////////// print sum of n natural number
    public static int sumn(int n) {
        if (n == 0)
            return n;
        int su = 0;
        su = n + sumn(n - 1);
        return su;
    }

    //////////////////////////////////////// febonaci serise
    public static int febonaci(int n) {
        if (n == 0 || n == 1)
            return n;
        int fnm1 = febonaci(n - 1);
        int fnm2 = febonaci(n - 2);
        int fe = fnm1 + fnm2;

        return fe;
    }/////////////////////////////////////// check array sorted or not

    public static boolean issorted(int a[], int i) {
        if (i == a.length - 1) {
            return true;
        }
        if (a[i] > a[i + 1]) {
            return false;

        }
        return issorted(a, i + 1);
    }
    //////////////////////////////////////////// fast occurance in arry

    public static int fastocr(int[] a, int key, int i) {
        if (i == a.length - 1)
            return -1;
        if (a[i] == key) {
            return i;
        }
        return fastocr(a, key, i + 1);

    }

    /////////////////////////////////////////// last occurance
    public static int lasrocr(int[] a, int k, int i) {

        if (i == a.length)
            return -1;
        int isfound = lasrocr(a, k, i + 1);
        if (isfound == -1 && a[i] == k) {
            return i;
        }
        return isfound;
    }

    ////////////////////////////////////////////// print x power n
    // public static int pow(int n, int p) {
    // if (p == 0) {
    // return 1;
    // }
    // int poww = pow(n, p - 1);
    // return n * poww;
    // }

    ////////////////////////////////////////// poer optimised
    public static int pow(int n, int p) {
        if (p == 0) {
            return 1;
        }
        int half = pow(n, p / 2);
        int halfsq = half * half;
        if (n % 2 != 0) {// if odd then multioply with itself

            halfsq = n * halfsq;
        }
        return halfsq;
    }

    ////////////////////////////////////////// taillling probli=en
    public static int tailing(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        // verticle
        int fnm1 = tailing(n - 1);
        // horixontal
        int fmn2 = tailing(n - 2);
        int totalway = fnm1 + fmn2;
        return totalway;
    }

    ////////////////////////////////////////// remove dublicate in srring
    public static void removed(String s, int i, String news, boolean[] a) {
        if (i == s.length()) {
            System.out.println(news);
            return;
        }
        char currChar = s.charAt(i);
        if (a[currChar - 'a'] == true) {
            removed(s, i + 1, news, a);
        } else {
            a[currChar - 'a'] = true;
            removed(s, i + 1, news + currChar, a);

        }
    }

    //////////////////////////////////////////// binary string
    public static void binary(int n, int last, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binary(n - 1, 0, str + "0");
        if (last == 0) {
            binary(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        // desn(10);
        // accen(10);
        // System.out.println(fact(5));
        // System.out.println(sumn(5));
        // System.out.println(febonaci(26));
        // int a[] = { 1, 3, 4, 5, 67, 68, 5 };
        // // System.out.println(issorted(a, 0));
        // // System.out.println(fastocr(a, 5, 0));
        // System.out.println(lasrocr(a, 5, 0));
        // System.out.println(pow(5, 2));
        // System.out.println(Math.pow(5, 5));

        // System.out.println(tailing(8));

        // removed("adsafasfds", 0, "", new boolean[26]);
        binary(3, 0, "");

    }

}
