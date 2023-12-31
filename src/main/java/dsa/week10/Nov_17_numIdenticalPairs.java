package dsa.week10;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class Nov_17_numIdenticalPairs {
	 int counter;
	 boolean bool;
	 
	@Test
	public void test1() {
		Assert.assertEquals(4, twopointer(new int[] {1,2,3,1,1,3}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(6, twopointer(new int[] {1,1,1,1}));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(0, twopointer(new int[] {1,2,3}));
	}
	
	
	// Approach 2 
	 public int numIdenticalPairs_Map(int[] nums) {
	        
		
		 Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		 for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		 }
		 
		 for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		
			if(entry.getValue()>1) {
				Integer value = entry.getValue();
				counter+=(value*(value-1))/2;
			}
			
		}	 
		 
		 return counter;
	    }
	// Approach 1
	 public int numIdenticalPairs(int[] nums) {
	     		
		 for (int i = 0; i < nums.length; i++) {
			 for (int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					counter++;
				}
			}
		}
		 
		 return counter;
	    }
	 
	 
	 public int twopointer (int[] nums) {
		// System.out.println(counter +"----" + bool);// class level variable will always have a default value
	    int i =0;
	    int j = 1; 
	    Map<Integer,Integer> map = new HashMap<>();
	    while(i<nums.length-1) {
	    	map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
	    	
	    	counter+=map.getOrDefault(nums[i], 0);// doubt 1
	    	i++;
	    	j++; // doubt 2 
	    	
	    }
		 return counter;
	 }

}

/*PSEUDO CODE
 TWO POINTER with MAP
 
 Initialize 2 pointer i and j such that i<j i=0, j=1
 
 Initialize a Map - Capture the frequency count of each element using this Map 
 While loop traverse until left pointer i< nums.length-1 
 increment the counter while writing to the Map /////
 increment i and j 
 
 */

/*
 https://leetcode.com/problems/number-of-good-pairs/
 1512. Number of Good Pairs
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
 */
