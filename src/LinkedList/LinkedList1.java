package LinkedList;

public class LinkedList1 {

    private Node head;
    private Node tail;
    private int length = 0;

    public LinkedList1(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
