package dsa.week5.day2;


public class DoublyLinkedList {
	
	/*head : Reference to the first node in the list.
      tail : Reference to the last node in the list.*/
	Node head;
    private Node tail; // check why this is private -- Raji
    // we dont need this tail variable outside ; We dont want this variable to be changed by the caller using the methods 
    
  /*-------------------------------------------------------------------------------------------------------------*/  
                 /*Constructor: Initialize head and tail to null.*/
  /*-------------------------------------------------------------------------------------------------------------*/  
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }    
    /*-------------------------------------------------------------------------------------------------------------*/     
                        // Add a node to the beginning of the list
    /*-------------------------------------------------------------------------------------------------------------*/  
    /*  Method: addFirst(data):
     Create a new node with the given data.
    If the list is empty (head is null):
      Set head and tail to the new node.
    Else:
      Set the next of the new node to the current head.
      Set the previous of the current head to the new node.
      Update head to the new node.*/
    
    // 
    
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
    /*-------------------------------------------------------------------------------------------------------------*/  
                                    // Add a node to the end of the list
    /*-------------------------------------------------------------------------------------------------------------*/ 
    /*Method: addLast(data):
    Create a new node with the given data.
    If the list is empty (tail is null):
      Set head and tail to the new node.
    Else:
      Set the next of the current tail to the new node.
      Set the previous of the new node to the current tail.
      Update tail to the new node.*/
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
    /*-------------------------------------------------------------------------------------------------------------*/  
                                     // Remove the first node from the list
    /*-------------------------------------------------------------------------------------------------------------*/  
    /* If the list is empty (head is null), do nothing.
    If head is the only node in the list:
      Set head and tail to null.
    Else:
      Update the next of the current head to null.
      Update head to the next node.*/
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
    /*-------------------------------------------------------------------------------------------------------------*/  
                                      // Remove the last node from the list
    /*-------------------------------------------------------------------------------------------------------------*/  
    /*Method: removeLast():
    If the list is empty (tail is null), do nothing.
    If tail is the only node in the list:
      Set head and tail to null.
    Else:
      Update the previous of the current tail to null.
      Update tail to the previous node.*/
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
    /*-------------------------------------------------------------------------------------------------------------*/  
}
