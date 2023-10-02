package mandatoryHomeWork.postfoundation;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class Sep_13th_HW2_Reverse_StringWords_III {
	
	@Test
	public void test1()
	{
		Assert.assertEquals("s'teL ekat edoCteeL tsetnoc",reverseWords("Let's take LeetCode contest"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("doG gniD",reverseWords("God Ding"));
	}
	
	 public String reverseWords(String s) {
		 
		 String[] sArray = s.split(" ");
		 StringBuilder sb = new StringBuilder();
		
		 
		 for (int i = 0; i < sArray.length; i++) {
			 StringBuilder temp = new StringBuilder(sArray[i]);
			 temp.reverse();
			 sArray[i]=temp.toString();
		}
		 
		 
		for (int i = 0; i < sArray.length; i++) {
			sb.append(sArray[i]);
			sb.append(' ');
			
		}
		
		sb.deleteCharAt(sb.length()-1);
	        
		 return sb.toString();
	    }
	
	

}

/*Pseudo Code 
 Input - String s - words with spaces 
 Output - String reversed_s = reversed words 
 
 1. convert the String s to String Array of words based on Split using Spaces 
 2. take each string of the string array and reverse each word using sb.append followed by sb.reverse 
 and add one sb.append(" ") using an loop
 3. delete the final space in sb 
 4. return the sb as String
 
 
 
 
 */

/*https://leetcode.com/problems/reverse-words-in-a-string-iii/
 
 557. Reverse Words in a String III
Given a string s, reverse the order of characters in each word within a 
sentence while still preserving whitespace and initial word order.
 

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"
 

Constraints:

1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.*/
