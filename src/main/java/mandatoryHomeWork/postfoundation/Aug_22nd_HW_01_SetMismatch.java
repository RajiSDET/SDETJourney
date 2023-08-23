package mandatoryHomeWork.postfoundation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class Aug_22nd_HW_01_SetMismatch {
	
	@Test
	public void test1()
	{
		 Set<Integer> expected = new HashSet<Integer>(Arrays.asList(4,5));
         Assert.assertEquals(expected, SetMismatch(new int[] {1,2,3,5,5}));
	}
	
	@Test
	public void test2()
	{
		 Set<Integer> expected = new HashSet<Integer>(Arrays.asList(1,2));
         Assert.assertEquals(expected, SetMismatch(new int[] {1,1}));
	}
	
	
	
	public Set<Integer> SetMismatch( int[] input)
	{
		HashSet<Integer> outputset = new HashSet<Integer>();
		
		if(input.length==2)
		{
			if(input[0]==1)
			{
				outputset.add(1);
				outputset.add(2);
			}
			if(input[0]==2)
			{
				outputset.add(1);
				outputset.add(2);
			}
		}
		
		
		for (int i = 0; i < input.length-1; i++) // 1,2,2,4
					
		{
			if(input[i+1]==input[i])
			{
				outputset.add(input[i+1]);
			}
			
			if(input[i]!=i+1)
			{
				outputset.add(i+1);
			}
					
		}
		
		
		return outputset ;
	}

}

/* PSEUDO CODE
Input int[] array containing messed up set
Output set

loop through input array 
whenever input[i]==input[i+1]
outputset.add input[]
whenever input[i]!=i add i to set 
 
 */


/*
 https://leetcode.com/problems/set-mismatch/
 
You have a set of integers s, 
which originally contains all the numbers from 1 to n. 
Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, 
which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing 
and return them in the form of an array.

 

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]
 

Constraints:

2 <= nums.length <= 104
1 <= nums[i] <= 104
  
 
 
 
 */
