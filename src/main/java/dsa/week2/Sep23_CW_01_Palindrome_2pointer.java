package dsa.week2;

import org.junit.Test;

import junit.framework.Assert;

public class Sep23_CW_01_Palindrome_2pointer {

	@Test
	public void test1()
	{
		Assert.assertEquals(false,ExpandFromCentre("RAJI"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true,ExpandFromCentre("RADAR"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(true,ExpandFromCentre("RaDaR"));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(false,ExpandFromCentre("TATA"));
	}
	
	public boolean PalindromeCheck(String s)
	{
		s=s.toLowerCase();
		
		int j = s.length()-1;
		for (int i = 0; i< s.length()/2; i++)
		{				
				if(s.charAt(i)!=s.charAt(j))
				{
					System.out.println(s.charAt(i));
					
					return false;
				}
				j--;			
			
		}
		return true;
	}


	public boolean ExpandFromCentre(String s)
	{
		s=s.toLowerCase();
		int centre = s.length()/2;
		int left = centre-1;
		int right=centre;
		
		if(s.length()%2!=0)
			right=centre+1;
		
		while(right<s.length())
		{
			s=s.toLowerCase();
			if(s.charAt(left)!=s.charAt(right))
			{
				return false;
			}
			right++;
			left--;
		}
		
		return true;
		
	}
}
