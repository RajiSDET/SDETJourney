package mandatoryHomeWork.postfoundation;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class Aug18_HW_01_SpyNumber

{
	@Test
	public void test1()
	{
		Assert.assertEquals(true, SpyNumberCheck(132));
	}	
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, SpyNumberCheck(1124));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(true, SpyNumberCheck(0));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(true, SpyNumberCheck(-132));
	}
	
	public boolean SpyNumberCheck(int num)
	{
		if (num==0)
		{
			return true;
		}
		
		if (num<0)
		{
			num=num*-1;
		}
		
		
		List <Integer> list = new ArrayList<Integer>();
		int sum = 0;
		int product =1;
		while(num>0)
		{
			list.add(num%10);
			num=num/10;
		}
		
		for(Integer t:list)
		{
			if(t==0)
			{
				return false;
			}
			
			sum+=t;
			product*=t;
			
		}
		
		if(sum==product)
		{
			return true;
		}
				
		return false;
	}

}


/*
 
 
 */
