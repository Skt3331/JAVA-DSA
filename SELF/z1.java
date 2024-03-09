import java.util.*;
// import java.util.Map.Entry;

import javax.lang.model.type.IntersectionType;

// import java.util.ArrayList;
// import java.util.LinkedList;

import javax.swing.event.InternalFrameAdapter;

public class z1 {

    static class eHashMap<K, V> { // removwe eeee
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;

            }

        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public eHashMap() {// addddddddddddddddddddddd eee

            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node> old[] = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            // nodes add in bucket
            for (int i = 0; i < old.length; i++) {
                LinkedList<Node> ll = old[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }

        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda = n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].remove(di);
                N--;
                return node.value;

            } else {
                return null;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keyset() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }

            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }

        // public static void main(String[] args) {
        // HashMap<String, Integer> map = new HashMap<>();
        // map.put("pune", 87);
        // map.put("satara", 98);
        // map.put("sangli", 90);
        // /// get
        // System.out.println(map.get("pune"));
        // //// containd key
        // System.out.println(map.containsKey("sangli"));
        // // remove
        // System.out.println(map.remove("satara"));
        // // clear
        // // map.clear();
        // // is Empty
        // System.out.println(map.isEmpty());
        // // size
        // System.out.println(map.size());
        // /// Ireration on hashmap
        // Set<String> keys = map.keySet();
        // Iterator itr = keys.iterator();
        // while (itr.hasNext()) {
        // String a = itr.next();
        // System.out.println(map.get(a) + " " + a);
        // }
        // // foreach
        // for (String s : keys) {
        // System.out.println(map.get(s) + " " + s);
        // }

        // }

    }
    /////////////////////////////////////////////////////////////// valid anagram

    public static boolean annagram(String a, String b) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0) + 1);
        }
        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i))) {
                if (map.get(b.charAt(i)) == 1) {
                    map.remove(b.charAt(i));
                } else {
                    map.put(b.charAt(i), map.get(b.charAt(i)) - 1);
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        // HashMap<String, Integer> map = new HashMap<>();
        // map.put("pune", 87);
        // map.put("satara", 98);
        // map.put("sangli", 90);
        // /// get
        // System.out.println(map.get("pune"));
        // //// containd key
        // System.out.println(map.containsKey("sangli"));
        // // remove
        // System.out.println(map.remove("satara"));

        /////////////////// ::Linked hash map
        // LinkedHashMap<String,Integer> map=new LinkedHashMap<>()
        // // map.put("pune ", 34);
        // ///////////remain indsersion order
        // TreeMap<String,Integer> map1=new TreeMap<>();
        // ///////////store in sorted order
        // //Mejority ekement
        // int[] arr = { 1, 3, 2, 5, 1, 4, 1, 5, 1 };
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        // // if (hm.containsKey(nums[i])) {
        // // hm.put(nums[i],(hm.get(nums[i])+1));
        // // }
        // // else
        // // {
        // // hm.put(nums[i],0);
        // // }
        // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // }
        // Set<Integer> set = map.keySet();
        // for (Integer key : set) {
        // if (map.get(key) > arr.length / 3)
        // System.out.println(key);
        // }

        // System.out.println(annagram("samer", "mersa"));

        ///////////// Hash set

        HashSet<Integer> hs = new HashSet<>();
        // no dublicate
        // un order
        // null allwed
        // add(),Contains(),remove(); alll complexity := O(1)

        //////////// LinkedHash set

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        // no dublicate
        // ordered
        // null allwed
        // add(),Contains(),remove(); alll complexity := O(1)

        //////////// TreeSet

        TreeSet<Integer> ts = new TreeSet<>();

        // no dublicate
        // Sorted ordered
        // null allwed
        // add(),Contains(),remove(); alll complexity := O(1)

        // /// distict element
        // int[] nums = { 4, 2, 3, 4, 5, 6, 7, 3, 4, 2, 1 };
        // HashSet<Integer> ls = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        // ls.add(nums[i]);
        // }
        // System.out.println(ls.size());

        ////////////////// find union and intersection
        // int[] a = { 7, 3, 4 };
        // int b[] = { 6, 3, 9, 2, 9, 4 };
        // HashSet<Integer> ls = new HashSet<>();
        // for (int i = 0; i < a.length || i < b.length; i++) {
        // if (i < a.length)
        // ls.add(a[i]);
        // if (i < b.length)
        // ls.add(b[i]);
        // }
        // System.out.println("Union=" + ls);
        // ls.clear();
        // int count = 0;
        // for (int i = 0; i < a.length; i++) {
        // ls.add(a[i]);
        // }
        // for (int i = 0; i < b.length; i++) {
        // if (ls.contains(b[i])) {
        // ls.remove(b[i]);
        // count++;
        // }
        // }
        // System.out.println(count);

        /////////// find itineraryfrom string
        // String start = "";
        // HashMap<String, String> it = new HashMap<>();
        // it.put("Chennai", "Bengaluru");
        // it.put("Mumbai", "Delhi");
        // it.put("Goa", "Chennai");
        // it.put("Delhi", "Goa");
        // HashMap<String, String> itr = new HashMap<>();

        // for (String sr : it.keySet()) {
        // itr.put(it.get(sr), sr);
        // }
        // for (String sr : it.keySet()) {
        // if (!itr.containsKey(sr)) {
        // start = sr;
        // break;
        // }
        // }
        // System.out.print(start + "--->");
        // for (String sr : it.keySet()) {
        // System.out.print(it.get(start) + "--->");
        // start = it.get(start);
        // }
        ///////////// largest subaray sum is 0
        // int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        // HashMap<Integer, Integer> map = new HashMap<>();
        // // (sum,index)
        // int sum = 0;
        // int len = 0;
        // for (int j = 0; j < arr.length; j++) {
        //     sum += arr[j];
        //     if (map.containsKey(sum)) {
        //         len = Math.max(len, j - map.get(sum));
        //     } else {
        //         map.put(sum, j);
        //     }
        // }
        // System.out.println("largest length=" + len);
        

        ///////////subarray sum==k
        int arr[]={10,2,-2,-20,10};
        int k=-10;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[j];
            if(map.containsKey(sum-k))
            {
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1)
        }

    }

}
