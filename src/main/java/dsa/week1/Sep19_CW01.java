package dsa.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class Sep19_CW01 {
	
	@Test
	public void test1()
	{
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(6);
		expected.add(4);
		Assert.assertEquals(expected, bruteforce_sol(new int[] {5, 6, 8, 2, 4, 6, 4},4));
	}
	
	@Test
	public void test2()
	{
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(6);
		expected.add(4);
		Assert.assertEquals(expected, Sliding_window(new int[] {5, 6, 8, 2, 4, 6, 4},4));
	}
	
	public List bruteforce_sol(int[] input,int k)
	{
		int counter=0;
		List<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < input.length-k; i++) {
			Set<Integer> tempSet = new HashSet<Integer>();
			for (int j = i; j <=i+k; j++) 
			{		
				if(!tempSet.add(input[j]))
				{
					output.add(input[j]);
					counter++;
				}
				System.out.println(Arrays.asList(tempSet));
				
			}
		}
		System.out.println(counter);
		return output;
	}

	
	public List Sliding_window(int[] input,int k)
	{
		
		List<Integer> output = new ArrayList<Integer>();
		Set<Integer> tempSet = new HashSet<Integer>();
		int pointer = 0;
		// not needed second pointer as this is balanced traversal ,right= k+1; 
		
		   while(pointer <= k) 
		   {
			   tempSet.add(input[pointer++]);
		   }
		   
		   System.out.println(tempSet);
		   
		   while( pointer < input.length){
			   
			   tempSet.remove(input[pointer-k-1]);
			   tempSet.add(input[pointer]);
			   if(!tempSet.add(input[pointer]))
			   {
				   output.add(input[pointer]);
				   System.out.println("List:"+ output);
				}
			   
			    pointer++;
			    } 
		//System.out.println(Arrays.asList(output));
		//System.out.println(Arrays.asList(counter));
		return output;
	}
}

/*PSEUDO CODE
 INPUT - int[] input and int k
 OUTPUT - Count of Duplicates 
 
 two for loops 
 i to range from 0 to length-k
 j to range from i to i+k
 Create Set 
 add elements to set 
 if set.add is false increment counter 
 else continue 
 
 */

/*Given an array and a positive number k, check whether the array contains any duplicate elements 
 * within the range k. 
 * If k is more than the array’s size, the solution should check for duplicates in the complete array.
 * 
 * Input:
 
nums[] = { 5, 6, 8, 2, 4, 6, 9 }
k = 4
 
Output: Duplicates found
 
(element 6 repeats at distance 4 which is <= k)
 * */
