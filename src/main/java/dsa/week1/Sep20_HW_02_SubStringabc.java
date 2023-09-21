package dsa.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sep20_HW_02_SubStringabc {
	
	public static void main(String[] args) {
	
		String S = "abcabc";
		//String S = "aaacb";
		/*System.out.println(S.substring(0, S.length()));
		System.out.println(S.substring(0, S.length()-1));
		System.out.println(S.substring(0, S.length()-2));
		System.out.println(S.substring(0, S.length()-3));*/
		//int i=0;
		
		/*while(S.length()-i>=3)
		{
			System.out.println(S.substring(j, S.length()-i));
			i++;
		}*/
		
		//abcabc
		/*for (int i=0;i<=S.length()-3;i++)
		{
			
		 System.out.println(S.substring(i, S.length()));
		
		}
		
		for (int i=1; i<=S.length()-3;i++)
		{
			
		 System.out.println(S.substring(i, S.length()));
		
		}
		
		for (int i=2; i<=S.length()-3;i++)
		{
			System.out.println(S.substring(i, S.length()));
		
		}
		
		for (int i=3; i<=S.length()-3;i++)
		{
			System.out.println(S.substring(i, S.length()));
		
		}*/
		
		int j=0;
		String expected ="abc";
		List<String> expectedStrings = new ArrayList<String>();
		
		while (j<=S.length()-3)
		{
			for (int i=j; i<=S.length()-3;i++)
			{
				//System.out.println(S.substring(i, S.length()));
				
				String tempString = S.substring(i, S.length());
				
				List<Character> tempList = new ArrayList<Character>();
				for (int z = 0; z < tempString.length(); z++)
				{
					tempList.add(tempString.charAt(z));
				}
				for (int k = 0; k < expected.length(); k++)
				{
					if(!tempList.contains(expected.charAt(k)))
					{
						break;
					}
					
				}
				expectedStrings.add(tempString);
			}
			
			j++;
		}
		System.out.println(Arrays.asList(expectedStrings));
		System.out.println(expectedStrings.size());
	}
	}
	

//TATA
	

/*PSEUDO CODE
 abcabc
 
 abc     
 bca
 cab
 abc
 
 abca	
 bcab
 cabc
 
 abcab
 bcabc
 
 abcabc Substring(0,length)
 */


/* https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/
 
Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least one occurrence of all these characters a, b and c.

Example 1:

Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 
Example 2:

Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 
Example 3:

Input: s = "abc"
Output: 1
 

Constraints:

3 <= s.length <= 5 x 10^4
s only consists of a, b or c characters.*/
