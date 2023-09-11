package mandatoryHomeWork.postfoundation;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Sep_11th_HW_02_height_order_mismatch_count {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(5, heightChecker(new int[] {5,1,2,3,4}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(3, heightChecker(new int[] {1,1,4,2,1,3}));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(0, heightChecker(new int[] {1,2,3,4,5}));
	}
	
public int heightChecker(int[] heights) {
	int counter=0;
	
	int [] expected = new int[heights.length];
	
	for (int i = 0; i < heights.length; i++) 
	{
		expected[i]=heights[i];
	}
	
	Arrays.sort(expected);
	
	for (int i = 0; i < heights.length; i++) 
	{
		if(expected[i]!=heights[i])
		{
			counter++;
		}
	}
	
	return counter;

        
        
    }

}

/*https://leetcode.com/problems/height-checker/description/

1051. Height Checker

A school is trying to take an annual photo of all the students. 
The students are asked to stand in a single file line in non-decreasing order by height. 
Let this ordering be represented by the integer array expected where expected[i] is the 
expected height of the ith student in line.

You are given an integer array heights representing the current order 
that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].

 

Example 1:

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.
Example 2:

Input: heights = [5,1,2,3,4]
Output: 5
Explanation:
heights:  [5,1,2,3,4]
expected: [1,2,3,4,5]
All indices do not match.
Example 3:

Input: heights = [1,2,3,4,5]
Output: 0
Explanation:
heights:  [1,2,3,4,5]
expected: [1,2,3,4,5]
All indices match.
 

Constraints:

1 <= heights.length <= 100
1 <= heights[i] <= 100*/