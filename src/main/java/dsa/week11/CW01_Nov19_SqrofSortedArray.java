package dsa.week11;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

public class CW01_Nov19_SqrofSortedArray {
	@Test
	public void test1() {
		int[] nums = {-4,-1,0,3,10};
		int[] expected = {0,1,9,16,100};
		
		Assert.assertArrayEquals(expected, sqrs_sorted_two_pointer(nums));
		//Assert.assertArrayEquals(expected, sqrs_sorted_BFTech(nums));
	}
	
	@Test
	public void test2() {
		int[] nums = {-7,-3,2,3,11};
		int[] expected = {4,9,9,49,121};
		//Assert.assertArrayEquals(expected, sqrs_sorted_BFTech(nums));
		Assert.assertArrayEquals(expected, sqrs_sorted_two_pointer(nums));
	}
	
	
	public int[] sqrs_sorted_two_pointer(int[] nums) {
		int left =0, right = nums.length-1;
		int[] output = new int[nums.length];
		for(int i = nums.length-1; i>=0;i--)
		{
			if(Math.abs(nums[right])>Math.abs(nums[left])) {
				output[i]= nums[right]*nums[right];
				right--;
			}
			else {
				output[i]= nums[left]*nums[left];
				left++;
			}
		}
		return output;
	}
	
	public int[] sqrs_sorted_BFTech(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i]=nums[i]*nums[i];
			
		}
		Arrays.sort(nums);
		return nums;
	}

}
/*PSEUDO CODE
 a) BRUTE FORCE
    SQUARE THE NUMBER AND FINALLY SORT
    
 b) 2 pointer 
 There should be pointer left beginning at the 0th index 
 pointer right starting at the last index 
 
 compare the abs values at left and right 
 if right>left 
 sqr the value and leave at right 
 right-- 
 if left>right
 sqr the left value and let arr[right] = sqred value 
 
 */



/*
Given an integer array nums sorted in non-decreasing order, 
return an array of the squares of each number sorted in non-decreasing order.
 
Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */
