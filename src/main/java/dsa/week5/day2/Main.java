package dsa.week5.day2;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addFirst(10);
        list.addFirst(5);

        list.addLast(20);
        list.addLast(25);

        System.out.print("Doubly Linked List: ");
        printList(list);

        list.removeFirst();
        list.removeLast();

        System.out.print("Updated Doubly Linked List: ");
        printList(list);
    }

    private static void printList(DoublyLinkedList list) {
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

