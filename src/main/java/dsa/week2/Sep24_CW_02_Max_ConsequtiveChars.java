package dsa.week2;

import org.junit.Assert;
import org.junit.Test;

public class Sep24_CW_02_Max_ConsequtiveChars {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2, MaxConseChars("leetcode"));
	}
	
	public int MaxConseChars(String s)
	{
		   int maxWindowSize=0;
			int left=0, right=1;
			int currentWindowSize=1;
			
			while(right<s.length()) 
			{
				
				if(s.charAt(left)==s.charAt(right))
				{
					currentWindowSize=right-left+1;
					
				}
				
				else
				{
					left=right;
					currentWindowSize=1;
				}
				right++;
				maxWindowSize=Math.max(maxWindowSize, currentWindowSize);
				
			}
			
				return Math.max(maxWindowSize, currentWindowSize);
		
	}

}

/*
 Analogy - Dynamic Sliding window approach
 
 Initialize left and window 
 increase right till 1
 if number is zero, calculate the window of right-left and reset right and left as current index 
 
 My PseudoCode - 
 //leetcode
 charatLeft == charatRight 
 increment right 
 window = right-left 
 else if charatLeft!=charatRight
 i ==left=right
 
 
 */

/*https://leetcode.com/problems/consecutive-characters/description/
1446. Consecutive Characters

The power of the string is the maximum length 
of a non-empty substring that contains only one unique character.

Given a string s, return the power of s.

 

Example 1:

Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.
Example 2:

Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
 

Constraints:

1 <= s.length <= 500
s consists of only lowercase English letters.
 * 
 * */
