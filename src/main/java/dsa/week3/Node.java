package dsa.week3;

import org.junit.Test;

// This is for Basic understanding of LINKEDLIST NODE CONCEPT
class Node {

	int data;
	Node next;

	public static void main(String[] args) {

		Node head,middle,last;
		head = new Node();
		middle= new Node();
		last = new Node();

		head.next=middle;
		middle.next =last;
		last.next=null;

		head.data=10;
		middle.data=20;
		last.data=30;

		Node temp=head;

		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
		

	}}



