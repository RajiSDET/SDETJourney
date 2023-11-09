package dsa.week8;

public class Nov7_ValidAnagram {
	
	  public boolean isAnagram(String s, String t) {
		  int[] freArray = new int[26];
		  
		  if(s.length()!=t.length())
			{
				return false;
			}
		  
		  for (int i = 0; i < s.length(); i++) {
			  
			  freArray[s.charAt(i)-'a']++;
			  freArray[t.charAt(i)-'a']--;
		}
		  
		  for(int i : freArray)
		  {
			  if(i!=0) {
				  return false;
			  }
				  
		  }
		  
		  return true;
	  }

}

/*PSEUDO CODE 
 INPUTs -  String s and t 
 OUTPUT -  Boolean true if t contains all characters in s 
 false if t does-not have any character which is present in s 
 
  
 Approach 1 - Frequency count technique 
 if length of s and t are diffrent -> directly return false 
 else 
 integer array of size 26 
 array[charAt[i]-'a'] ++ for char at s  and -- for t 
 
 finally check if the int array contains value greater than 0 if yes - throw false else return true
 
 
 
 iterate through the 
  
 */

/*https://leetcode.com/problems/valid-anagram/
 
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
 

Follow up: What if the inputs contain Unicode characters? 
How would you adapt your solution to such a case?

 
 */
