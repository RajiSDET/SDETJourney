package dsa.week1;

public class Sep20_HW_01_Arithemetic_Triplets {

}

/*PSEUDO CODE
 Array is already sorted 
 INPUT - int[] nums, int diff
 
 outer for loop i start from nums.length-1 to nums[1]
 inner for loop j start from nums.length-2 to nums[0]

 whenever nums[i]-nums[j]==diff lets have a templist of size 3
 add i and j to temp list 
 and let i=j and continue the loop to check nums[i]-nums[j]==diff
 Add that specific diffrence matching index as k into temp list 
 if templist.size is greater than 3 then increment counter 
 
 */


/*https://leetcode.com/problems/number-of-arithmetic-triplets/description/
2367. Number of Arithmetic Triplets
Easy
1.1K
58
Companies
You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

i < j < k,
nums[j] - nums[i] == diff, and
nums[k] - nums[j] == diff.
Return the number of unique arithmetic triplets.

 

Example 1:

Input: nums = [0,1,4,6,7,10], diff = 3
Output: 2
Explanation:
(1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
(2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3. 
Example 2:

Input: nums = [4,5,6,7,8,9], diff = 2
Output: 2
Explanation:
(0, 2, 4) is an arithmetic triplet because both 8 - 6 == 2 and 6 - 4 == 2.
(1, 3, 5) is an arithmetic triplet because both 9 - 7 == 2 and 7 - 5 == 2.
 

Constraints:

3 <= nums.length <= 200
0 <= nums[i] <= 200
1 <= diff <= 50
nums is strictly increasing.


 */
