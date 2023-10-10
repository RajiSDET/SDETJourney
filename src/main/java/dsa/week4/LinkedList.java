package dsa.week4;



class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}



public class LinkedList {
	
	public static void printLinkedList(Node head) {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	    }
	
/*The provided code is a Java method that reverses a linked list. 
 * Here's a step-by-step explanation of how it works:

Initialize three pointers:

prev: Points to the previous node in the reversed list (initially set to null).
current: Points to the current node being processed (starts with the head of the original list).
nextNode: Points to the next node in the original list.
Iterate through the original linked list using a while loop until the current pointer is null (reached the end of the original list).

Inside the loop:

Store the nextNode pointer to the next node after the current.
Reverse the current node by setting its next pointer to the prev node.
Move prev to current, current to nextNode for the next iteration.
After the loop, prev will be pointing to the new head of the reversed linked list.

Return prev, which is the new head of the reversed linked list.

This approach effectively reverses the linked list in-place, changing the direction of pointers to achieve the reversal.*/
   
	public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev; // New head of the reversed linked list
    }

 

    public static void main(String[] args) {
        Node head = new Node(10);
        Node middle = new Node(20);
        Node last = new Node(30);

        head.next = middle;
        middle.next = last;
        last.next = null;

        System.out.println("Original linked list:");
        printLinkedList(head);
        System.out.println();

        Node reversedHead = reverseLinkedList(head);

        System.out.println("Reversed linked list:");
        printLinkedList(reversedHead);
    }
}

