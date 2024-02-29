import java.util.LinkedList;

import javax.swing.text.html.StyleSheet;

import java.util.*;

public class s {
    // public static class queue {
    // static int arr[];
    // static int size;
    // static int rear;

    // queue(int n) {
    // arr = new int[n];
    // size = n;
    // rear = -1;
    // }

    // public static boolean isempty() {
    // return rear == -1;
    // }

    // public static void add(int data) {
    // if (rear == size - 1) {
    // System.out.println("queue is empty");
    // return;
    // }
    // rear = rear + 1;
    // arr[rear] = data;
    // }

    // public static int remove() {
    // if (queue.isempty()) {
    // System.out.println("queue is empty");
    // return -1;
    // }
    // int front = arr[0];
    // for (int i = 0; i < rear; i++) {
    // arr[i] = arr[i + 1];
    // }
    // rear = rear - 1;
    // return front;
    // }

    // public static int peek() {
    // if (queue.isempty()) {
    // System.out.println("queue is empty");
    // return -1;
    // }
    // return arr[0];
    // }

    // }

    // public static void main(String[] args) {
    // queue q = new queue(5);
    // q.add(5);
    // q.add(8);
    // q.add(9);
    // System.out.println(q.peek());

    // System.out.println(q.remove());
    // System.out.println(q.remove());
    // System.out.println(q.remove());

    // }
    //////////////////////////////////////////////// queqe is in circular

    // public static class queue {
    // static int arr[];
    // static int size;
    // static int rear;
    // static int front;

    // queue(int n) {
    // arr = new int[n];
    // size = n;
    // rear = -1;
    // front = -1;
    // }

    // public static boolean isempty() {
    // return rear == -1 && front == -1;
    // }

    // public static boolean isfull() {
    // return (rear + 1) % size == front;
    // }

    // public static void add(int data) {
    // if (isfull()) {
    // System.out.println("queue is full");
    // return;
    // }
    // if (front == -1)
    // front = 0;
    // rear = (rear + 1) % size;
    // arr[rear] = data;
    // }

    // public static int remove() {
    // if (queue.isempty()) {
    // System.out.println("queue is empty");
    // return -1;
    // }
    // int result = arr[front];

    // if (rear == front)
    // rear = front = -1;
    // else
    // front = (front + 1) % size;
    // return result;
    // }

    // public static int peek() {
    // if (queue.isempty()) {
    // System.out.println("queue is empty");
    // return -1;
    // }
    // return arr[front];
    // }

    // // }///////////////////////////////////////////////////queue using linked
    // list

    // static class node {
    // int data;
    // node next;

    // node(int data) {
    // this.data = data;
    // next = null;
    // }
    // }

    // public static class queue {
    // static node head = null;
    // static node tail = null;

    // public static boolean isEmpty() {
    // return head == null && tail == null;
    // }

    // public static void add(int data) {
    // node newnode = new node(data);
    // if (head == null) {
    // head = tail = newnode;
    // return;
    // }
    // tail.next = newnode;
    // tail = newnode;
    // }

    // public static int remove() {
    // if (head == null) {
    // System.out.println("empty");
    // return -1;
    // }
    // int fron = head.data;
    // if (tail == head) {
    // head = tail = null;
    // } else {
    // head = head.next;
    // }
    // return fron;
    // }

    // public static int peek() {
    // if (head == null) {
    // System.out.println("empty");
    // return -1;
    // }

    // int fron = head.data;

    // return fron;
    // }
    // }
    /////////////////////////////////////////////// collection queue
    // Queue<Integer> q = new LinkedList<>();

    // q.add(5);
    // q.add(8);
    // q.add(9);
    // System.out.println(q.peek());

    // System.out.println(q.remove());
    // System.out.println(q.remove());
    // System.out.println(q.remove());
    //////////////////////////////////////////// queue using two stack
    // public static class que {
    // static Stack s1 = new Stack<>();
    // static Stack s2 = new Stack<>();

    // public static boolean isempty() {
    // if (s1.empty()) {
    // return true;
    // }
    // return false;
    // }

    // public static void add(int n) {
    // if (s1.empty()) {
    // s1.add(n);
    // return;
    // } else {
    // while (!s1.empty()) {
    // s2.add(s1.pop());
    // }
    // s1.add(n);
    // while (!s2.empty()) {
    // s1.add(s2.pop());
    // }
    // }

    // }

    // public static int remove() {
    // if (isempty()) {
    // System.out.println("liat is empty");
    // return -1;
    // }
    // return (int) s1.pop();

    // }

    // public static int peek() {
    // if (isempty()) {
    // System.out.println("liat is empty");
    // return -1;
    // }
    // return (int) s1.peek();
    // }

    // }
    // public static class Stack {
    // static Queue<Integer> q1 = new LinkedList<>();
    // static Queue<Integer> q2 = new LinkedList<>();

    // public static boolean isEmpty() {
    // return q1.isEmpty() && q2.isEmpty();
    // }

    // public static void push(int data) {
    // if (q1.isEmpty()) {
    // q1.add(data);
    // } else {
    // q2.add(data);
    // }
    // }

    // public static int pop() {
    // if (isEmpty()) {
    // System.out.println("stack is empty");
    // return -1;
    // }
    // int top = -1;
    // if (!q1.isEmpty()) {
    // while (!q1.isEmpty()) {
    // top = q1.remove();
    // if (q1.isEmpty()) {
    // break;
    // }
    // q2.add(top);
    // }
    // } else {
    // while (!q2.isEmpty()) {
    // top = q2.remove();
    // if (q2.isEmpty()) {
    // break;
    // }
    // q2.add(top);
    // }}
    // return top;
    // }
    // public static int peek() {
    // if (isEmpty()) {
    // System.out.println("stack is empty");
    // return -1;
    // }
    // int top = -1;
    // if (!q1.isEmpty()) {
    // while (!q1.isEmpty()) {
    // top = q1.remove();

    // q2.add(top);
    // }
    // } else {
    // while (!q2.isEmpty()) {
    // top = q2.remove();

    // q2.add(top);
    // }}
    // return top;
    // }
    ///////////////////////////////////////////////////////////// nin repeting
    // chatrr in stram
    // public static void printnon(String str) {
    // int freq[] = new int[26];
    // Queue<Character> q = new LinkedList<>();
    // for (int i = 0; i < str.length(); i++) {
    // char ch = str.charAt(i);
    // q.add(ch);
    // freq[ch - 'a']++;
    // while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
    // q.remove();
    // }
    // if (q.isEmpty()) {
    // System.out.println("not found");
    // } else {
    // System.out.println("found=" + q.peek());
    // }

    // }

    // }
    ////////////////////////////////////////////// interlive
    public static void interlive(Queue<Integer> q) {
        Queue<Integer> fast = new LinkedList<>();
        int size = q.size();
        for (int i = 0; i < size / 2; i++) {
            fast.add(q.remove());
        }
        while (!fast.isEmpty()) {
            q.add(fast.remove());
            q.add(q.remove());
        }
    }

    //////////////////////////////////////////////// reversr que
    public static void reversr(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

    }

    public static void main(String[] args) {

        Queue<Integer> fast = new LinkedList<>();
        fast.add(8);
        fast.add(9);
        fast.add(10);
        fast.add(11);
        fast.add(12);
        fast.add(13);
        fast.add(14);
        fast.add(15);
        // interlive(fast);
        reversr(fast);
        while (!fast.isEmpty()) {
            System.out.println(fast.remove());
        }
        // String str = "aaavbsaeaer";
        // printnon(str);
        // que q = new que();
        // q.add(2);
        // q.add(5);
        // q.add(6);
        // q.add(8);

        // queue q = new queue();

        // q.add(5);
        // q.add(8);
        // q.add(9);
        // System.out.println(q.peek());

        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());

    }

}
