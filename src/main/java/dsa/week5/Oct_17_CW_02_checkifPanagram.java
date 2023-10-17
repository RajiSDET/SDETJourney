package dsa.week5;

import java.util.HashSet;

import org.junit.Test;

import junit.framework.Assert;

public class Oct_17_CW_02_checkifPanagram {
	
	@Test
	public void test1()
	{
		Assert.assertTrue(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertFalse(checkIfPangram("leetcode"));
	}
	
	 public boolean checkIfPangram(String sentence) {
		 // Create a HashSet of char and add all chars in the sentence into set 
		 // if the size of set finally is 26 then the sentence had all alphabets else return false 
		 
		 HashSet<Character> set = new HashSet<Character>();
		 for (int i = 0; i < sentence.length(); i++) {
			set.add(sentence.charAt(i));
		}
		 if(set.size()==26) {
			 return true;
		 }
		 
		return false;
		 
	 }
	
	 public boolean checkIfPangram2(String sentence) {
		 
		 int[] charArray = new int[26];
		 for (int i = 0; i < sentence.length(); i++) {
			 charArray[sentence.charAt(i)-'a']++;
		}
		 for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]==0)
			{
				return false;
			}
		}
		 
		 return true;
	 }

}


/*PSEUDO CODE - Approach - Frequency Array 
 String Sentence
 INPUTS - 
 OUTPUT - TRUE or FALSE
 
 STEP 1 : Create an integer array of length 26 
 STEP 2 : for each char in sentence increment the index of the charArray 
 STEP 3 : scan through the integer array - if anywhere the value is 0 - return False
 STEP 4 : Else return True
 */


/*https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
 1832. Check if the Sentence Is Pangram

A panagram is a sentence where every letter of the English alphabet appears at least once.

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
sentence consists of lowercase English letters.
 */
