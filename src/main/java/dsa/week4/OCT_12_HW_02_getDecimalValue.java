package dsa.week4;

public class OCT_12_HW_02_getDecimalValue {
	
	public int getDecimalValue(ListNode head) {
        int decimalvalue = 0;
       while(head!=null){
           decimalvalue = decimalvalue*2 + head.val;
           head=head.next;
       }
       return decimalvalue;
   }

}


/*https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/
 1290. Convert Binary Number in a Linked List to Integer
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

The most significant bit is at the head of the linked list.

 

Example 1:


Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
Example 2:

Input: head = [0]
Output: 0
 

Constraints:

The Linked List is not empty.
Number of nodes will not exceed 30.
Each node's value is either 0 or 1.
 */

/* Refereed - https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/solutions/2998898/simple-solution-with-explanation/
 We are using a method over there which is called as Doubling Method . In this method what we do is double the previous value (initially 0) and add the current value to it.
As the name suggests, the process of doubling or multiplying by 2 is done to convert binary to decimal. Let us use the same example for converting the binary number
101101
to decimal. Observe the following steps given below to understand the binary to decimal conversion using the doubling method.

Step 1: Write the binary number and start from the left-most digit. Double the previous number and add the current digit. Since we are starting from the left-most digit and there is no previous digit to the left-most digit, we consider the double of the previous digit as 0. For example in 101101
the left-most digit is '1'. The double of the previous number is 0. Therefore, we get ((0 × 2) + 1) which is 1.
Step 2: Continue the same process for the next digit also. The second digit from the left is 0. Now, double the previous digit and add it with the current digit. Therefore, we get, [(1 × 2) + 0], which is 2.
Step 3: Continue the same step in sequence for all the digits. The sum that is achieved in the last step is the actual decimal value. Therefore, the result of converting the binary number
(101101)
to a decimal using the doubling method is 45
 */
