package dsa.week11;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class HW02_1464_maxProduct {

	@Test
	public void test1() {
		Assert.assertEquals(12,maxProduct_Brute_Force(new int[] {3,4,5,2}));
		Assert.assertEquals(12,maxProduct_oneforLoop(new int[] {3,4,5,2}));
	}
	@Test
	public void test2() {
		Assert.assertEquals(16,maxProduct_Brute_Force(new int[] {1,5,4,5}));
		Assert.assertEquals(16,maxProduct_oneforLoop(new int[] {1,5,4,5}));
	}
	@Test
	public void test3() {
		Assert.assertEquals(12,maxProduct_Brute_Force(new int[] {3,7}));
		Assert.assertEquals(12,maxProduct_oneforLoop(new int[] {3,7}));
	}
	
	public int maxProduct_oneforLoop(int[] nums) {
        
		//Declare 2 values & assign them to 0
      
       int winner=0, runner=0;
       
		// find the maximum 2 values.
		for(int i=0; i<nums.length; i++)
       {
           if(nums[i] > winner)
           {
               runner = winner;
               winner = nums[i];
           }
           else if(nums[i] > runner)
           {
               runner = nums[i];
           }
       }
       
		//Finally returning the result.
       return (winner-1) * (runner-1);
   }
	
   public int maxProduct_Brute_Force(int[] nums) {
	Arrays.sort(nums);
    return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}

/*
 https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 1464. Maximum Product of Two Elements in an Array
Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 

Example 1:

Input: nums = [3,4,5,2]
Output: 12 
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
Example 2:

Input: nums = [1,5,4,5]
Output: 16
Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
Example 3:

Input: nums = [3,7]
Output: 12*/
