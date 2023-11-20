package dsa.week11;

public class CW02_Nov20_MaxSumSubArray {
	
	public int maxSubArray(int[] nums) {
        int max_sum=Integer.MIN_VALUE;
				if(nums.length<=1){
max_sum=nums[0];
				}
	for (int i = 0; i < nums.length; i++) {
		int curr_sum=0;
		for (int j = i; j < nums.length; j++) {
			curr_sum+=nums[j];
			if(curr_sum>max_sum) {
				max_sum=curr_sum;
			}
		}
		
	}
	return max_sum;
    }

}

/*PSEUDO CODE - BRUTE FORCE

Let int max_sum = Min Value Integer 
let us have 2 for loops 
i and j such that - i traveres from 0 to end of array 
j traverses from i+1 to end 
Calculate current_sum from i to j 
at each stage before increment of j compare current_sum to max_sum and set max_sum value 
finally return max_sum 
 
 */

/*https://leetcode.com/problems/maximum-subarray/description/
 53. Maximum Subarray
Given an integer array nums, find the subarray with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
 

Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
