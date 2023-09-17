package mandatoryHomeWork.postfoundation;

import org.junit.Assert;
import org.junit.Test;

public class Sep17th_CW01_Sum_k_consequtive_ele {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(12,SumofKConseq(new int[] {1,5,2,3,7,1},3) );
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(-13,SumofKConseq(new int[] {-1,-5,-7},3) );
	}
	
	
	public int SumofKConseq(int[] input,int k)
	{
		
		int max =Integer.MIN_VALUE;
		
		if(k>input.length)
		{
			System.out.println("Invalid Input");
			return -1;
			
		}
		
		for (int i = 0; i <= input.length-k; i++) // 
		{
			int sum=0;
			for (int j = i; j <i+k ; j++) 
			{
				sum+=input[j];
			}
			
			System.out.println(sum);
			
			if(sum>max)
			{
				max=Math.max(max, sum);
				System.out.println(max);
			}
			
			
		}
		return max;
	}

}

/*Pseudo Code
 
 Input Array of Integers - {1,5,2,3,7,1}
 Target(k) -3
 
 Output - highest sum of K consecutive elements 
 have 
 
 
 
 */
