package dsa.week5.day2;

/*Node structure:
  data   : Integer data to store in the node.
  next   : Reference to the next node.
  prev   : Reference to the previous node.*/

public class Node {
	int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}
