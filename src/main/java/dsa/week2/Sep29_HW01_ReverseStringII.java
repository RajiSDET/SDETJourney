package dsa.week2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class Sep29_HW01_ReverseStringII {
	
	@Test
	public void test1()
	{
		Assert.assertEquals("bacdfeg", ReverseStringII("abcdefg",2));
	}
	
	
	public String ReverseStringII(String s, int k)
    {
		
		   
		        int n = s.length();
		        StringBuilder sb = new StringBuilder(n);

		        for (int i = 0; i < n; i += 2*k) {
		            // Creating the separator for every iteration.
		            int j = Math.min(i + k, n);
		            // Substring to reverse first k elements
		            StringBuilder rev = new StringBuilder(s.substring(i, j));
		            rev.reverse();
		            sb.append(rev);
		            // Substring to append the rest elements.
		            int rem = Math.min(i + 2*k, n);
		            sb.append(s.substring(j, rem));
		        }
		        // Converting back the StringBuilder to String
		        return sb.toString();
		    }
		
	

}

/*PSEUDO CODE
 INPUTS - String s int k
 OUTPUT - String s with logic applied 
 
 Approach Sliding window 
 Window size - 0 to k-1 ie :k size window  k=2 k-1 =1 
  ---------------------
 start=0 end =1
 01 reverse
 ab ba 
 ---------------------
 start+=2k end+=2k
 start=0+4 end =1+2*2=5
 45 reverse
 ef fe
 ----------------------
 start+=2k end+=2k
 start=0+4+4=8 end =1+2*2+4=9
 89 reverse
 ij ji
 ----------------------
 while (end<s.length)
 
 start
 */

/*https://leetcode.com/problems/reverse-string-ii/

 541. Reverse String II

Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. 
If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

 

Example 1:
            0123456 
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Example 2:

Input: s = "abcd", k = 2
Output: "bacd"
 

Constraints:

1 <= s.length <= 104
s consists of only lowercase English letters.
1 <= k <= 104
 
 */
