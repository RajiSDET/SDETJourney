package dsa.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

import junit.framework.Assert;

public class Sep28_HW_01_findallAnagrams {
	
	@Test
	public void test1()
	{
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(6);
		Assert.assertEquals(expected, AnagramIndices("cbaebabacd","abc"));
	}
	
	@Test
	public void test2()
	{
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		Assert.assertEquals(expected, AnagramIndices("baa","aa"));
	}
	
	public List<Integer> AnagramIndices(String s, String p )
	{
	    List<Integer> output = new ArrayList<Integer>();
			
	        int start =0;
			int end = p.length()-1;
			
						
			while(end<s.length())
			{
				String temp = "";
				ConcurrentHashMap<Character, Integer> cMap = new ConcurrentHashMap<Character, Integer>();
				
				for(int i = start;i<=end;i++)
				{
					temp+=s.charAt(i);
					
				}
						
				for (int i = 0; i < p.length(); i++) {
					char c1 = p.charAt(i);
					char c2 = temp.charAt(i);
					cMap.put(c1, cMap.getOrDefault(c1, 0) + 1);
					cMap.put(c2, cMap.getOrDefault(c2, 0) - 1);
				}
				 
				if(cMap.values().stream().allMatch(count->count==0)) 
				{
					output.add(start);
				}		
					
				 
				
						
				start++;
				end++;
				
			}
			
			return output;
		
	}
	
		
	

}

/*PSEUDO CODE - Brute Force
 * 
 INPUT - String s String p
 OUTPUT - List of start indices
 cbaebabacd
 start =0; end = p.length-1 = 3-1 = 2
 while end<s.length
 cba - 02 
 bae - 13
 aeb - 24
 eba - 35
 aba - 46
 bac - 57
 acd - 68
 
 */

/*  https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
 
 438. Find All Anagrams in a String

Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.

 

Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 

Constraints:

1 <= s.length, p.length <= 3 * 104
s and p consist of lowercase English letters.
 */
