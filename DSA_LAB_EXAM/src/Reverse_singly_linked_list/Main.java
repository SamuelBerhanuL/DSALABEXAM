package Reverse_singly_linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(1);

        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);

        ll.reverse();
        ll.printLinkedList();
    }
}
