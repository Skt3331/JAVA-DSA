public class l {
    // //////////////////////////////////////////////////// odd even
    // public static String oddeven(int a) {

    // return (a & 1) == 1 ? "odd" : "even";
    // }

    //////////////////////////////////////////////////// get ith bit
    public static int ithbit(int n, int b) {

        return (n & (1 << b)) > 0 ? 1 : 0;
    }

    //////////////////////////////////////////////////// set ith bit
    public static int setith(int n, int b) {

        return (n | (1 << b));
    }

    //////////////////////////////////////////////////// clear ith bit
    public static int clearbit(int n, int b) {
        return n & (~(1 << b));
    }

    //////////////////////////////////////////////////// update ith bit
    public static int updateith(int n, int b, int it) {

        return it == 0 ? clearbit(n, b) : setith(n, b);
    }

    ////////////////////////////////////////////////// clear last i bits
    public static int clearibits(int n, int b) {

        return n & (-1 << b);
    }

    // ///////////////////////////////////////////////////// clear range of bits
    // public static int clearrange(int n, int e, int s) {
    // int b = (1 << e) - 1;
    // int a = (~0) << (s + 1);
    // return n & (a | b);
    // }
    ///////////////////////////////////////////////////////// cheak number power
    // i=of 2 or not
    // public static boolean powe(int n) {
    // return (n & (n - 1)) == 0 ? true : false;
    // }
    //////////////////////////////////////////////////////// count bits in a number
    // public static int count(int n) {
    // int count = 0;
    // while (n > 0) {
    // if ((n & 1) != 0) {
    // count++;

    // }
    // n = n >> 1;
    // }
    // return count;
    // }

    /////////////////////////////////////////////////////////// fast exponencian
    public static int expo(int n, int e) {
        int ans = 1;
        while (e > 0) {
            if ((e & 1) != 0) {
                ans = ans * n;
            }
            n = n * n;
            e = e >> 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        //////////////////////////////////////////// bit manupulation binary left shift
        // System.out.println(5 << 2);
        // System.out.println(5 >> 2);
        // System.out.println("number is " + oddeven(8));
        // System.out.println(ithbit(8, 0));
        // System.out.println(setith(5, 1));
        // System.out.println(clearbit(5, 2));
        // System.out.println(updateith(7, 2, 0));
        // System.out.println(clearibits(7, 2));
        // System.out.println(clearrange(77, 1, 4));
        // System.out.println(powe(9));
        // System.out.println(count(15));
        System.out.println(expo(3, 4));
    }

}
