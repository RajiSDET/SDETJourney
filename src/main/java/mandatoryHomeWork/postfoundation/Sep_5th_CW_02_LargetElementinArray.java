package mandatoryHomeWork.postfoundation;

import org.junit.Assert;
import org.junit.Test;

public class Sep_5th_CW_02_LargetElementinArray {
	@Test
	public void test1()
	{
		Assert.assertEquals(9,LargestEle(new int[] {4,1,0,-7,5,9,2}) );
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(-1,LargestEle(new int[] {-4,-1,-7,-5,-9,-2}) );
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(8,LargestEle(new int[] {4,7,8,6,7,6}) );
	}
	
	public int LargestEle(int[] inputarr)
	{
		int max=inputarr[0];
		
		for (int i = 0; i < inputarr.length; i++) {
			if(max<inputarr[i])
			{
				max=inputarr[i];
			}
		}
		return max;
	}

}

/*
 Pseudo Code 
 
 scan through the array 
 let max = 0 to start with 
 now compare max with each element in the array 
 replace the max with inputarray[i] whenever inputarray[i] is greater than max 
 
 */

/*https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279
 * 
 Largest Element in the Array
Last Updated: 23 Aug, 2023
Easy
0/40
10 mins
90 %
114 upvotes
+6 more
Problem Statement

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
6
4 7 8 6 7 6 
Sample Output 1:
8
Explanation Of Sample Input 1:
The answer is 8.
From {4 7 8 6 7 6}, 8 is the largest element.
Sample Input 2:
8
5 9 3 4 8 4 3 10 
Sample Output 2:
10
Expected Time Complexity:
O( N ), Where ‘N’ is the size of an input array ‘arr’.
Constraints :
1 <= 'n' <= 10^5
1 <= 'arr[i]' <= 10^9

Time Limit: 1 sec
 * 
 * */
 