package dsa.week4;

public class OCT_13_HW01_rotateRight {
	
	public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next ==null || k==0 ) return head;

       ListNode curr = head;

       // step 1  -  calculate the  size of linked list
       int size = 1;
       while(curr.next!=null){
           size++;
           curr=curr.next;
       }

       // step 2  -  pointer curr to head of LL
       
       curr.next = head;

       k = k % size;
       k = size - k;

       // step 3  -  move curr til k > 0 and make head to curr.next and curr.next = null;

       while(k>0){
           curr=curr.next;
           k--;
       }
       
       // step - 4 

       head=curr.next;
       curr.next = null;

       return head;
   }
}

//Refered - https://leetcode.com/problems/rotate-list/solutions/4060553/beginner-explanation-with-diagram/
