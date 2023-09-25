package dsa.week2;

import org.junit.Test;

import junit.framework.Assert;

public class Sep25_HW_01_Consecutive_Black_Blocks {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(3,minimumRecolors("WBBWWBBWBW",7) );
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(0,minimumRecolors("WBWBBBW",2) );
	}
	
	//
	
public int minimumRecolors(String blocks, int k)
    {
	  int minCount = Integer.MAX_VALUE;
	  int wCount =0,start =0, end = k-1;
	  
	  while(end<blocks.length())
	  {
		  wCount =0;
		  for (int i = start;  i <= end; i++) {
			  
			  if(blocks.charAt(i)=='W')
			  {
				  wCount++;
			  }
			  
		    }
		  minCount= Math.min(minCount, wCount);
		  start++;
		  end++;
	  }
	   
	  
	  return minCount;
        
    }

}

/*PSEUDO CODE 
 
 INPUTS - String blocks and int k 
 OUTPUT int output = least number of W's in subarray of side k 
 
 Approach Sliding window 
 k =7 
 length=10 ; 0-9
 start = 0 end =k-1
 while(end <length) 
 0123456789 
 WBBWWBBWBW
 0123456 wC MinC Least
 WBBWWBB  3  MAX     3
 1234567 wC MinC Least
 BBWWBBW  3    3     3
 2345678 wC MinC Least
 BWWBBWB  3    3     3
 3456789 wC MinC Least
 WWBBWBW  3    3     3
 
 int minimumWcount =max Integer value ;
 
 initialize a start index at 0 and end index at k-1
 get the count of Ws 
 navigate from 0 to k ie: while k < blocks length 
 get the count of W's inside this window  - Wcount
 Extract the minimumWcount
 start ++
 end ++
 
 
 */

/*https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/
 2379. Minimum Recolors to Get K Consecutive Black Blocks
Easy
655
16
Companies
You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.

You are also given an integer k, which is the desired number of consecutive black blocks.

In one operation, you can recolor a white block such that it becomes a black block.

Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.

 

Example 1:

Input: blocks = "WBBWWBBWBW", k = 7
Output: 3
Explanation:
One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
so that blocks = "BBBBBBBWBW". 
It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
Therefore, we return 3.
Example 2:

Input: blocks = "WBWBBBW", k = 2
Output: 0
Explanation:
No changes need to be made, since 2 consecutive black blocks already exist.
Therefore, we return 0.
 

Constraints:

n == blocks.length
1 <= n <= 100
blocks[i] is either 'W' or 'B'.
1 <= k <= n
 */
