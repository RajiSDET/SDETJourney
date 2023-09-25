package dsa.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class  Sep22_HW01_sort_array_by_parity  {
	@Test
	  public void test1()
	{
		Assert.assertArrayEquals(new int[] {4,5,2,7}, Sorter_2Pointer_sol(new int[] {4,2,5,7}));
		}
	
	@Test
	  public void test2()
	{
		Assert.assertArrayEquals(new int[] {4,5,2,7}, Brute_force_Sorter(new int[] {4,2,5,7}));
		}
	
	/*PSEUDO CODE -  Swapping two variables at a time using 2 pointer approach 
	 Array is having equal number of odd and even 
	 Thus array length will always be even 
	 Array will start with even index and end at an odd index 
	 
	 let n = Array.length
	 Initialize 2 pointers left=0 and right= n-1
	 
	 Let us traverse in opposite directions by taking two steps at a time 
	 
	 4 possible cases - 
	 Case 1 :
	 [left] !=even && arr[right] !=odd -> Directly swap these two elements 
	 and increment/decrement pointers by 2 
	 
	 Case 2 :
	 [left] ==even && arr[right]==odd -> Do nothing but simply 
	 increment/decrement pointers by 2 
	 
	  Case 3 :
	 [left] !=even && arr[right]==odd -> Do nothing but simply 
	 decrement right by 2 
	 
	  Case 4 :
	 [left] ==even && arr[right]!=odd -> Do nothing but simply 
	 increment left by 2 
	 
	 
	 */
	
		
	public int[] Sorter_2Pointer_sol(int[] nums) {
		
		int n=nums.length,left=0,right=n-1;
		while(right>=0&&left<n)
		{
			//Both indexes are wrong let us swap and increment pointers by 2
			if((nums[left]%2!=0)&&(nums[right]%2==0))
            { int temp =nums[right];
              nums[right]= nums[left];
              nums[left]=temp;
              left=left+2;
              right=right-2;
	        }
			//left index alone is incorrect - just decrement the right pointer 
			else if((nums[left]%2!=0)&&(nums[right]%2!=0))
			{
				right=right-2;
			}
			
			//right index alone is incorrect - just increment the left pointer 
			else if((nums[left]%2==0)&&(nums[right]%2==0))
			{
				left=left+2;
			}
			
			// if both the conditions are met 
			else
			{
				left=left+2;
	            right=right-2;
				
			}
		}
		
	
		return nums;
		
	}
	
	public int[] Brute_force_Sorter(int[] nums) {
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}
		
		int i=0;
		int j=1;
		for (Integer t:list) 
		{
			if (t%2==0)
			{
				nums[i]=t;
				i+=2;
			}
			else
			{
				nums[j]=t;
				j+=2;
			}
			
		}
		
		return nums;
		
		
	}

}

/*PSEUDO CODE
 4,2,5,7
 Array length is always going to be Even 
 let int  i point to even indices 
 let int  j point to odd indices 
 
 
 Add all elements to into a list 
 scan through all elements of array
 fill the input array at index i if the num is even 
 fill the input array at index j if num is odd
 
 
 
 
 */

/* https://leetcode.com/problems/sort-array-by-parity-ii/description/
 
922. Sort Array By Parity II

Given an array of integers nums, 
half of the integers in nums are odd, 
and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, 
and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.

Example 1:

Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
Example 2:

Input: nums = [2,3]
Output: [2,3]
 

Constraints:

2 <= nums.length <= 2 * 104
nums.length is even.
Half of the integers in nums are even.
0 <= nums[i] <= 1000
*/
