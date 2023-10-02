package mandatoryHomeWork.postfoundation;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class Sep_13th_HW1_Shuffle_String {
	
	@Test
	public void test1()
	{
		Assert.assertEquals("leetcode", restoreString("codeleet", new int[] {4,5,6,7,0,2,1,3}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("abc", restoreString("abc", new int[] {0,1,2}));
	}
	
	 public String restoreString(String s, int[] indices) {
		 Map <Integer,Character> map = new HashMap<Integer,Character> ();
		 StringBuilder sb = new StringBuilder();
		 for (int i = 0; i < indices.length; i++) {
			map.put(indices[i], s.charAt(i));
			
		}
		 for (int i = 0; i < indices.length; i++)
		 {
			 sb.append(map.get(i));
		 }
		 
		
	       return sb.toString(); 
	    }
	
	

}

/*Pseudo Code 
INPUT String s , int[] indices 
OUTPUT String s_shuffled

Create a Map

Using one for loop - 
Write the intArray indices as is into key of the map
Write the charArray of String s as is into respective value of the map

for iterate from 0 to length of array 
with index as of key of map - Build a String using the corresponding values 
Return the shuffled string*/


/* https://leetcode.com/problems/shuffle-string/description/
 1528. Shuffle String

You are given a string s and an integer array indices of the same length. 
The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.

Example 1:
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
Example 2:

Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.
 

Constraints:

s.length == indices.length == n
1 <= n <= 100
s consists of only lowercase English letters.
0 <= indices[i] < n
All values of indices are unique.
*/
 
