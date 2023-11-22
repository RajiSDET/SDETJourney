package dsa.week11;

import java.util.HashMap;
import java.util.Map;

public class CW01_Nov22_ArithmeticTriplets {
	
	public int ArithmeticTriplets(int[] nums,int diff) {
		int counter=0;
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], nums[i]-diff);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			if(map.containsKey(val)) { //10-3=7 true now check if 7-3=4 is present 
				if(map.containsKey(val-diff)) { //if and only if 4-3 ie : 1 is present 
					counter++;
				}
			}
			
		}
		return counter;
	}

}

/*PSEUDO CODE-
 INPUTS - int[] nums, int diff
 OUTPUT - int counter;
 
 Let us add the Array inside a List
 have a counter =0;
 Start Scan from end of Array and each stage find out if 
 indexvalue-diff is present in the array 
 if yes - from that indexvalue-diff should again be present in the array
 if both conditions satisfy - increment counter 
 ------------------------------------------------------------------------------ 
 
 2 pointer tech
 
 let there be i and j such that j>i 
 
 MAP 
 
 Key Value 
 10   10-diff=10-3=7 
 7    7-diff=4
 4 
 
 counter++;
 
 */

/*https://leetcode.com/problems/number-of-arithmetic-triplets/description/
2367. Number of Arithmetic Triplets

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
