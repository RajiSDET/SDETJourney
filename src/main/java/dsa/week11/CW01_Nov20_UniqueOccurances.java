package dsa.week11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class CW01_Nov20_UniqueOccurances {
	
	@Test
	public void test1() {
		Assert.assertTrue(UniqueCount(new int[] {1,2,2,1,1,3}));
	}
	@Test
	public void test2() {
		Assert.assertFalse(UniqueCount(new int[] {1,2,2,2,1,1,3}));
	}
	
	public boolean UniqueCount(int[] arr) {
		Map<Integer,Integer> map = new HashMap<>();
		boolean result=true;
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		Set<Integer> set= new HashSet<>();
		for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
			if(!set.add(entry.getValue())) {
				result=false;
				return result;
			}
			
			
		}
		return result;
	}

}

/*PSEUDO CODE
 Create a Map and add the numbers and its occurance inside a MAP 
 Now try adding the values inside a Set if Set.add is false at any point of time 
 throw false else return true
 */

/*Given an array of integers arr, 
 * return true if the number of occurrences of each value in the array is unique or false otherwise.
Input: arr = [1,2,2,1,1,3]
Output: true*/
