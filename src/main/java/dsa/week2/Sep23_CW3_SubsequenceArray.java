package dsa.week2;

import org.junit.Test;

import junit.framework.Assert;

public class Sep23_CW3_SubsequenceArray {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(3, SmallestSubArray(new int[] {1,2,3,4,5}, 10));
	}
	
	
	public int SmallestSubArray(int[] arr,int k)
	{
	 int left =0, right =0;
	 int currentSum = 0;
	 int windowSize = Integer.MAX_VALUE;
	 while(right<arr.length)
	 {
		 if(currentSum<=k)
		 {
			 
		     currentSum+=arr[right++]; // Debug this point 
		     
		 }
		 while(currentSum>k)
		 {
			 windowSize=Math.min(windowSize,right-left);
			 currentSum-=arr[left++];
		 }
						
	 }	 
	
	 if(windowSize==Integer.MIN_VALUE)
	 {
		 return -1;
	 }
	 
	 return windowSize;
	}

}


/*PSEUDO CODE

 *

/*Given an array of positive integers find the smallest subsequence array
  length whose sum is elements is greater than a given number k

Backup - {1,2,3,4,5} 

Input arr = {1,2,4,5,5} k =10
Output int output = 2 ;
*/
