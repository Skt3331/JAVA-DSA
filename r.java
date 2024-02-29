import java.util.*;

public class r {
    ///////////////////////////////////////////////////////// stacj usin array list;
    // public static class Stack {
    // static ArrayList<Integer> ar = new ArrayList<>();

    // public static void push(int data) {
    // ar.add(data);
    // }

    // public static int pop() {
    // int r = ar.get(ar.size() - 1);
    // ar.remove(ar.size() - 1);
    // return r;
    // }

    // public static int peek() {
    // int r = ar.get(ar.size() - 1);
    // return r;
    // }
    // }

    // public static void main(String args[]) {
    // Stack r = new Stack();
    // r.push(1);
    // r.push(2);
    // r.push(3);
    // r.push(4);
    // System.out.println(r.peek());
    // r.pop();
    // System.out.println(r.peek());

    // }
    /////////////////////////////////////////////////////// stacj usin Linked list;
    // public static class Stack {
    // static LinkedList<Integer> li = new LinkedList<>();

    // public static void push(int data) {
    // li.addFirst(data);
    // }

    // public static int pop() {
    // return li.removeFirst();
    // }

    // public static int peek() {
    // return li.get(0);
    // }
    // }

    // public static void main(String args[]) {

    // Stack r = new Stack();
    // r.push(1);
    // r.push(2);
    // r.push(3);
    // r.push(4);
    // System.out.println(r.peek());
    // r.pop();
    // System.out.println(r.peek());
    // }
    //////////////////////////////////////////////// push at bottom in stack
    static Stack<Integer> s = new Stack<>();

    public static void pushbottom(Stack<Integer> s, int data) {
        if (s.empty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushbottom(s, data);
        s.push(top);

    }

    ///////////////////////////////////////////////////// print
    public static void print(Stack<Integer> s) {
        if (s.empty()) {
            System.out.println();
            return;
        }
        int l = s.peek();
        System.out.print(s.pop() + "->");
        print(s);
        s.push(l);

    }

    //////////////////////////////////////// reverse Stirng
    public static StringBuffer reverse(StringBuffer s) {
        Stack<Character> c = new Stack<>();
        int i = 0;
        while (s.length() != i) {
            c.push(s.charAt(i));
            i++;
        }
        s.delete(0, s.length());
        while (!c.isEmpty()) {
            s.append(c.pop());
        }
        return s;
    }

    ///////////////////////////////////////// reverese stack using recursion
    public static void reversestack(Stack<Integer> st) {
        if (s.isEmpty()) {
            return;
        }
        int top = st.pop();
        reversestack(st);
        pushbottom(st, top);

    }
    /////////////////////////////////////////// Stock span problem

    public static void stockspan(int stock[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stock.length; i++) {
            int cuurprice = stock[i];
            while (!s.isEmpty() && cuurprice > stock[s.peek()]) {
                s.pop();
            }
            if (s.empty()) {
                span[i] = i + 1;
            } else {
                int prevhigh = s.peek();
                span[i] = i - prevhigh;
            }
            s.push(i);
        }
    }

    /////////////////////////////////////////////////////////// Next grater element
    public static int[] nextgreater(int[] a, int b[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = a.length - 1; i >= 0; i--) {
            while (!s.empty() && a[s.peek()] <= a[i]) {
                s.pop();

            }
            if (s.isEmpty()) {
                b[i] = -1;
            } else {
                b[i] = a[s.peek()];
            }
            s.push(i);
        }
        return b;
    }

    //////////////////////////////////////////////////// valid parenthesis
    public static boolean isvalid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty())
                    return false;
                if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else
                    return false;
            }

        }
        return s.empty() ? true : false;
    }

    //////////////////////////////// dublicate parenthesis
    public static boolean isdublicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            } else {
                s.push(ch);
            }

        }
        return false;
    }

    public static int maximum(int arr[]) {
        int[] nsr = new int[arr.length];
        int[] nsl = new int[arr.length];
        int max = 0;
        // next smaller right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next dmaller left
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // current area
        for (int i = 0; i < arr.length; i++) {
            int hight = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int current = hight * width;
            max = Math.max(max, current);
        }
        return max;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maximum(arr));
        // int[] d = new int[arr.length];
        // for (int n : nextgreater(arr, d)) {
        // System.out.println(n);
        // }
        // System.out.println(isdublicate("((a+b))"));
        // System.out.println(isdublicate("((a+b)+(s+b))"));

        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.push(4);
        // s.push(5);
        // // print(s);
        // // pushbottom(s, 8);
        // // print(s);
        // // StringBuffer sb = new StringBuffer("saurav");
        // // System.out.println(reverse(sb));
        // print(s);
        // reversestack(s);
        // print(s);
        // int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        // int span[] = new int[stocks.length];
        // stockspan(stocks, span);
        // for (int n : span) {
        // System.out.println(n);
    }
}
