package dsa.week2;

import java.util.Iterator;

import org.junit.Test;

import junit.framework.Assert;

public class Sep24_CW_01_Count_of_Max_Consequtives1s {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(3, MaxConsequtive1s(new int[] {1,1,0,1,1,1}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(2, MaxConsequtive1s(new int[] {0,1,0,1,1,0,1}));
	}

	public int MaxConsequtive1s(int[] input)
	{
		int count =0,max=0;
		for (int i = 0; i < input.length; i++) {
			if(input[i]==1)
			{
				count++;
			}
			else
			{
				count=0;
			}
			
			max = Math.max(max, count);
		}
		return max;
	}


	public int MaxConsequtive1s_2Pointer(int[] input)
	{
		int max=0;
		int left=0;
		int right=0;
		
		while(right<=input.length) {
		
			//Step1: Identify the left pointer 
		for (int i = 0; i < input.length; i++) {
			if(input[i]==1)
			{
				left=i;
				break;
			}
		}
		
		
		
		}
		
		
		
		return max;
		
	}
	
}

/*Pseudo Code - Brute Force 
 Let count = 0, max = 0
 Let us have one pointer 
 Step 1 : Iterate through the array 
 when we encounter 1s increment the counter 
 else reset the counter to 0
 compare the max count to counter - Store max amongst both as max
 
 /*Dynamic Sliding window approach - Pening implementation
 Initialize left and window 
 increase right till 1
 if number is zero, calculate the window of right-left and reset right and left as current index 
 
 */
 
 
 

/* https://leetcode.com/problems/max-consecutive-ones/description/
485. Max Consecutive Ones

Companies
Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
*/