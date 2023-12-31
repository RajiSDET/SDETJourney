package dsa.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class Sep_20_CW01_Marriage_Balancer {
	@Test
	public void test1()
	{
		Assert.assertEquals("YES", MarriageBalancer("john johanna"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("YES", MarriageBalancer("ira ira"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals("NO", MarriageBalancer("kayla jayla"));
	}
	
	
	public String MarriageBalancer(String S)
	{
		String[] split = S.split(" ");// split[0] will be M and split[1] will be W
		
		if(split[1].length()<split[0].length())
		{
			return "NO";
		}
		
		
		List<Character> WList = new ArrayList<Character>();
		for (int i = 0; i < split[1].length(); i++) {
			WList.add(split[1].charAt(i));
		}
		System.out.println(Arrays.asList(WList));
		
		for (int i = 0; i < split[0].length(); i++) {
			if(!WList.contains(split[0].charAt(i)))
			{
				return "NO";
			}
			
		}
		
		return "YES";
	}

}

/*PSEUDO CODE Brute Force
 
 INPUT String S - Will contain parts M and W separated by space 
 Split the String S into two parts M and W using split by space 
 Convert M to Char Array 
 Scan for W to check if all chars of M is present in W 
 if yes return YES 
 else return NO 
 
 Edge case if length of W is less than M directly return NO
 
 */

/*Problem - https://www.codechef.com/problems/NAME2
 
In an attempt to control the rise in population, Archer was asked to come up with a plan. This time he is targeting marriages. Archer, being as intelligent as he is, came up with the following plan:

A man with name M is allowed to marry a woman with name W, only if M is a subsequence of W or W is a subsequence of M.

A is said to be a subsequence of B, if A can be obtained by deleting some elements of B without changing the order of the remaining elements.

Your task is to determine whether a couple is allowed to marry or not, according to Archer's rule.

Input
The first line contains an integer T, the number of test cases. T test cases follow. Each test case contains two space separated strings M and W.

Output
For each test case print "YES" if they are allowed to marry, else print "NO". (quotes are meant for clarity, please don't print them)

Constraints
1 ≤ T ≤ 100
1 ≤ |M|, |W| ≤ 25000 (|A| denotes the length of the string A.)
All names consist of lowercase English letters only.
Sample 1:
Input
Output
3
john johanna
ira ira
kayla jayla
YES
YES
NO
Explanation:
Case 1: Consider S = "johanna". So, S[0] = 'j', S[1] = 'o', S[2] = 'h' and so on. If we remove the indices [3, 4, 6] or [3, 5, 6] from S, it becomes "john". Hence "john" is a subsequence of S, so the answer is "YES".

Case 2: Any string is a subsequence of it self, as it is formed after removing "0" characters. Hence the answer is "YES".

Case 3: "jayla" can not be attained from "kayla" as removing any character from "kayla" would make the string length smaller than "jayla", also there is no 'j' in "kayla". Similar reasoning can be applied to see why "kayla" can't be attained from "jayla". Hence the answer is "NO".*/
