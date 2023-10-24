package dsa.week6;

public class MiddleOfLinkedList {
	
	

	public static class LinkedListMiddle {

	    public static ListNode findMiddle(ListNode head) {
	        if (head == null) {
	            return null;
	        }

	        ListNode slow = head;
	        ListNode fast = head;

	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	        return slow;
	    }

	    public  static void main(String[] args) {
	        // Example usage:
	        // Construct a sample linked list
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(4);
	        head.next.next.next.next = new ListNode(5);

	        // Use the method directly
	        ListNode middle = findMiddle(head);
	        System.out.println("The middle of the linked list is: " + middle.val);
	    }
	}


	

}

/*
 Solve Middle of the linked-list in one pass(means only one time need to iterate) Duration: 20 minutes
 
Visualize how this algorithm works with a sample linked list step by step. 
For simplicity, let's say we have a linked list with values 1, 2, 3, 4, and 5.

Initial state:  Initialize two pointers, slow and fast, to the head of the linked list. 

 1 -> 2 -> 3 -> 4 -> 5
^
slow
^
fast

Step 1: While the fast pointer and the next node of the fast pointer are not null:
   a. Move the slow pointer one step forward.
   b. Move the fast pointer two steps forward.

The slow pointer moves one step forward, and the fast pointer moves two steps forward.

 1 -> 2 -> 3 -> 4 -> 5
    ^        ^
   slow     fast
   
Step 2:

The slow pointer moves one step forward, and the fast pointer moves two steps forward.

 1 -> 2 -> 3 -> 4 -> 5
       ^           ^
      slow        fast
      
Step 3:

The slow pointer moves one step forward, and the fast pointer moves two steps forward. 
The fast pointer reaches the end of the list (null), so we stop.

 1 -> 2 -> 3 -> 4 -> 5
          ^              ^
         slow           fast (null)
         
At this point, the slow pointer is pointing to the middle element, which is 3 in our example.
When the fast pointer reaches the end of the list (null), the slow pointer will be at the middle of the list.
Return the node pointed to by the slow pointer as the middle of the linked list.

So, the algorithm correctly identifies the middle of the linked list by having the slow pointer 
traverse the list at half the speed of the fast pointer.
 */
