import java.util.*;

public class p {
    //////////////////////////////////////////////// swap 2 number
    public static void swipee(ArrayList<Integer> f, int i, int l) {
        if (i > f.size() || i > f.size()) {
            return;
        }
        int temp = f.get(i);
        f.set(i, f.get(l));
        f.set(l, temp);

    }

    ///////////////////////////////////////////////////// sort arraylist
    public static void sort(ArrayList<Integer> list) {
        // Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());
    }

    //////////////////////////////////////////////////// multidimension arraay
    static ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
    static ArrayList<Integer> l1 = new ArrayList<>();
    static ArrayList<Integer> l2 = new ArrayList<>();
    static ArrayList<Integer> l3 = new ArrayList<>();

    static void add() {
        for (int i = 1; i < 6; i++) {
            l1.add(i * 1);
            l2.add(i * 2);
            l3.add(i * 3);
        }
        mainlist.add(l1);
        mainlist.add(l2);
        mainlist.add(l3);
    }

    ///////////////////////////////////////////////////// contain most water brute
    ///////////////////////////////////////////////////// forse
    public static int water(ArrayList<Integer> d) {
        int max = 0;
        for (int i = 0; i < d.size(); i++) {
            for (int j = i + 1; j < d.size(); j++) {
                int a = Math.min(d.get(i), d.get(j));
                int w = a * (j - i);
                max = Math.max(w, max);
            }
        }

        return max;
    }

    ///////////////////////////////////////////////////// contain most water 2
    ///////////////////////////////////////////////////// pointer
    public static int watertwo(ArrayList<Integer> d) {
        int max = 0;
        int i = 0, j = d.size() - 1;
        while (i != j) {
            int a = Math.min(d.get(i), d.get(j));
            int w = a * (j - i);
            max = Math.max(w, max);

            if (d.get(i) > d.get(j))
                j--;
            else
                i++;

        }
        return max;
    }

    //////////////////////////////////////////////////// found pair sum //brute
    //////////////////////////////////////////////////// forse
    public static boolean pairsum(ArrayList<Integer> lie, int key) {
        for (int i = 0; i < lie.size(); i++) {
            for (int j = 1; j < lie.size(); j++) {
                if (lie.get(i) + lie.get(j) == key)
                    return true;
            }
        }
        return false;
    }

    //////////////////////////////////////////////////// found pair sum //brute
    //////////////////////////////////////////////////// forse
    public static boolean pairsumn(ArrayList<Integer> lie, int key) {
        for (int i = 0; i < lie.size(); i++) {
            for (int j = 1; j < lie.size(); j++) {
                if (lie.get(i) + lie.get(j) == key)
                    return true;
            }
        }
        return false;
    }

    //////////////////////////////////////////////////// found pair sum //brute
    //////////////////////////////////////////////////// forse
    public static boolean pairsumpointer(ArrayList<Integer> lie, int key) {
        int i = 0, j = lie.size() - 1;
        while (i != j) {
            if (lie.get(i) + lie.get(j) == key) {
                return true;
            }
            if (lie.get(i) + lie.get(j) > key)
                j--;
            else
                i++;

        }
        return false;
    }

    ////////////////////////////////////////////////////// piar sum sorted ror=tetad
    ////////////////////////////////////////////////////// matrix
    public static boolean pairsumpointe(ArrayList<Integer> lie, int key) {
        int in = 0, ln = 0;
        for (int i = 0; i < lie.size() - 1; i++) {
            if (lie.get(i) > lie.get(i + 1)) {
                ;
                in = i + 1;
                ln = i;
                break;
            }
        }
        while (in != ln) {
            if (lie.get(in) + lie.get(ln) == key) {
                return true;
            }
            if (lie.get(in) + lie.get(ln) < key)
                in = (in + 1) % lie.size();
            else
                ln = (lie.size() + ln - 1) % lie.size();
        }
        return false;
    }

    public static void main(String args[]) {
        // add();
        // System.out.println(mainlist);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(60);
        list.add(63);
        list.add(64);
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(9);
        list.add(27);

        System.out.println(pairsumpointe(list, 58));
        // System.out.println(watertwo(list));
        // // swipee(list, 3, 5);
        // // sort(list);

        // for (int i = 0; i < list.size(); i++) {
        // System.out.println(list.get(i));

        ////////////////////////////////////////// Reverse an arrray
        // for (int i = 0; i < list.size(); i++) {
        // System.out.println(list.get(list.size() - i - 1));
        // }
        ///////////////////////////////////////////// find max in array
        // int max = 0;
        // for (int i = 0; i < list.size() - 1; i++) {
        // max = Math.max(list.get(i), list.get(i + 1));
        // }
        // System.out.println(max);

    }
}