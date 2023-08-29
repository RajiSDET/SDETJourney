package mandatoryHomeWork.postfoundation;

import org.junit.Test;

import junit.framework.Assert;

public class Aug_29th_CW_01_Reverse_prefix_of_String {
	
	@Test
	public void test1()
	{
		Assert.assertEquals("dcbaefd", reversePrefix("abcdefd",'d'));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("zxyxxe", reversePrefix("xyxzxe",'z'));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals("abcd", reversePrefix("abcd",'z'));
	}
	
	/* Pseudo Code
	 identify the index+1 from first occurance of ch 
	 use String Builder 
	 extract word.substring(0,i) then reverse() then append (word.substring(i))
	 finally use .toString();
	 */
	
	 public String reversePrefix(String word, char ch) {
		    final int i = word.indexOf(ch) + 1;
		    return new StringBuilder(word.substring(0, i)) 
		        .reverse()                                 
		        .append(word.substring(i))                 
		        .toString();
		  }

}

/*
 https://leetcode.com/problems/reverse-prefix-of-word/
 
 2000. Reverse Prefix of Word

Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
Return the resulting string.

 

Example 1:

Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3. 
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
Example 2:

Input: word = "xyxzxe", ch = "z"
Output: "zxyxxe"
Explanation: The first and only occurrence of "z" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
Example 3:

Input: word = "abcd", ch = "z"
Output: "abcd"
Explanation: "z" does not exist in word.
You should not do any reverse operation, the resulting string is "abcd".
 

Constraints:

1 <= word.length <= 250
word consists of lowercase English letters.
ch is a lowercase English letter.
 */
