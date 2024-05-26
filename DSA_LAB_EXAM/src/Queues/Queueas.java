package Queues;

public class Queueas {
    class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    private Node first;
    private Node last;
    private int length;
    public linkedListImplementationOfQueue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }
    public void getFirst() {
        System.out.println("Head: " + first.value);
    }
    public void getLast() {
        System.out.println("Last" + last.value);
    }
    public void getLength() {
        System.out.println("Length: " + length);
    }
    public void printQueue() {
        Node current = first;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
            last = newNode;
            length = 1;
        }
        Node current = first;
        while (current != null) {
            current = current.next;
        }
        current.next = newNode;
        last = newNode;
        length++;
    }
    public Node dequeue() {
        if (first == null) {
            return null;
        }if (length == 1) {
            first = null;
            last = null;
        }
        Node current = first;
        first = first.next;
        current.next = null;
        length--;
        return current;
    }
}

