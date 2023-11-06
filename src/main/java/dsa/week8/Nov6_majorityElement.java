package dsa.week8;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.Test;
import junit.framework.Assert;

public class Nov6_majorityElement {
	
	@Test
	public void test1()
	{
	  	Assert.assertEquals(3,majorityElement( new int[] {3,2,3} ));
	}

	@Test
	public void test2()
	{
	  	Assert.assertEquals(2, majorityElement(new int[] {2,2,1,1,1,2,2}) );
	}
	
	 public int majorityElement(int[] nums) {
		 
		 Map <Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		 for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		 
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			
			if(entry.getValue()>nums.length/2) {
				return entry.getKey();
			}
		}
		return 0;
		
		 
	 }
}

/*PSEUDO CODE 
 
INPUT  - int[] nums having size = n 
OUTPUT - Return that element which occurs more than n/2 times in the array 

Step 1 : Iterate through the Array and the numbers inside a MAP key - numbers and values - 
count of each number 
------------------------------------------------------------------------------------------------
Step 2 : for each element in the MAP return that value in the Map which is greater than n/2
------------------------------------------------------------------------------------------------

 */

/*https://leetcode.com/problems/majority-element/

169. Majority Element

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.
 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109


 
 */
