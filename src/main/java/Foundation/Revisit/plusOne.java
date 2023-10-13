package Foundation.Revisit;

import org.junit.Assert;
import org.junit.Test;

public class plusOne {
	@Test
	public void test1()
	{
		Assert.assertArrayEquals(new int[] {9,0,0}, plusOne((new int[] {8,9,9})));
	}
	
	@Test
	public void test2()
	{
		Assert.assertArrayEquals(new int[] {1,0,0,0}, plusOne((new int[] {9,9,9})));
	}
	
	public int[] plusOne(int[] input) {
			
		for (int i = input.length-1; i>=0; i--) 
		{
			if(input[i]<9)
			{
				input[i]=input[i]+1;
				return input;
			}
			
			input[i]=0;
			
		}
		
		int[] output = new int[input.length+1];
		output[0]=1;
		return output;
		
	}

}

/*Pseudo Code

Step 1: Iterate over the array starting last index 
if the indexValue is less than 9 - Increment that particular indexValue and return the input as it is 
else indexValue = 0

Step 2 :
Declare an output array of size = inputarray size +1 
output[0] = 1
return output 


*/


/*https://leetcode.com/problems/plus-one/description/
 
 66. Plus One

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 

Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
 */
 