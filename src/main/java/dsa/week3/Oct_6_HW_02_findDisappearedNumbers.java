package dsa.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import junit.framework.Assert;

public class Oct_6_HW_02_findDisappearedNumbers {
	
	@Test
	public void test1()
	{
		ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(5);
        myArrayList.add(6);
		Assert.assertEquals(myArrayList, findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));
	}
	
	 public List<Integer> findDisappearedNumbers(int[] nums) {
		 
	     
		 Set<Integer> output = new TreeSet<Integer>();
		 List<Integer> outputF = new ArrayList<Integer>();
		 for (int i = 0; i < nums.length; i++) 
		 {
			
				output.add(nums[i]);
			
		 }
		 
		 
		 System.out.println(output);
		 System.out.println(output.size());
		
		 for (int i = 1; i <= nums.length; i++) 
		 {
			
				if(!output.contains(i))
				{
					outputF.add(i);
				}
			
		 }
		 
		 
		 return outputF;
	        
	    }

}

/* Pseudo Code 
 Inputs - int[] nums 
 Output - List 
 */


/*https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

448. Find All Numbers Disappeared in an Array

Given an array nums of n integers where nums[i] is in the range [1, n], 
return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
 

Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.*/