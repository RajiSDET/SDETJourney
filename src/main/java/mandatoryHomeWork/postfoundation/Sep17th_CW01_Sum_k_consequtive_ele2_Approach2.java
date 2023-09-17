package mandatoryHomeWork.postfoundation;

import org.junit.Assert;
import org.junit.Test;

public class Sep17th_CW01_Sum_k_consequtive_ele2_Approach2 {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(12,SumofKConseq(new int[] {1,5,2,3,7,1},3) );
	}
	

	public int SumofKConseq(int[] input,int k)
	{
		
		int max =0;
		
		if(k>input.length)
		{
			System.out.println("Invalid Input");
			return -1;
			
		}
		
		// Compute sum of first window of size k
        int sum = 0;
        for (int i=0; i<k; i++)
           sum += input[i];
      
        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of
        // current window.
        int curr_sum = sum;
        for (int i=k; i<=input.length-1; i++)
        {
           curr_sum += input[i] - input[i-k];
           max = Math.max(max, curr_sum);
        }
      
        return max;
	}

}

/*Pseudo Code
 
 Input Array of Integers - {1,5,2,3,7,1}
 Target(k) -3
 
 Output - highest sum of K consecutive elements 
 have two for loops 
 outer loop 
 
 
 
 */
