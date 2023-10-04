package dsa.week3;

import java.util.HashSet;
import java.util.Set;

public class Oct_4_HW_02_checkIfPangram {
	
	 public boolean checkIfPangram(String sentence) {
		 
		Set<Character> charset = new HashSet<Character>();
		for (int i = 0; i < sentence.length(); i++) {
			charset.add(sentence.charAt(i));
		} 
		if(charset.size()!=26)
		{
			return false;
		}
		return true;
	        
	    }
	

}

/*Pseudo Code
 add each char of the sentence to set 
 if set.size !=26 return false else return true;
 
 */

/*1832. Check if the Sentence Is Pangram

A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false

Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters.*/
