package mandatoryHomeWork.postfoundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class Sep_5th_RotateArray {
	
	@Test
	public void test1()
	{
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays. asList(8,5, 6, 7));
		Assert.assertEquals(expected,Rotater(4,new int[] {5,6,7,8 },3));
	}
	
	@Test
	public void test2()
	{
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays. asList(2,11,2,43,1,1,7,5));
		Assert.assertEquals(expected,Rotater(8,new int[] {7, 5, 2, 11, 2, 43, 1, 1 },2));
	}
	
	public List<Integer> Rotater(int arrlength, int[] inputarr, int s)
	{
		List<Integer> outputList = new ArrayList<Integer>(arrlength);
		
		for (int i = s; i < inputarr.length; i++) {
			outputList.add(inputarr[i]);
			}
		for (int i = 0; i < s; i++) {
			outputList.add(inputarr[i]);
			}
		
		return outputList;
	}
	

}

/*Pseudo Code

Input - Length of array , Dynamic sized array , shift rotate by specific number of positions=s

OutPut - Array List 

Start filling the list from i=s to inputarray.length-1, 
01
012345(6)(7)
234567(0)(1)

for i=0 to s-1
list.add remaining elements 



 *  
 *  */

/*
 https://www.codingninjas.com/studio/problems/rotate-array_1230543
 
 Problem Statement

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
8
7 5 2 11 2 43 1 1 - 01234567
2  
Sample Output 1:
2 11 2 43 1 1 7 5
Explanation Of Sample Input 1:
Rotate 1 steps to the left: 5 2 11 2 43 1 1 7
Rotate 2 steps to the left: 2 11 2 43 1 1 7 5
Sample Input 2:
4
5 6 7 8
3
Sample Output 2:
8 5 6 7
Explanation Of Sample Input 2:
Rotate 1 steps to the left: 6 7 8 5
Rotate 2 steps to the left: 7 8 5 6
Rotate 2 steps to the left: 8 5 6 7
Expected Time Complexity:
O(n), where ‘n’ is the size of the array ‘arr’ and ‘k’ is the number of rotations.
Constraints:
1 <= 'n' <= 10^3
1 <= 'arr'[i] <= 10^9
1 <= 'k' < 'n'
 
*/