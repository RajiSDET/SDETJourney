package dsa.week5;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class Oct_16_HW_01_calPoints {
	
	@Test
	public void test1() {
		Assert.assertEquals(30,calPoints(new String[] {"5","2","C","D","+"}) );
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(27,calPoints(new String[] {"5","-2","4","C","D","9","+","+"}) );
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(0,calPoints(new String[] {"1","C"}) );
	}
	
public int calPoints(String[] operations) {
       int totalSum=0;
       Stack<Integer> stack = new Stack<>();
       
       for(String s: operations )
       {
    	   if(s.equals("+") ){
    		  int top = stack.pop();
    		  int newtop = top+stack.peek();
    		  stack.push(top);
    		  stack.push(newtop);
    	   }
    	   else if(s.equals("D")) {
    		   stack.push(stack.peek()*2); 
    	   }
    	   else if(s.equals("C"))
    	   {
    		   stack.pop();
    	   }
    	   else
    	   {
    		   int i = Integer.parseInt(s);
    		   stack.push(i); 
    	   }
       }
       
       for(Integer i : stack)
       {
    	   totalSum+=i;
       }
       
       return totalSum;
    }
	
	

}

/*PSEUDO CODE 
 
 INPUT - String[] ops;
 OUTPUT - int
 
 scan through each element of the input array ops 
 create an empty Stack of integers 
  Stack<Integer> stack = new Stack<>();
  
  if ops[i] is !="C", "D", "+" -> stack.push(ops[i]); -> Integer.parseint is important
  stack.peek() == '(')
  stack.pop();
  
  if ops[i] is = C 
  stack.pop(stack.peek());
  
  if ops[i] is = D 
  stack.push(stack.peek()*2);
  
  if ops[i] is = +
  int top = stack.pop();
  int newtop = top + stack.peek();
  stack.push(top);
  stack.push(newtop);
  
  Loop through all elements of the stack and finally calculate the total sum 
  
  
  Input: ops = ["5","2","C","D","+"]
  Output: 30
Explanation:
"5" - Add 5 to the record, record is now [5].
"2" - Add 2 to the record, record is now [5, 2].
"C" - Invalidate and remove the previous score, record is now [5].
"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
The total sum is 5 + 10 + 15 = 30.
  
 
 */

/*https://leetcode.com/problems/baseball-game/
 682. Baseball Game

You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.

You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

An integer x.
Record a new score of x.
'+'.
Record a new score that is the sum of the previous two scores.
'D'.
Record a new score that is the double of the previous score.
'C'.
Invalidate the previous score, removing it from the record.
Return the sum of all the scores on the record after applying all the operations.

The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.

 

Example 1:

Input: ops = ["5","2","C","D","+"]
Output: 30
Explanation:
"5" - Add 5 to the record, record is now [5].
"2" - Add 2 to the record, record is now [5, 2].
"C" - Invalidate and remove the previous score, record is now [5].
"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
The total sum is 5 + 10 + 15 = 30.
Example 2:

Input: ops = ["5","-2","4","C","D","9","+","+"]
Output: 27
Explanation:
"5" - Add 5 to the record, record is now [5].
"-2" - Add -2 to the record, record is now [5, -2].
"4" - Add 4 to the record, record is now [5, -2, 4].
"C" - Invalidate and remove the previous score, record is now [5, -2].
"D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
"9" - Add 9 to the record, record is now [5, -2, -4, 9].
"+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
"+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.
Example 3:

Input: ops = ["1","C"]
Output: 0
Explanation:
"1" - Add 1 to the record, record is now [1].
"C" - Invalidate and remove the previous score, record is now [].
Since the record is empty, the total sum is 0.
 

Constraints:

1 <= operations.length <= 1000
operations[i] is "C", "D", "+", or a string representing an integer in the range [-3 * 104, 3 * 104].
For operation "+", there will always be at least two previous scores on the record.
For operations "C" and "D", there will always be at least one previous score on the record.

 */
