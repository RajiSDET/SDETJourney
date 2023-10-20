package dsa.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.Test;

import junit.framework.Assert;

public class Oct_19_CW_01 {
	
	@Test
	public void test1()
	{
		List<Integer> integerList = new ArrayList<>(Arrays.asList(5,6));
		
		for(Integer i : integerList)
		{
			
		}
		Assert.assertEquals(integerList, findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));
	}
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
        
		 List<Integer> outputF = new ArrayList<Integer>();
		 
		 Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		 
		 for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
			
		}
		 System.out.println(map);
		  
                
         for (int i = 1; i <= nums.length; i++) {
    	   if(!map.containsKey(i)) {
    		   outputF.add(i);
    	   }
		
	}
		 
		 
		 return outputF;
    }

}

/*

PSEUDO CODE 
INPUT = int[] array 
OUTPUT = List of int nums which is missing in int[]

Solution using HashMap
Create a HashMap <Integer,Integer> map
iterate over the input array and add integer,count 
let key be 1 to arr.length
get the keys and add those missing inside the list

*/

/*https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

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
 

Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 
 */
