package dsa.week4;

import java.util.LinkedList;

import org.junit.Test;

public class LinkedList_Add_get_remove {

	class Node<T> {
	    T data;
	    Node<T> next;

	    public Node(T data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	public class LinkedList<T> {
	    private Node<T> head;

	    public LinkedList() {
	        this.head = null;
	    }

	    public void add(T data) {
	        Node<T> newNode = new Node<>(data);
	        if (head == null) {
	            head = newNode;
	        } 
	        else {
	            Node<T> current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }

	    public T get(int index) {
	        if (index < 0) {
	            throw new IndexOutOfBoundsException("Index cannot be negative");
	        }

	        Node<T> current = head;
	        int currentIndex = 0;

	        while (current != null) {
	            if (currentIndex == index) {
	                return current.data;
	            }
	            current = current.next;
	            currentIndex++;
	        }

	        throw new IndexOutOfBoundsException("Index out of bounds");
	    }

	    public void remove(int index) {
	        if (index < 0) {
	            throw new IndexOutOfBoundsException("Index cannot be negative");
	        }

	        if (index == 0) {
	            if (head != null) {
	                head = head.next;
	            } else {
	                throw new IndexOutOfBoundsException("Index out of bounds");
	            }
	            return;
	        }

	        Node<T> current = head;
	        Node<T> previous = null;
	        int currentIndex = 0;

	        while (current != null && currentIndex < index) {
	            previous = current;
	            current = current.next;
	            currentIndex++;
	        }

	        if (current != null) {
	            previous.next = current.next;
	        } else {
	            throw new IndexOutOfBoundsException("Index out of bounds");
	        }
	    }

	    public void display() {
	        Node<T> current = head;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }

	    public void main(String[] args) {
	        LinkedList<Integer> list = new LinkedList<>();
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.display();

	        System.out.println("Get at index 1: " + list.get(1));
	        list.remove(1);
	        list.display();
	    }
	}


}
