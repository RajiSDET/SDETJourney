package dsa.week1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class Sep22_HW02_K_beauty {
	@Test
	  public void test1()
	{
		Assert.assertArrayEquals(new int[] {4,5,2,7}, Sorter(new int[] {4,2,5,7}));
		}
	public int[] Sorter(int[] nums) {
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}
		
		int i=0;
		int j=1;
		for (Integer t:list) 
		{
			if (t%2==0)
			{
				nums[i]=t;
				i+=2;
			}
			else
			{
				nums[j]=t;
				j+=2;
			}
			
		}
		
		return nums;
		
		
	}

}

/*PSEUDO CODE
 4,2,5,7
 Array length is always going to be Even 
 let int  i point to even indices 
 let int  j point to odd indices 
 
 
 Add all elements to into a list 
 scan through all elements of array
 fill the input array at index i if the num is even 
 fill the input array at index j if num is odd
 
 
 
 
 */

/* https://leetcode.com/problems/sort-array-by-parity-ii/description/
 
922. Sort Array By Parity II

Given an array of integers nums, 
half of the integers in nums are odd, 
and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, 
and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.

Example 1:

Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
Example 2:

Input: nums = [2,3]
Output: [2,3]
 

Constraints:

2 <= nums.length <= 2 * 104
nums.length is even.
Half of the integers in nums are even.
0 <= nums[i] <= 1000
*/
