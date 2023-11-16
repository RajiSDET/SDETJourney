package dsa.week10;

import org.junit.Assert;
import org.junit.Test;

public class Nov16_CW01_sortColors {
	
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[] {0,0,1,1,2,2}, sortColors(new int[] {2,0,2,1,1,0}));
	}
	
	@Test
	public void test2() {
		Assert.assertArrayEquals(new int[] {0,1,2}, sortColors(new int[] {2,0,1}));
	}
	
	public int[] sortColors(int[] nums ) 
	{
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[j]<nums[i]) {
					int temp = nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
					
				}
					
			}
		}
		return nums;
	}

}

/*PSEUDO CODE
 Scan/Iterate through the array 
 swap the current index with next smallest num in the iteration using a temp variable
 */

/*https://leetcode.com/problems/sort-colors/
75. Sort Colors

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.


Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
*/
