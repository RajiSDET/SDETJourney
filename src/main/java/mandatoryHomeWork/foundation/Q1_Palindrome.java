package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Q1_Palindrome {
	
	public boolean PalindromeCheck(int num)
	{
		if(num<0)
		{
			return false;
		}
		int temp = num;
		int remainder,sum=0;
		while (num>0)
		{
			remainder=num%10;
			sum=(sum*10)+remainder;
			num=num/10;
		}
		
		if(temp==sum)
		{
			return true;
		}
		
		
		return false;
		
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, PalindromeCheck(454));
	}
	@Test
	public void test2()
	{
		Assert.assertEquals(false, PalindromeCheck(-123));
	}
	@Test
	public void test3()
	{
		Assert.assertEquals(true, PalindromeCheck(2222));
	}
	@Test
	public void test4()
	{
		Assert.assertEquals(false, PalindromeCheck(2214422));
	}
	
	

}


/* Question : https://leetcode.com/problems/palindrome-number/description/
  Given an integer x, return true if x is a palindrome and false otherwise.
 
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

 */

/*
 * Input = int num
 * Output boolean 
 */

/*Pseudo Code 
 * Store the input num inside a int variable temp = num
 * declare int remainder=0,sum =0
 * 
 * if(num<0) directly return false since negative numbers cannot be palindrome
 * while n>0{
 * rem=num%10
 * sum=(sum*10)+rem
 * num=num/10}
 * Note:  4/10=0 ; 4%10=4
 * if temp==sum number is palindrome 
 * else numner is not a palindrome number
 */
