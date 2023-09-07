package mandatoryHomeWork.postfoundation;

import org.junit.Test;

import junit.framework.Assert;

public class Sep_6th_HW_01_truncate_sentence {
	
	@Test
	public void test1()
	{
		Assert.assertEquals("Hello how are you", truncateSentence("Hello how are you Contestant",4));
	}
	
	  public String truncateSentence(String s, int k) {
		  
		  StringBuilder sb= new StringBuilder();
		  String[]  strArray = s.split(" ");
		  
		  for (int i = 0; i <= k-1; i++) 
		  {
			  sb.append(strArray[i]).append(" ");
    		  
	    		 }
		  sb.deleteCharAt(sb.length()-1);
		  String Output = sb.toString();
		  System.out.println(sb);
		  return  Output;
	        
	    }

}

/* PSEUDO CODE 
 INPUT  - String s , int k
 OUTPUT - String sb
 Convert the Sentence into array of String having words - StrArray
 Declare an Output String Builder sb 
 scan through the StrArray from 0 to k
 Append StrArray+one space


 * */

/*
 https://leetcode.com/problems/truncate-sentence/
 
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. 
Each of the words consists of only uppercase and lowercase English letters (no punctuation).

For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s​​​​​​ and an integer k​​​​​​. 
You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. 
Return s​​​​​​ after truncating it.

 

Example 1:

Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".
Example 2:

Input: s = "What is the solution to this problem", k = 4
Output: "What is the solution"
Explanation:
The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].
The first 4 words are ["What", "is", "the", "solution"].
Hence, you should return "What is the solution".
Example 3:

Input: s = "chopper is not a tanuki", k = 5
Output: "chopper is not a tanuki"
 

Constraints:

1 <= s.length <= 500
k is in the range [1, the number of words in s].
s consist of only lowercase and uppercase English letters and spaces.
The words in s are separated by a single space.
There are no leading or trailing spaces.
 
 

 */
