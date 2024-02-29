class q {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    static int size = 0;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public static void print() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    ///////////////////////////////////////////// add midle of ll
    public static int adds(int data, int index) {
        if (index > size) {
            return -1;
        }
        Node newnNode = new Node(data);
        Node temp = head;
        while (size <= index - 1) {
            temp = temp.next;
            index++;
        }

        newnNode.next = temp.next;
        temp.next = newnNode;
        size++;
        return 1;

    }

    //////////////////////////////////////// Remove fast.inll
    public static int rmfast() {
        if (size <= 1)

        {
            head = null;
            tail = null;
            size = 0;
        }
        int r = head.data;
        head = head.next;
        size--;

        return r;
    }

    public static int rmlast()

    {
        if (size <= 1)

        {
            head = null;
            tail = null;
            size = 0;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int r = temp.next.data;
        tail = temp;
        tail.next = null;
        size--;
        // System.out.println(tail.data);
        return r;
    }

    /////////////////////////////////// searchin ll
    public static int contins(int data) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            index++;
            if (data == temp.data)
                return index;
            else
                temp = temp.next;
        }
        return -1;
    }

    ///////////////////////////////////// recursive search
    public static int helper(Node n, int key) {
        if (n == null) {
            return -1;
        }
        if (n.data == key) {
            return 1;
        }
        int index = helper(n.next, key);
        if (index == -1) {
            return -1;
        }
        return index + 1;
    }

    public static int search(int data) {
        return helper(head, data);
    }

    ///////////////////////////// Reverse an ll
    public static void Reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    /////////////////////////////////// find and remove nth node from end
    public static int rmnth(int index) {
        if (index > size) {
            return -1;
        }
        if (index == size) {
            return rmfast();

        }
        Node temp = head;
        while (index < size - index) {
            temp = temp.next;
            index++;
        }
        int r = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return r;
    }

    /////////////////////////////////// find mid
    public static Node mid() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    ///////////////////////////////// palindrome
    public static void palindrome() {
        if (head == null || size == 1) {
            System.out.println("String is palindrome");
        }

        // reverse
        Node prev = null;
        Node currNode = mid();
        Node next;
        while (currNode != null) {
            next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }

        // compare
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                System.out.println("not palindrome");
                return;
            }
            left = left.next;
            right = right.next;
        }
        System.out.println("palindrome");
    }

    /////////////////////////////////////// finnd a loop in ll
    public static boolean finloop(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

    //////////////////////////////////// remove loop from ll
    public static void removeloop(Node head) {
        boolean cycle = false;
        Node last;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            last = fast;
            fast = fast.next;
        }
        fast.next = null;

    }

    private static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node Sort(Node left, Node right) {
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }
        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;

        }
        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return mergedll.next;
    }

    /////////////////////////////////// public node marge sort
    public static Node margesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // feft nad right ms
        Node rightHead = mid.next;
        mid.next = null;
        Node newleft = margesort(head);
        Node newright = margesort(rightHead);
        // merge
        return Sort(newleft, newright);
    }

    public static void main(String args[]) {

        // q l1 = new q();
        // addFirst(1);
        // addFirst(2);
        // addFirst(3);
        // addFirst(4);
        // addFirst(5);
        // margesort(head);
        // print();
        addFirst(5);
        addFirst(2);
        addFirst(2);
        addFirst(1);
        addFirst(2);
        addFirst(2);
        addFirst(5);
        print();
        margesort(head);
        print();
        // // adds(6, 5);
        // // System.out.println("removed=" + rmfast());
        // // System.out.println("removed=" + rmlast());
        // // System.out.println("index=" + contins(2));
        // // System.out.println("index=" + search(5));
        // // Reverse();

        // // System.out.println("removed" + rmnth(0));
        // print();
        // // System.out.println("mid=" + mid().data);
        // // System.out.println("Size=" + size);
        // palindrome();

        // head = new Node(10);
        // head.next = new Node(58);
        // head.next.next = new Node(7);
        // head.next.next.next = new Node(58);
        // head.next.next.next.next = new Node(7);
        // head.next.next.next.next.next = head.next;

        // boolean a1 = finloop(head);
        // System.out.println(a1);
        // removeloop(head);
        // print();
        // boolean a = finloop(head);
        // System.out.println(a);

    }
}
