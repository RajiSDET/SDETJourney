package dsa.week3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import junit.framework.Assert;

public class Oct_5_HW_01_sumOfUniqueElements {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(4,sumOfUnique(new int[] {1,2,3,2}));
	}
	
public int sumOfUnique(int[] nums) {
	
	int sum=0;
	Map<Integer,Integer> map= new HashMap<Integer,Integer>();
	for (int i = 0; i < nums.length; i++) {
		
		map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		
	}
	
	for (Entry<Integer, Integer> entry : map.entrySet()) 
	{
		if(entry.getValue()==1)
	    sum+= entry.getKey();
	}
	
	System.out.println(map);
	System.out.println(sum);
	return sum;
        
    }

}

/*Pseudo Code using Map
 
 Let us build a Map having key = number and value = number of occurrences of the number 
 use iterator and sum only those keys whose value is 1 
 
 */


/*https://leetcode.com/problems/sum-of-unique-elements/
 
 1748. Sum of Unique Elements

You are given an integer array nums. 
The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

 

Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
 
 */
