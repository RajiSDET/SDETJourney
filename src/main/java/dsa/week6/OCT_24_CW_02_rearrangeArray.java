package dsa.week6;

import java.util.ArrayList;
import java.util.List;

public class OCT_24_CW_02_rearrangeArray {
	
public int[] rearrangeArray(int[] nums) {
	
	List<Integer> positiveList = new ArrayList<Integer>();
	List<Integer> negativeList = new ArrayList<Integer>();
	List<Integer> finalList = new ArrayList<Integer>();
	
	for (int i = 0; i < nums.length; i++) {
		if(nums[i]>0) {
			positiveList.add(nums[i]);
		}
		else {
			negativeList.add(nums[i]);
		}
			
	}
	System.out.println(positiveList);
	System.out.println(negativeList);
	
	for (int i = 0; i < positiveList.size(); i++) {
		finalList.add(positiveList.get(i));
		finalList.add(negativeList.get(i));
	}
	System.out.println(finalList);
	
	for (int i = 0; i < nums.length; i++) {
		nums[i]=finalList.get(i);
	}
	
	return nums;
        
    }

}

/*PSEUDO CODE
 Let us have 2 tempList posLIST and negList 
 iterate through the input array 
 if number is positive add it to posList 
 if number is negative add it to negList 

build a third list finalList by adding the positive element and then a negativelement 
add this finallist inside the original nums array 
 
 
 */

/*https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
 2149. Rearrange Array Elements by Sign
You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should rearrange the elements of nums such that the modified array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 

Example 1:

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
Example 2:

Input: nums = [-1,1]
Output: [1,-1]
Explanation:
1 is the only positive integer and -1 the only negative integer in nums.
So nums is rearranged to [1,-1].
 

Constraints:

2 <= nums.length <= 2 * 105
nums.length is even
1 <= |nums[i]| <= 105
nums consists of equal number of positive and negative integers.
 
 */
