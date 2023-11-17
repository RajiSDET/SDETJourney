package dsa.week10;

public class Nov_16_HW_01_moveZerostoEnd {
	
	 public int[] moveZeroes(int[] nums) {
		 int j=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0) {
				nums[j]=nums[i];
				j++;
			}
		}
		for (int i = nums.length-1; i >=j ; j--) {
			nums[i]=0;
		}
		return nums;
		 
	 }

}

/*
 PSEUDO CODE 1 
 
 let have a variable j =0 
 Iterate through the array whenever the element is not zero 
 nums[j] = no-zero element - do until end of array 
 
 Now from lastindex until j fill with zeros 
 
 
 
 */

/*https://leetcode.com/problems/move-zeroes/
 283. Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 

Follow up: Could you minimize the total number of operations done?
 */
