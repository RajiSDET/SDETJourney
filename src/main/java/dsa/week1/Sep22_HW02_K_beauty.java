package dsa.week1;

import org.junit.Test;

import junit.framework.Assert;

public class Sep22_HW02_K_beauty {
	
	@Test
	public void test1() {
		Assert.assertEquals(2, TwoPointersol(240,2));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(2, TwoPointersol(430043,2));
	} 
	
	@Test
	public void test3() {
		Assert.assertEquals(1, TwoPointersol(10,1));
	}
	
	
/* PSEUDO CODE 2 pointer
 Input  - int num ; int k ; 
 Output - int counter;
 
 Step 1: Convert the num to String 
 Step 2: Lets have two pointers starting from 0 to k-1
 Step 3: Convert or type cast this to int and check if num%temp ==0 
 Step 4: if yes increment counter k_beauty else increment the start and end indices 
 Step 5: Continue the loop until end indices reaches max length of num 
 
 */
	
public int TwoPointersol(int num,int k)
{
	int k_beauty=0;
	
	String s = ""+num;
	
	int start = 0;
	int end = k-1;
	
	while(end<s.length())
	{   
		StringBuilder sb = new StringBuilder();
		for (int i = start; i <= end; i++)
		{
			
			sb.append(s.charAt(i));
		}
		int temp = Integer.parseInt(sb.toString());
		if(temp!=0)
		{
		if(num%temp==0)
		{
			k_beauty++;
		}
		}
		start++;
		end++;
	}
	
	return k_beauty;
}
	
	
/*https://leetcode.com/problems/find-the-k-beauty-of-a-number/description/
	 2269. Find the K-Beauty of a Number

The k-beauty of an integer num is defined as the number of substrings 
of num when it is read as a string that meet the following conditions:

It has a length of k.
It is a divisor of num.
Given integers num and k, return the k-beauty of num.

Note:

Leading zeros are allowed.
0 is not a divisor of any value.
A substring is a contiguous sequence of characters in a string.

 

Example 1:

Input: num = 240, k = 2
Output: 2
Explanation: The following are the substrings of num of length k:
- "24" from "240": 24 is a divisor of 240.
- "40" from "240": 40 is a divisor of 240.
Therefore, the k-beauty is 2.
Example 2:

Input: num = 430043, k = 2
Output: 2
Explanation: The following are the substrings of num of length k:
- "43" from "430043": 43 is a divisor of 430043.
- "30" from "430043": 30 is not a divisor of 430043.
- "00" from "430043": 0 is not a divisor of 430043.
- "04" from "430043": 4 is not a divisor of 430043.
- "43" from "430043": 43 is a divisor of 430043.
Therefore, the k-beauty is 2.
 

Constraints:

1 <= num <= 109
1 <= k <= num.length (taking num as a string)
	 */

//Brute Force	
	public int divisorSubstrings(int num, int k) {
	    int k_beauty=0;
			String Str=""+num;  
					
			for (int i = 0; i <= Str.length()-k; i++) {
				StringBuilder sb= new StringBuilder();

				for (int j = i; j < i+k; j++) {
					sb.append(Str.charAt(j));
				}
				int divisor = Integer.parseInt(sb.toString());
				if(divisor!=0)
				{
					if(num%divisor==0)
					{
						k_beauty++;
					}
				}
			}
			
	      System.out.println(k_beauty);
	        return  k_beauty; 
	    }
}
