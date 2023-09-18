package dsa.week1;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class SEP18_twopointer_practise_CW01 {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(3,counter_2_pointer(new int[] {1,2,3,4},new int[] {1,3,4,5}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(3,counter_2_pointer(new int[] {2,4,1},new int[] {1,4,2}));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(0,counter_2_pointer(new int[] {1},new int[] {2}));
	}
	public int counter_brute_force(int[] A, int[] B)
	{
		int counter =0;
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
		}
		
		for (int i = 0; i < B.length; i++) {
			if(!set.add(B[i]))
			{
				counter++;
			}
		}
		
		
		return counter;
	}

	
	public int counter_2_pointer(int[] A, int[] B)
	{
		int counter = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if(A[i]==B[j])
				{
					counter++;
				}
			}
			
		}
		return counter;
	}
}

/*PSEUDO CODE 2 pointer
 Sort both the arrays 
 have an index i scanning the array A
 have an index j scanning the array B
 whenever A[i] == B[j] increment the counter;
 */



/*PSEUDO CODE  Brute Force
 Create a SET which does not allow addition of duplicates 
 Have a counter c which will be the output 
 Add all elements of the array A inside Set 
 Now try adding all elements of B inside the same Set 
 Whenever Set.add throws false - Increment the counter 
 */

/*https://www.codechef.com/INTPREP_01/problems/PREP17?tab=statement
 Problem
Given two arrays A and B, each of size N, where each array consists of distinct elements.

Find the number of elements that are common in both the arrays. */
