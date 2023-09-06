package mandatoryHomeWork.postfoundation;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Sep_6th_CW_01_max_mix_array {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(5,minimizeIt(new int[] {1,5, 8,10},2) );
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(3,minimizeIt(new int[] {1,2,3,4,5},2) );
	}
	
	 public static int minimizeIt(int[] A, int K) {
	        
	        for (int i = 0; i < A.length; i++) {
	        	if(A[i]<=K)
	        	{
	        		A[i]+=K;
	        	}
	        	else
	        	{
	        		A[i]-=K;
	        	}
				
			}
	        
	     Arrays.sort(A);
		 return A[A.length-1]-A[0];
	    }

}

/*PSEUDO CODE
Input 
int array and int inc_dec_factor

Output 
int min diff 

if arr[i]<=k -> arr[i]+k
else arr[i]-k
Sort the array 
return arr[length-1]-arr[0]


 * 
 * */
