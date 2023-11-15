package dsa.week7;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Nov1_leftRightDifference {
	
	@Test
	public void test1(){
		Assert.assertArrayEquals(new int[] {15,1,11,22},leftRightDifference(new int[] {10,4,8,3}));
	}
	
	 public int[] leftRightDifference(int[] nums) {
		int[] answer = new int[nums.length];
		int[] leftSum= new int[nums.length];
		int[] rightSum= new int[nums.length];
		 
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				rightSum[i]+=nums[j];
			}
		}
		
		for (int i = 1; i < nums.length; i++) {
			for (int j = i-1; j >=0; j--) {
				leftSum[i]+=nums[j];
			}
		}
		
				
		for (int i = 0; i < nums.length; i++) {
			answer[i]=Math.abs(leftSum[i] - rightSum[i]);
		}
		
		
		
		
		 
		return answer;
	        
	    }
}

/*PSEUDO CODE
 
 INPUT - int[] nums
 OUTPUT - int[] answer 
 
 Brute force - 
 let us have two more arrays - 
 leftSum - Iterate through each index and populate the values of sum of left indices 
 rightSum 
 
 Compute answer[i] = abs |leftSum[i] - rightSum[i]|.
 
 */

/*https://leetcode.com/problems/left-and-right-sum-differences/description/
 2574. Left and Right Sum Differences

Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.

 

Example 1:

Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
Example 2:

Input: nums = [1]
Output: [0]
Explanation: The array leftSum is [0] and the array rightSum is [0].
The array answer is [|0 - 0|] = [0].
 

Constraints:

1 <= nums.length <= 1000
1 <= nums[i] <= 105
 */