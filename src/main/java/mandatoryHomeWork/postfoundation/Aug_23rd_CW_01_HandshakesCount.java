package mandatoryHomeWork.postfoundation;

import org.junit.Test;

import junit.framework.Assert;

public class Aug_23rd_CW_01_HandshakesCount {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(0, HandshakesCalc(1));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(1, HandshakesCalc(2));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals((9+8+7+6+5+4+3+2+1), HandshakesCalc(10));
	}
	
	

	
	
	public int HandshakesCalc(int participantCount)
	{
		int maxhandshakes=0;
		
		if(participantCount==1)
		{
			maxhandshakes=0;
		}
		
		else 
		{
			for (int i = 1;i<=participantCount-1;i++) 
			{
				maxhandshakes+=i;
			}
			
		}
	
				
		return maxhandshakes;
	}

}

/*	

Pseudo code : Logic arrived - if there are n number of persons in a room 
Max possible handshakes = (sum of numbers from 1 to n-1)
ie : if 10 people in room the max posibl	
	
	

	*/
