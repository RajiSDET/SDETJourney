package dsa.week11;

public class RemoveDuplicates {
	
	

}

/*PSEUDO CODE
 Let there be two pointer left and right 
 left = 0;
 right = left+1;
 
 if(nums[left]==nums[right]) - increment right until both the values are diffrent -> 
 nums[left+1]=nums[right];
 
 
 */

/*

Given an integer array nums sorted in non-decreasing order, 
remove the duplicates in-place such that each unique element appears only once. 
Input: nums = [1,1,1,2,2,3,4,4]
Output: 4-> Final number of unique elements in the array 
nums = [1,2,3,4,,,,];
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

*/
