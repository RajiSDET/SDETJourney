package dsa.week7;

public class Oct31_HW_01_MoveZeros {
    public int[] moveZeroes(int[] nums) {
    	int j=0;
    	for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0) {
				nums[j]=nums[i];
				j++;
			}
		}
    	
    	for (int i = nums.length-1; i >= j; i--) {
    		nums[i]=0;
			
		}
        
    	return nums;
    }
}

/*
 PSEUDO CODE 
 Input - int nums ;
 Output - int nums ; such that all zeros are at the end 
 
 Approach is to have two pointer j ; Iterate over the nums arrays and whenver nums[i] i non-zero 
 populate nums[j] = nums[i] and increment j and continue until end of array 
 
 now from end of array until j make sure to fill with zero;
 
 */

/*
 https://leetcode.com/problems/move-zeroes/
 283. Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the 
relative order of the non-zero elements.

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
