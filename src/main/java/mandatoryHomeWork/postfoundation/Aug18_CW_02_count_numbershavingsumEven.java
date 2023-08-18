package mandatoryHomeWork.postfoundation;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class Aug18_CW_02_count_numbershavingsumEven {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2, SumOfDigitsEven(4));
	}
	@Test
	public void test2()
	{
		Assert.assertEquals(14, SumOfDigitsEven(30));
	}
	
	public int SumOfDigitsEven(int num)
	
	{
		int counter =0;
		
		for (int i = 1; i <= num; i++) 
		{
			List<Integer> digitlist = new ArrayList<Integer>();
			int temp = i;
			while(temp>0) 
			{				
				digitlist.add(temp%10);
				temp=temp/10;
			}
			
			
			
			int sum=0;
			
			for(Integer digit:digitlist)
			{
				System.out.println(digit);
				sum+=digit;
				
			}
			System.out.println(sum);
			
			if(sum%2==0)
			{
				counter++;
			}
			System.out.println(counter);
			
		}
		
		return counter;
	}
	

}

/*
 PSEUDO CODE
 
 Input integer num 
 Output integer counter 
 
 sum of digits of each number within num who sum is even 
 
 for (int i =0 through num )
 {
 Extract the digits of each num 
 add this to a temp list 
 sum all elements of list 
 check if sum%2==0; -> Increment counter 
 }
 
 
 */

/*
 Given a positive integer num, return the number of positive integers less than or equal to num whose digit sums are even.

The digit sum of a positive integer is the sum of all its digits.

Example 1:

Input: num = 4
Output: 2
Explanation:
The only integers less than or equal to 4 whose digit sums are even are 2 and 4.    
Example 2:

Input: num = 30
Output: 14
Explanation:
The 14 integers less than or equal to 30 whose digit sums are even are
2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, and 28.
 */
