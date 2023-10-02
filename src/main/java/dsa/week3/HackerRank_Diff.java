package dsa.week3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HackerRank_Diff {
	
	public static int pairs(int k, List<Integer> arr) {
	    
		Set<Integer> set = new HashSet<Integer>(arr);
		int outputcounter =0;
		for(Integer t: arr)
		{
			int temp = t-k;
			if(!set.add(temp))
			{
				outputcounter++;
			}
		}
		return outputcounter;
		
	    }

}



/*Pseudo Code - 2 pointer solution 
 Inputs - List<Integer> arr , int k;
 Output - Number of pairs whose difference is=k
 initialize counter int outputcounter =0;
 
 Convert List to Array 
 Sort the Array // {4,2,1,3} k = 1 ; Expected output - 3
 4-1 = 3 1 
 2-1 = 1 2
 1-1 = 0 2
 3-1 = 2 3 
 
 Iterate through all elements in the array and find out the difference between the current element and 
 k if that value is present in list increment counter 
 
 Approach 1 - Opposite direction two pointers 
 left = 0 ; right = left+1
 current_diff = arr[right]-arr[left] 
 if(current_diff = target) 
 {
  outputcounter++;
  left++; //0
 }
 else (current_diff > target)
 {
 right--;
 }
 else(current_diff < target)
 {
 left++;
 }
 
 
 
 --------------------------------------------------------------------------
 
 
 */

/*https://www.hackerrank.com/challenges/pairs/problem?isFullScreen=true
 
 Given an array of integers and a target value, determine the number of pairs of array elements that have a difference equal to the target value.

Example


There are three values that differ by : , , and . Return .

Function Description

Complete the pairs function below.

pairs has the following parameter(s):

int k: an integer, the target difference
int arr[n]: an array of integers
Returns

int: the number of pairs that satisfy the criterion
Input Format

The first line contains two space-separated integers  and , the size of  and the target value.
The second line contains  space-separated integers of the array .

Constraints

each integer  will be unique
Sample Input

STDIN       Function
-----       --------
5 2         arr[] size n = 5, k =2
1 5 3 4 2   arr = [1, 5, 3, 4, 2]
Sample Output

3
Explanation

There are 3 pairs of integers in the set with a difference of 2: [5,3], [4,2] and [3,1]. .
 */
