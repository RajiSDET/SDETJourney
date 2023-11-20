package dsa.week11;

public class CW03_Nov19_Max_ConSeqones {

}

/*PSEUDO CODE 
 INPUTS - int[] nums and int k 
 initialize pointer left and right starting at beginning of array 
 Let max_len = Integer.minValue to start with
 Calculate current length = right-left+1;
 if curr_len > max_length - Let max_len = current_len 
 
 Breaking condition :  right pointer reached the end of array 
 increment right and if nums[right]= 0 -> replace 1 
 decrement k 
 
 EXCEL Work out available at : 
 https://docs.google.com/spreadsheets/d/1ouzLJcifrAHyRC7mzXOfofHv3PKmHsb1EwDz3_AUfps/edit#gid=2109189027
 
 */

/*
 https://leetcode.com/problems/max-consecutive-ones-iii/
 
 1004. Max Consecutive Ones III
Given a binary array nums and an integer k, 
return the maximum number of consecutive 1's in the array if you can flip at most k 0's.


Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
0 <= k <= nums.length
 
 */
