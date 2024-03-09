public class j {
    ////// ////////////////////////////////////////////2d array find key
    // public static int find(int a[][], int key)

    // {
    // for (int i = 0; i < a.length; i++) {
    // for (int j = 0; j < a[0].length; j++) {
    // if (key == a[i][j])
    // return i + 100 * j;
    // }
    // }
    // return -1;
    // }
    ///////////////////////////////////////////////// print spriral matrix
    // public static void spiral(int[][] a) {
    // int sr = 0, sc = 0, er = a.length - 1, ec = a[0].length - 1;

    // while (sr <= er && sc <= ec) {
    // for (int i = sc; i <= ec; i++) {
    // System.out.print(a[sr][i] + " ");
    // }
    // for (int i = sr + 1; i <= er; i++) {
    // System.out.print(a[i][ec] + " ");
    // }
    // for (int i = ec - 1; i >= sc; i--) {
    // System.out.print(a[er][i] + " ");
    // }
    // for (int i = er - 1; i >= sr; i--) {
    // System.out.print(a[i][sc] + " ");
    // }

    // sc++;
    // sr++;
    // ec--;
    // er--;

    // }
    // }
    ////////////////////////////////////////////////////////// digonL SUM
    // public static int digonal(int[][] a) {
    // int sum = 0;
    // for (int i = 0; i < a.length; i++) {

    // sum += a[i][i];
    // if (i != a.length - 1 - i)
    // sum += a[i][a.length - i - 1];
    // }
    // return sum;
    // }
    ////////////////////////////////////////////////////////// searh in sorted
    // matrix
    public static boolean find(int a[][], int key) {
        int row = 0, col = a[0].length - 1;
        while (row < a.length && col >= 0) {
            if (a[row][col] == key) {
                System.out.println(row + " " + col);
                return true;
            } else if (key < a[row][col]) {
                col--;

            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int sortedb[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        // for (int i = 0; i < a.length; i++) {
        // for (int j = 0; j < a[0].length; j++) {
        // System.out.print(a[i][j] + " ");

        // }
        // System.out.println();
        // }
        // System.out.println(find(a, 6));
        // spiral(a);
        // System.out.print(digonal(a));
        System.out.println(find(a, 33));

    }
}
