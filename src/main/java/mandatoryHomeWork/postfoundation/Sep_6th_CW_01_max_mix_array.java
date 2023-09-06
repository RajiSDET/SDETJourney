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
	
	@Test
	public void test3()
	{
		Assert.assertEquals(0,minimizeIt(new int[] {8},2) );
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(14,minimizeIt(new int[] {10,4,20,19,9,4,20,14,15,10,9,15,8},9));
	}
	
	@Test
	public void test5()
	{
		Assert.assertEquals(10,minimizeIt(new int[] {11,9,12,16,1,14, 17, 14, 12, 11, 10, 3, 3, 9, 15, 4 ,8},7));
	}
	
	@Test
	public void test6()
	{
		Assert.assertEquals(10,minimizeIt(new int[] {11,9,12,16,1,14, 17, 14, 12, 11, 10, 3, 3, 9, 15, 4 ,8},7));
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
	     
	     for (int i = 0; i < A.length; i++)
	        {
	        	System.out.println(A[i]);
	        }
		 return A[A.length-1]-A[0];
	    }

}

//17,13,12,8,7,5,1
//16,12,

/*
 5
13 9
10 4 20 19 9 4 20 14 15 10 9 15 8 
17 7
11 9 12 16 1 14 17 14 12 11 10 3 3 9 15 4 8 
18 5
3 19 4 16 17 5 7 16 3 20 1 20 10 10 2 19 13 13 
17 7
2 1 19 19 11 3 7 7 14 14 4 20 1 4 9 20 19 
10 7
5 17 15 4 11 15 19 18 7 14
 *
 */

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
