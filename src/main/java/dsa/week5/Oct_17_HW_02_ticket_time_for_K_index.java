package dsa.week5;

import java.util.ArrayDeque;
import java.util.Queue;

import org.junit.Assert;
import org.junit.Test;

public class Oct_17_HW_02_ticket_time_for_K_index {

	@Test
	public void test() {
		Assert.assertEquals(3, timeRequiredToBuy(new int[] {1,1,1},2));
	}
	@Test
	public void test1() {
		Assert.assertEquals(20, timeRequiredToBuy(new int[] {7,4,3,6},0));
	}
	@Test
	public void test2() {
		Assert.assertEquals(8, timeRequiredToBuy(new int[] {5,1,1,1},0));
	}
	@Test
	public void test3() {
		Assert.assertEquals(18, timeRequiredToBuy(new int[] {3,2,7,8},2));
	}

	public int timeRequiredToBuy(int[] tickets, int k) {
		//Initialize an Queue 
		Queue<Integer> q = new ArrayDeque<>();

		//Add the indices of int[] to the queue using q.offer method
		for(int i=0;i<tickets.length;i++){
			q.offer(i);
		}
		// Initialize timer to zero to start with
		int time=0;
		while(!q.isEmpty()){
			int index = q.poll();// the first item in the queue is removed 
			tickets[index]--; // tickets[q.poll()]--;
			time++; // increment timer
			if(tickets[index]==0&&index==k){
				return time;
			}
			if(tickets[index]>0){
				q.offer(index);//if the desired tickets at polled index still has pending tickets yet to be purchased add the same to end of queue again
			}
		}
		return time;
	}


}

/*PSEUDO CODE
 INPUTS : int[] tickets , int k - desired index 

INPUTS -  int[] tickets, int k
OUTPUT -  int time - Actual time taken for the person at kth index to buy all his desired tickets 
Logic : Initialize an Queue and add the indices of int[] to the queue using q.offer method
	  // Run the below till q is not empty
	1) remove the value in queue using q.poll and reduce the value in the index by 1 
	2) increment timer
	3) if the ticket's index is zero and the index equals k, return the time directly as it is 
	4) if the ticket value at polled index is still greater than 0 add the index back to the q again using q.offer 

	  //TC & SC :O[N]


 */

/* https://leetcode.com/problems/time-needed-to-buy-tickets/

 2073. Time Needed to Buy Tickets

There are n people in a line queuing to buy tickets, where the 0th person is at the front of the line and the (n - 1)th person is at the back of the line.

You are given a 0-indexed integer array tickets of length n where the number of tickets that the ith person would like to buy is tickets[i].

Each person takes exactly 1 second to buy a ticket. A person can only buy 1 ticket at a time and has to go back to the end of the line (which happens instantaneously) in order to buy more tickets. If a person does not have any tickets left to buy, the person will leave the line.

Return the time taken for the person at position k (0-indexed) to finish buying tickets.



Example 1:

Input: tickets = [2,3,2], k = 2
Output: 6
Explanation: 
- In the first pass, everyone in the line buys a ticket and the line becomes [1, 2, 1].
- In the second pass, everyone in the line buys a ticket and the line becomes [0, 1, 0].
The person at position 2 has successfully bought 2 tickets and it took 3 + 3 = 6 seconds.
Example 2:

Input: tickets = [5,1,1,1], k = 0
Output: 8
Explanation:
- In the first pass, everyone in the line buys a ticket and the line becomes [4, 0, 0, 0].
- In the next 4 passes, only the person in position 0 is buying tickets.
The person at position 0 has successfully bought 5 tickets and it took 4 + 1 + 1 + 1 + 1 = 8 seconds.


Constraints:

n == tickets.length
1 <= n <= 100
1 <= tickets[i] <= 100
0 <= k < n

 */
