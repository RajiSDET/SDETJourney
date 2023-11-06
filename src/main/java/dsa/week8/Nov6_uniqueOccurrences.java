package dsa.week8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class Nov6_uniqueOccurrences {
	
	@Test
	public void test1() {
		Assert.assertTrue(uniqueOccurrences(new int[] {1,2,2,1,1,3}));
	}
	
	@Test
	public void test2() {
		Assert.assertFalse(uniqueOccurrences(new int[] {1,2}));
	}
	
	@Test
	public void test3() {
		Assert.assertTrue(uniqueOccurrences(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
	}
 
	public boolean uniqueOccurrences(int[] arr) {
	
	 Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	 Set<Integer> set = new HashSet<Integer>();
	 for (int i = 0; i < arr.length; i++) {
		map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
	 }
	 for(Map.Entry<Integer, Integer> entry : map.entrySet())
	 {
		 if(!set.add(entry.getValue())) {
			 return false;
		 }
	 }
	 return true;
     }

}

/*

PSEUDO CODE - 
INPUT - int[] arr 
Output - Boolean 
true if number of occurrences of each element is unique  
false if number of occurrences of each element is not unique  

Add the element and its count inside an Map 
Add the values of the Map inside a SET 
if set.add is false return false else return true 
 
https://leetcode.com/problems/unique-number-of-occurrences/
 1207. Unique Number of Occurrences

Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or 
false otherwise.

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. 
No two values have the same number of occurrences.

Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
 

Constraints:

1 <= arr.length <= 1000
-1000 <= arr[i] <= 1000

 */
