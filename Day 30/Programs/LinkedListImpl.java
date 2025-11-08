public class LinkedListImpl {

    public class Node {
        int val;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public int getSize() {
        return size;
    }

    public void addFirst(int item) {
        Node nn = new Node();
        nn.val = item;

        if (size == 0) {
            head = nn;
            tail = nn;
        } else {
            nn.next = head;
            head = nn;
        }
        size++;
    }

    public void addLast(int item) {
        if (size == 0) {
            addFirst(item);
        } else {
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int removeFirst() {
        Node temp = head;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            temp.next = null;
        }
        size--;
        return temp.val;
    }

    public Node getNode(int k) {
        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int removeLast() {
        if (size == 1) {
            return removeFirst();
        } else {
            Node sl = getNode(size - 2);
            int val = tail.val;
            sl.next = null;
            tail = sl;
            size--;
            return val;
        }
    }

}
