package LinkedListLearning;

public class dsa_week5_day2_01_DoublyLinkedList {
	
	class Node {
	    int data;
	    Node next;
	    Node prev;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	        this.prev = null;
	    }
	}

	class DoublyLinkedList {
	    private Node head;
	    private Node tail;

	    public DoublyLinkedList() {
	        head = null;
	        tail = null;
	    }

	    // Add a node to the beginning of the list
	    public void addFirst(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        }
	    }

	    // Add a node to the end of the list
	    public void addLast(int data) {
	        Node newNode = new Node(data);
	        if (tail == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        }
	    }

	    // Remove the first node from the list
	    public void removeFirst() {
	        if (head == null)
	            return;

	        if (head == tail) {
	            head = null;
	            tail = null;
	        } else {
	            head = head.next;
	            head.prev = null;
	        }
	    }

	    // Remove the last node from the list
	    public void removeLast() {
	        if (tail == null)
	            return;

	        if (head == tail) {
	            head = null;
	            tail = null;
	        } else {
	            tail = tail.prev;
	            tail.next = null;
	        }
	    }
	}


}
