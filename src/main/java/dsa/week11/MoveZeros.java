package dsa.week11;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeros {
	
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[] {1,3,12,0,0},moveZerosToEnd(new int[] {0,1,0,3,12}) );
	}
	
	@Test
	public void test2() {
		Assert.assertArrayEquals(new int[] {0},moveZerosToEnd(new int[] {0}) );
	}
	
	public int[] moveZerosToEnd(int[] nums) {
		int j =0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0) {
				nums[j]=nums[i];
				j++;
			}
		}
		
		for (int i = nums.length-1;i>=j ;i--) {
			nums[i]=0;
		}
		
		return nums;
	}
	
}

/*PSEUDO CODE
 Let there be two pointers i and j 
 let pointer j =0;
 whenever nums[i]!=0 nums[j]= nums[i] and increment j 
 finally from length of array until j fill the array with zero
 */

/*
Move zeros to end without changing the relative position of non-zero elements in the array
 Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:
Input: nums = [0]
Output: [0]
 */
