import java.util.*;

public class z {
    public static class Heap {
        public static ArrayList<Integer> arr = new ArrayList<>();

        public static void add(int data) {
            arr.add(data);
            int child = arr.size() - 1;
            int par = (child - 1) / 2;
            while (arr.get(par) > arr.get(child)) {
                int temp = arr.get(child);
                arr.set(child, arr.get(par));
                arr.set(par, temp);
                child = par;
                par = (child - 1) / 2;
            }
        }

        public static int peek() {
            return arr.remove(arr.size() - 1);

        }

        public static boolean isEmpty() {
            return arr.size() == 0 ? true : false;
        }

        public static void print() {
            while (!isEmpty()) {
                System.out.println(peek());
            }
        }

        public static int remove() {
            int data = arr.get(0);
            int temp = arr.get(0);
            arr.set(0, arr.size() - 1);
            arr.set(arr.size() - 1, temp);

            arr.remove(arr.size() - 1);
            hepify(0);
            return data;
        }

        private static void hepify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int root = i;
            if (left < arr.size() && arr.get(root) > arr.get(left)) {
                root = left;
            }
            if (right < arr.size() && arr.get(root) > arr.get(right)) {
                root = right;
            }
            if (root != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(root));
                arr.set(root, temp);
                hepify(root);
            }

        }

    }

    public static void heapify(int[] arr, int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;
        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }
        if (left < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }
        if (maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            heapify(arr, maxIdx, size);
        }

    }

    public static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);

        }
    }
    // public static class Student implements Comparable<Student> {
    // String name;
    // int rank;

    // Student(String name, int rank) {
    // this.name = name;
    // this.rank = rank;
    // }

    // @Override
    // public int compareTo(Student s2) {
    // return this.rank - s2.rank;
    // }

    // }
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int dista;

        public Point(int x, int y, int dista) {
            this.x = x;
            this.y = y;
            this.dista = dista;
        }

        @Override
        public int compareTo(Point s2) {
            return this.dista - s2.dista;
        }

    }

    static class Row implements Comparable<Row> {
        int solder;
        int index;

        public Row(int solder, int index) {
            this.index = index;
            this.solder = solder;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.solder == r2.solder)
                return this.index - r2.index;
            else
                return this.solder - r2.solder;
        }

    }

    public static void main(String[] args) {
        int army[][] = { { 1, 0, 0, 0 },
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 } };
        int k = 2;
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army.length; i++) {
                
               
                    count += army[i][j] == 1 ? 1 : 0;
                }
                pq.add(new Row(count, i));
            }
        }

        // ////////////////////////////////////////////////// roap cost
        // int ropes[] = { 2, 3, 3, 4, 6 };
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for (int i = 0; i < ropes.length; i++) {
        // pq.add(ropes[i]);
        // }
        // int cost = 0;
        // while (pq.size() > 1) {
        // int min = pq.remove();
        // int min2 = pq.remove();
        // pq.add(min + min2);
        // cost += min + min2;
        // }
        // System.out.println(cost);

        // int pts[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        // int k = 2;
        // PriorityQueue<Point> pq = new PriorityQueue<>();
        // for (int i = 0; i < pts.length; i++) {
        // int diss1 = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
        // pq.add(new Point(pts[i][0], pts[i][1], diss1));
        // }
        // for (int i = 0; i < k; i++) {
        // Point a = pq.remove();
        // System.out.println(a.x + " " + a.y);
        // }

        // int[] arr = { 1, 3, 4, 2, 5, 6, 9 };
        // heapSort(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }
        // Heap.add(4);
        // Heap.add(7);
        // Heap.add(8);
        // Heap.add(5);
        // // Heap.print();
        // Heap.remove();
        // System.out.println();
        // Heap.print();
        ////////////////////////////////////////// priority que for object
        // Student s1 = new Student("asf", 4);
        // Student s3 = new Student("asf", 3);
        // Student s2 = new Student("asf", 1);
        // Student s4 = new Student("asf", 2);

        // PriorityQueue<Student> pq = new PriorityQueue<>();
        // pq.add(s1);
        // pq.add(s2);
        // pq.add(s3);
        // pq.add(s4);

        // while (!pq.isEmpty()) {
        // System.out.println(pq.peek().name + " " + pq.peek().rank);
        // pq.remove();
        // }
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // pq.add(1);
        // pq.add(3);
        // pq.add(2);
        // pq.add(7);
        // pq.add(4);
        // while (!pq.isEmpty()) {
        // System.out.println(pq.peek());
        // pq.remove();
        // }
    }

}
