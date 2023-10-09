package dsa.week4;

import org.junit.Test;

public class LinkedListImplementation {
	
	@Test
	public void testReverse()
	{
		//11,43,23,11,90
		Node head = addNode(11);
		head.next= addNode(43);
		head.next.next=addNode(23);
		head.next.next.next=addNode(11);
		head.next.next.next.next=addNode(90);
		
		reverseNodes(head);
	
	}
	
	private Node reverseNodes(Node head) {
		Node curr =head, prev =null ,next=null;
		while(curr!=null)
		{
			next =curr.next; // tail = head.next;
			curr.next=prev; // head.next=temp;
			prev =curr; // tmp = head;
			curr=next; // head = tail;
		}
		 
		/* https://chat.openai.com/?model=text-davinci-002-render-sha
		 
		  def prepend(self, data):
          new_node = Node(data)
          new_node.next = self.head
          self.head = new_node

		 */
		return prev;
		
	}

	public class Node{
	
		int data;
		Node next;
		
		Node(int key)
		{
			this.data=key;
			next=null;
		}
	}
	
	
	
	public Node addNode (int data)
	{
		return new Node(data);
	}

}

/**/