package Reverse_singly_linked_list;

public class LinkedList {
    class Node {
        int value;
        Node next;
        Node (int value) {
            this.value = value;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    private int length;
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
    public void append(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = null;
        length++;
    }
    public void prepend(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }
    public Node removeLast() {
        if (head == null) {
            return null;
        }
        Node current = head;
        Node pre = head;
        while (current.next != null){
            pre = current;
            current = current.next;
        }
        pre = tail;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return current;
    }
    public Node removeFirst() {
        if (head == null) {
            return null;
        }
        Node current = head;
        Node pre = head.next;
        current.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return current;
    }
    public void insert(int value, int index) {
        Node newNode = new Node(value);
        if (index < 0 || index > length) {
            System.out.println("Invalid Index");
        }else if (head == null) {
            head = newNode;
            tail = newNode;
        }
        Node current = head;
        int count = 0;
        while (count < index - 1) {
            current = current.next;
            count++;
        }
        newNode.next = current.next;
        current.next = newNode;
        length++;
    }

    public void reverse() {
        Node current = head;
        head = tail;
        tail = current;

        Node after = current.next;
        Node before = null;
        while (current != null) {
            after = current.next;
            current.next = before;
            before = current;
            current = after;
        }
    }
}
