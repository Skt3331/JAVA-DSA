public class i { ///////////////////////////////////// buuble sort
    // public static int[] buublesort(int[] a) {
    // for (int i = 0; i < a.length - 1; i++) {
    // for (int j = 0; j < a.length - i - 1; j++) {
    // if (a[j] > a[j + 1]) {
    // int temp = a[j];
    // a[j] = a[j + 1];
    // a[j + 1] = temp;
    // }
    // }
    // }
    // return a;
    // }
    //////////////////////////////////////////////// // selsectoin sort
    // public static int[] selection(int[] a) {
    // for (int i = 0; i < a.length - 1; i++) {
    // int minpos = i;
    // for (int j = i + 1; j < a.length; j++) {
    // if (a[minpos] > a[j]) {
    // minpos = j;
    // }
    // }
    // int temp = a[minpos];
    // a[minpos] = a[i];
    // a[i] = temp;
    // }
    // return a;
    // }
    ///////////////////////////////////////////// // INsersion sort
    // public static int[] INsersion(int[] a) {
    // for (int i = 1; i < a.length; i++) {
    // int curr = a[i];
    // int prev = i - 1;
    // while (prev >= 0 && a[prev] > curr) {
    // a[prev + 1] = a[prev];
    // prev--;
    // }
    // a[prev + 1] = curr;
    // }
    // return a;
    // }
    ////////////////////////////////////////////////////// counting sort
    // public static int[] counting(int a[]) {
    // int large = Integer.MIN_VALUE;
    // for (int i = 0; i < a.length; i++) {
    // large = large > a[i] ? large : a[i];

    // }
    // int count[] = new int[large];
    // for (int i = 0; i < a.length; i++) {
    // count[a[i]]++;
    // }
    // // sorting
    // int j = 0;
    // for (int i = 0; i < count.length; i++) {
    // while (count[i] > 0) {
    // a[j] = i;
    // j++;
    // count[i]--;
    // }
    // }
    // return a;
    // }

    public static void main(String[] args) {
        int[] a = { 2, 4, 3, 1, 8 };
        // for (int d : buublesort(a)) {
        // System.out.println(d);
        // }
        // for (int d : selection(a)) {
        // System.out.println(d);}

        // for (int d : INsersion(a)) {
        // System.out.println(d);
        // }

        // for (int d : counting(a)) {
        // System.out.println(d);
        // }
    }
}
