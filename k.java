import java.util.Scanner;

public class k {
    /////////////////////////////////////////////////// palindriome string
    // public static boolean palindriome(String a) {
    // for (int i = 0; i < a.length() / 2; i++) {
    // if (!(a.charAt(i) == a.charAt(a.length() - i - 1))) {

    // return false;
    // }

    // }
    // return true;
    // }
    // // ////////////////////////////////////////////////find shortest path
    // public static Double spath(String a) {
    // int x = 0;
    // int y = 0;
    // for (int i = 0; i < a.length(); i++) {
    // if (a.charAt(i) == 'W') {
    // x--;
    // } else if (a.charAt(i) == 'E') {
    // x++;
    // } else if (a.charAt(i) == 'N') {
    // y++;
    // } else if (a.charAt(i) == 'S') {
    // y--;
    // } else {
    // System.out.println("invalid apth");
    // }
    // }
    // int result = ((x * x) + (y * y));
    // return Math.sqrt(result);
    // }
    ////////////////////////////////////////////////////////// largeat string
    // // lexicographicly
    // public static String large(String[] a) {
    // String lar = a[0];
    // for (int i = 1; i < a.length; i++) {
    // if (lar.compareTo(a[i]) < 0) {
    // lar = a[i];
    // }
    // }
    // return lar;
    // }

    /////////////////////////////////////////////////////// compress string
    // public static String compressed(String a) {
    // String cstr = "";
    // for (int i = 0; i < a.length(); i++) {
    // Integer count = 0;
    // while (i < a.length() - 1 && a.charAt(i) == a.charAt(i + 1)) {
    // count++;
    // i++;
    // }
    // cstr += a.charAt(i);
    // if (count > 1) {
    // cstr += count.toString();
    // }
    // }
    // return cstr;
    // }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in); m
        // String a = sc.nextLine();
        // System.out.println(a);
        // System.out.println(palindriome("mom"));
        // System.out.println(spath("WNEENESENNN"));
        ////////////////////////////////////////////////////////// == vs equals()
        // String a = "abcd";
        // String b = new String("abcd");
        // System.out.println(a == b);
        // System.out.println(a.equals(b));
        ////////////////////////////////////////////////////////// Substring
        // String b = new String("abcd");
        // System.out.println("substring=" + b.substring(1, 2));

        // String[] fruits = { "Apple", "Orange", "Banana", "Strawberry" };
        // System.out.println(large(fruits));

        // StringBuilder a = new StringBuilder("abhishek");
        // String a = "sdfsdf";
        // // a.append("dfdf");
        // System.out.println(a);
        // a = a.toUpperCase();

        // System.out.println(compressed("rrrrfffsrrrred"));

    }
}
