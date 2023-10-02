package dsa.week3;

import java.util.Arrays;

public class AnagramUsingArray {
	
	
	
	public boolean iSAnagramCheck(String s, String t)
	{
		 int[] charCount = new int[26]; 

			for (int i = 0; i < charCount.length; i++) {
				charCount[ - 'a']--;
			}

			for (char c : t.toCharArray()) {
				charCount[c - 'a']--;
			}

			for (int count : charCount) {
				if (count != 0) {
					return false;
				}
			}
			return true;
	}

}

/*Pseudo Code 

if length does not match directly return false 
if length matches 
add s to array and sort the same 
add t to an array and sort the same 
use one for loop 
if both arrays are equal - return yes 
else return false 

 

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
