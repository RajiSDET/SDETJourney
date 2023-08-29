package mandatoryHomeWork.postfoundation;

import org.junit.Test;

import junit.framework.Assert;

public class Aug_29th_CW_02_Merge_Strings_Alternately {
	
	@Test
	public void test1()
	{
		Assert.assertEquals("apbqcrs", mergeAlternately("abc","pqrs"));
	}
	
	public String mergeAlternately(String word1, String word2) {
	    
		final int n = Math.min(word1.length(), word2.length());
		System.out.println(n);
	   
		StringBuilder sb = new StringBuilder();

	    for (int i = 0; i < n; ++i) {
	      sb.append(word1.charAt(i));
	      sb.append(word2.charAt(i));
	    }
	    
	    System.out.println(sb.toString());
	    System.out.println(word1.substring(n));
	    System.out.println(word2.substring(n));

	    return sb.append(word1.substring(n)).append(word2.substring(n)).toString();
	  }
	
}
/*
PSEUDO CODE
Get the minimum length amongst both the words 
create a new StringBuilder 
Loop from 0 to n sb.append(word1.charAt(i)) and sb.append(word2.charAt(i)
for remaining residue if any 
sb.append(word1.substring(n)).word2.substring(n)).toString() -> Return the same 




 */


/* https://leetcode.com/problems/merge-strings-alternately/
 1768. Merge Strings Alternately
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

 

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
 

Constraints:

1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.
 */
