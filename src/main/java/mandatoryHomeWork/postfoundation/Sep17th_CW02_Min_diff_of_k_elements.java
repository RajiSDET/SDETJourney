package mandatoryHomeWork.postfoundation;

import org.junit.Assert;
import org.junit.Test;

public class Sep17th_CW02_Min_diff_of_k_elements {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2,minDiff(new int[] {9,4,1,7},3) );
	}
		
	public int minDiff(int[] Scores,int k)
	{
		
		int min =Integer.MAX_VALUE;
		
		for (int i = 0; i <=Scores.length-k; i++) 
		{
			int diff =Scores[0];
			for (int j = i+1; j <i+k ; j++) 
			{
				diff-=Scores[j];
			}
			
			System.out.println(diff);
			
			if(diff<min)
			{
				min=Math.min(min, diff);
				//System.out.println(min);
			}
		}
		return min;
	}

}

/*Pseudo Code
 INPUT - int scores[] , k=2
 OUTPUT - minimum difference between k elements  
 
 let us have two loops 
 let n be length of array
 outer loop to iterate between index 0 through n-k
 now for inner loop j = i until j=i+k find the difference 
 Store the least value as min
 
 
 */
