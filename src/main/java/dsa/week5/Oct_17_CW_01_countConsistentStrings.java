package dsa.week5;
import java.util.HashSet;
import java.util.Set;

public class Oct_17_CW_01_countConsistentStrings {
	
	public int countConsistentStrings(String allowed, String[] words) {
	    //Total number of words in the String Array  
		int result = words.length;
		// Add the characters in the String allowed inside an HashSet 
		Set<Character> allowedSet = new HashSet<Character>();
		
	    for (Character c: allowed.toCharArray()){
	    	allowedSet.add(c);
	    }
		
		 
	  //Check if each char in word is present in the set - IF not decrement the result and finally return the result 
		 		 
		 for (String word:words) {
			 for (int i = 0; i < word.length(); i++) {
				if(!allowedSet.contains(word.charAt(i))) {
					result--;
					break;
				}
			}
		    	
		 }
		return result;
		   
	    
		  }
	

}



/*PSEUDO CODE
 
 ADD the allowed inside Frequency Array
 For each word inside the String[] of words 
 check if each character of the word has 
  
 */

/*
 https://leetcode.com/problems/count-the-number-of-consistent-strings/description/
 1684. Count the Number of Consistent Strings
You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.

Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
Example 2:

Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.
Example 3:

Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
Output: 4
Explanation: Strings "cc", "acd", "ac", and "d" are consistent.

Constraints:

1 <= words.length <= 104
1 <= allowed.length <= 26
1 <= words[i].length <= 10
The characters in allowed are distinct.
words[i] and allowed contain only lowercase English letters.
 */
