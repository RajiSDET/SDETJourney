package dsa.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class Sep19_SlidingWindowPractise_CW01 {
	
	@Test
	public void test1()
	{
		Set<Integer> expected = new LinkedHashSet<Integer>();
		expected.add(6);
		expected.add(4);
		Assert.assertEquals(expected, bruteforce_sol(new int[] {5, 6, 8, 2, 4, 6, 4},4));
	}
	
	@Test
	public void test2()
	{
		Set<Integer> expected = new LinkedHashSet<Integer>();
		expected.add(6);
		expected.add(4);
		
		Assert.assertEquals(expected, Sliding_window(new int[] {5, 6, 8, 2, 4, 6, 4},4));
	}
	

	@Test
	public void test3()
	{
		Set<Integer> expected = new LinkedHashSet<Integer>();
		expected.add(6);
		expected.add(8);
		expected.add(2);
		Assert.assertEquals(expected, bruteforce_sol(new int[] {5,6,8,2,4,6,8,2},4));
	}
	
	@Test
	public void test4()
	{
		Set<Integer> expected = new LinkedHashSet<Integer>();
		expected.add(2);
		expected.add(1);
		Assert.assertEquals(expected, bruteforce_sol(new int[] {1,2,2,1,1},2));
	}
	
	@Test
	public void test5()
	{
		Set<Integer> expected = new LinkedHashSet<Integer>();
		expected.add(1);
		expected.add(2);
		
		Assert.assertEquals(expected, bruteforce_sol(new int[] {1,2,1,2,1},3));
	}
	
	@Test
	public void test6()
	{
		Set<Integer> expected = new LinkedHashSet<Integer>();
		Assert.assertEquals(expected, bruteforce_sol(new int[] {1,2,3,4},4));
	}
	
		
	public Set bruteforce_sol(int[] input,int k)
	{
		int counter=0;
		Set<Integer> output = new LinkedHashSet<Integer>();
		for (int i = 0; i < input.length-k; i++) {
			Set<Integer> tempSet = new LinkedHashSet<Integer>();
			for (int j = i; j <=i+k; j++) 
			{		
				if(!tempSet.add(input[j]))
				{
					if(!output.contains(input[j]))
					{
					output.add(input[j]);
					counter++;
					}
				}
				System.out.println(Arrays.asList(tempSet));
				
			}
		}
		System.out.println(counter);
		return output;
	}

	
	public Set Sliding_window(int[] input,int k)
	{
		
		Set<Integer> output = new LinkedHashSet<Integer>();
		Set<Integer> tempSet = new LinkedHashSet<Integer>();
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
