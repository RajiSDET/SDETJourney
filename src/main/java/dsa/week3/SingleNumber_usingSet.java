package dsa.week3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumber_usingSet {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(1, returnUnique(new int[] {2,2,1}));
	}
	
	public int returnUnique(int[] nums)
	{
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(!set.add(nums[i]))
			{
				set.remove(nums[i]);
			}
			
		}
		
			
		 return set.iterator().next();
		
	}

}

/*Pseudo Code
 Input - Array contains one unique element and rest all duplicates
 Output the unique element 
 
 Create a set add element to the set 
 if set.add is false - remove that element 
 finally return the remaining one last element in the set as ouput
 
 
 */

/*https://leetcode.com/problems/single-number/description/

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.

*/
 