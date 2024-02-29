import java.util.ArrayList;
import java.util.*;

public class t {
    ///////////////////////////////////////////////////////////////// maximum
    ///////////////////////////////////////////////////////////////// activity
    public static int maxactivity(int[] start, int[] end) {
        int max = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        int lastend = end[0];// constant for swiching btween activity
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastend) {
                max++;
                ans.add(i);
                lastend = end[i];
            }

        }
        for (int n : ans) {
            System.out.print(n);
        }
        return max;
    }

    ///////////////////////////////////////////////////////////////// maximum
    ///////////////////////////////////////////////////////////////// activity ins
    ///////////////////////////////////////////////////////////////// not sorted
    public static int maxactivityn(int[] start, int[] end) {
        int max = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        int act[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            act[i][0] = i;
            act[i][1] = start[i];
            act[i][2] = end[i];
        }
        Arrays.sort(act, Comparator.comparingDouble(o -> o[2]));

        int lastend = act[0][2];// constant for swiching btween activity
        for (int i = 1; i < end.length; i++) {
            if (act[i][1] >= lastend) {
                max++;
                ans.add(act[i][0]);
                lastend = act[i][2];
            }

        }
        for (int n : ans) {
            System.out.print(n);
        }
        return max;
    }

    /////////////////////////////////////////////////// fractional knapstack
    public static int knapstack(int val[], int weight[], int w) {
        double[][] ratio = new double[val.length][2];
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }
        // sort by assending
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalvalue = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int index = (int) ratio[i][0];
            if (capacity >= weight[index]) {
                finalvalue += val[index];
                capacity -= weight[index];

            } else {
                finalvalue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }

        }
        return finalvalue;

    }

    //////////////////////////////////////////////////////// minimum absolute
    //////////////////////////////////////////////////////// diffrence pair
    public static int absolute(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int minimum = 0;
        for (int i = 0; i < a.length; i++) {
            minimum += Math.abs(a[i] - b[i]);
        }
        return minimum;
    }

    ////////////////////////////////////////////////////// maximum length pair
    public static int maximumlength(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int chain = 1;
        int lastend = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > lastend) {
                chain++;
                lastend = pairs[i][1];
            }
        }
        return chain;
    }

    /////////////////////////////////////////////////// Indian coin
    public static ArrayList<Integer> indcoin(Integer[] coins, int amount) {
        Arrays.sort(coins, Comparator.reverseOrder());
        int count = 0;
        ArrayList<Integer> set = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    count++;
                    set.add(coins[i]);
                    amount -= coins[i];
                }

            }
        }
        return set;

    }

    /////////////////////////////////////////////////////////// job sequencing
    /////////////////////////////////////////////////////////// problem
    static class job {
        int id;
        int deadline;
        int profit;

        job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;

        }
    }

    /////////////////////////////
    public static void mjobs(int[][] jobinfo) {
        ArrayList<job> jobs = new ArrayList<>();
        for (int i = 0; i < jobinfo.length; i++) {
            jobs.add(new job(i, jobinfo[i][0], jobinfo[i][1]));

        }
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);// decending order soring

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }

        }
        System.out.println("jobs=" + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.println(seq.get(i) + 1);
        }
    }

    public static void choklate(Integer[] ver, Integer[] hor) {
        int n = 4;
        int m = 6;
        Arrays.sort(ver, Collections.reverseOrder());
        Arrays.sort(hor, Collections.reverseOrder());
        int h = 0, v = 0, hp = 1, vp = 1;
        int cost = 0;

        while (h < hor.length && v < ver.length) {
            if (ver[v] <= hor[h]) {
                cost += (hor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (ver[v] * h);
                vp++;
                v++;
            }
        }
        while (h < hor.length) {
            cost += (hor[h] * vp);
            hp++;
            h++;
        }
        while (v < ver.length) {
            cost += (ver[v] * hp);
            vp++;
            v++;
        }
        System.out.println("main cost of cou" + cost);
    }

    public static void main(String[] args) {

        Integer costVer[] = { 2, 1, 3, 1, 4 };
        Integer costHor[] = { 4, 1, 2 };
        choklate(costVer, costHor);
        // int jobinfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        // mjobs(jobinfo);
        // int pair[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        // System.out.println("chainlength=" + maximumlength(pair));

        // Integer[] coins = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        // for (int n : indcoin(coins, 574)) {
        // System.out.println(n);
        // }

        // int val[] = { 60, 100, 120 };
        // int weight[] = { 10, 20, 30 };
        // System.out.println(absolute(val, weight));
        // int w = 50;

        // System.out.println("knapstack=" + knapstack(val, weight, w));

        // int start[] = { 1, 3, 0, 5, 8, 5 };
        // int end[] = { 2, 4, 6, 7, 9, 9 };
        // System.out.println("max=" + maxactivityn(start, end));
    }
}
