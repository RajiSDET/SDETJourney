package mandatoryHomeWork.postfoundation;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Aug_22nd_CW_01_Anagram {
	
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, Anagramtest("Hello","hello") );
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(false, Anagramtest("anagramm","marganaa"));
	}
	
	
	public boolean Anagramtest(String a,String b)
	{
		String A= a.toLowerCase();
		String B= b.toLowerCase();
		char[] chararr1 = A.toCharArray();
		char[] chararr2 = B.toCharArray();
		
		
		if(chararr1.length!=chararr2.length)
		{
			return false;
		}
		
		else if(chararr1.length==chararr2.length)
		{
			Arrays.sort(chararr1);
			Arrays.sort(chararr2);
			
			return Arrays.equals(chararr1, chararr2);
					
		}
		
		return false;
		
			
	}

}

/* PSEUDO CODE
 
 if length of charArray from String a != String b 
 directly return false 
 
 if length is equal 
 
 sort both the array 
 Convert the String to toChar array 
 Do index by index comparison such that if each character if either equal 
 to same case or relevant upper/lower case
 Set a Anagram_flag = true
 if at some point there is a mismatch set Anagram flag = false
 return Anagram_flag 
 if((chararr1[i]!=chararr2[i])||
				   (chararr1[i]!=Character.toUpperCase(chararr2[i]))||
				   (chararr1[i]!=Character.toLowerCase(chararr2[i])))
						
				{
					Anagram_flag=false;
				}
 	else if((chararr1[i]==chararr2[i])||
						   (chararr1[i]==Character.toUpperCase(chararr2[i]))||
						   (chararr1[i]==Character.toLowerCase(chararr2[i])))
								
						{
							Anagram_flag=true;
						}
				
 
 */

/* 
 * 
https://www.hackerrank.com/challenges/java-anagrams/problem
 Two strings,  and , are called anagrams 
 if they contain all the same characters in the same frequencies. 
 For this challenge, the test is not case-sensitive. 
 For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Sample Input 0

anagram
margana
 
  */

