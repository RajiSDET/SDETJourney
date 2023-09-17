package mandatoryHomeWork.postfoundation;

import org.junit.Assert;
import org.junit.Test;

public class Sep17th_CW01_Sum_k_consequtive_ele_NatarajSolution {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(12,slidingWindow(new int[] {1,5,2,3,7,1},3) );
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(-13,slidingWindow(new int[] {-1,-5,-7},3) );
	}
	
	
	private int slidingWindow(int[] nums, int k){ 
		//1. one pointer should work 
		int max = Integer.MIN_VALUE, pointer = 0, currentSum = 0; 
		// not needed second pointer as this is balanced traversal ,right = k-1; 
		//2. Do the required operation till k index 
		//Calculate the sum of 1st 3 consequtive elements
		   while(pointer < k) 
			currentSum += nums[pointer++];
		   
		//3. continue the operation for rest of the array
		while( pointer < nums.length){
			max = Math.max(currentSum, max); 
		    currentSum += nums[pointer] - nums[pointer-k]; 
		    pointer++;
		    } 
		return Math.max(currentSum, max); 
		    
	}
	}



/*Pseudo Code
 
 Input Array of Integers - {1,5,2,3,7,1}
 Target(k) -3
 
 Output - highest sum of K consecutive elements 
 have 
 
 
 
 */
