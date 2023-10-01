package dsa.week3;

import java.util.HashMap;
import java.util.Map;

public class Anagram_using_Map {
	
	public boolean AnagramCheck(String s,String t )
	{
		if(s.length()!=t.length())
		{
			return false;
		}
		
		Map<Character,Integer> sMap = new HashMap<Character,Integer>();
		Map<Character,Integer> tMap = new HashMap<Character,Integer>();
		
		if(s.length()!=t.length())
		{
			return false;
		}
		
		for (int i = 0; i < s.length(); i++) {
			
			 if(sMap.keySet().contains(s.charAt(i)))
             {
				 sMap.put(s.charAt(i),s.charAt(i)+1);
             }
			 
             else {
                   sMap.put(s.charAt(i),1);
               }
			 
			 
			 if(tMap.keySet().contains(t.charAt(i)))
             {
				 tMap.put(t.charAt(i),t.charAt(i)+1);
             }
			 
             else {
                   tMap.put(t.charAt(i),1);
               }
			
		}
		
		
		
		
		return sMap.equals(tMap);
	}

}

/*Pseudo Code 
 
if length is mismatch - directly return false 
 
 Let us have two maps - smap and tmap 
 smap - character and its count 
 tmap - character and its count 
 

 */

/*
 https://leetcode.com/problems/valid-anagram/
 
 242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 
 
 */
