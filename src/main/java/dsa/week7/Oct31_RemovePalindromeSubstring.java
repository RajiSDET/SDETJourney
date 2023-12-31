package dsa.week7;

import org.junit.Test;

import junit.framework.Assert;

public class Oct31_RemovePalindromeSubstring {
	
	@Test
	public void test1() {
		Assert.assertEquals(1, removePalindromeSub("ababa"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(2, removePalindromeSub("abb"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(2, removePalindromeSub("baabb"));
	}
	
public int removePalindromeSub(String s) {
	
	if(s.length()==0) {
		return 0;
	}
	
	for(int i=0; i<s.length(); i++) {
    	if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
    		return 2;
    	}	
    	}
    return 1;
	
	 
        
    }

}

/*PSEUDO CODE
 INPUT = String s 
 OUTPUT = count of palindromes 
 
Key learning - 
IF STRING IS PALINDROME THEN count can be defaulted to 1 
ie: only one SINGLE OPERATION REQUIRED

Subsequence don't have to be consecutive. (THEY CAN BE RANDOM ELEMENTS FROM STRING)

We can delete all characters 'a' in the single operation,
and then all characters 'b' in the 2nd operation.
return 2 when string becomes empty

Simple logic - 

If it's empty sting, return 0;
If it's palindrome, return 1;
Otherwise, we need at least 2 operation.

*/
/*https://leetcode.com/problems/remove-palindromic-subsequences/description/
1332. Remove Palindromic Subsequences

You are given a string s consisting only of letters 'a' and 'b'. In a single step you can remove one palindromic subsequence from s.

Return the minimum number of steps to make the given string empty.

A string is a subsequence of a given string if it is generated by deleting some characters of a given string without changing its order.
Note that a subsequence does not necessarily need to be contiguous.

A string is called palindrome if is one that reads the same backward as well as forward.

 

Example 1:

Input: s = "ababa"
Output: 1
Explanation: s is already a palindrome, so its entirety can be removed in a single step.
Example 2:

Input: s = "abb"
Output: 2
Explanation: "abb" -> "bb" -> "". 
Remove palindromic subsequence "a" then "bb".
Example 3:

Input: s = "baabb"
Output: 2
Explanation: "baabb" -> "b" -> "". 
Remove palindromic subsequence "baab" then "b".
 

Constraints:

1 <= s.length <= 1000
s[i] is either 'a' or 'b'.
*/
