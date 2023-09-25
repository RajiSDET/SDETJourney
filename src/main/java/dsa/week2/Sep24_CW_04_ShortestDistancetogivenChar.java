package dsa.week2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Sep24_CW_04_ShortestDistancetogivenChar {
	
	@Test
	public void test1()
	{
		Assert.assertArrayEquals(new int[] {3,2,1,0,1,0,0,1,2,2,1,0},bruteForce("loveleetcode",'e') );
	}
	
	
	public int[] bruteForce(String s, char c)
	{
		int[] output = new int[s.length()];
		List<Integer> indexList = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==c)
			{
				indexList.add(i);
			}
		}
		
		for (int i = 0; i < s.length(); i++) 
		{
			int min=Integer.MAX_VALUE;
			for(Integer t:indexList)
			{
				int diff = Math.abs(i-t);
				min=Math.min(diff, min);
			}
			output[i]=min;
		
		}
		
		return output;
	}

}

/*PSEUDO CODE // Sample - loveleetcode, e 
 INPUTS - String s and character c
 Output - int[] of same length that of String s
 
 scan through the array until end of array 
 find out the indices where e occurs and add that to a list 
 for each char in the String 
 calculate min_distance by getting abs diffrence of current index minus the values in list 
 whichever is minimum add the same to Output array
 */


/*https://leetcode.com/problems/shortest-distance-to-a-character/description/

821. Shortest Distance to a Character

Given a string s and a character c that occurs in s, 
return an array of integers answer where answer.length == s.length and answer[i] 
is the distance from index i to the closest occurrence of character c in s.

The distance between two indices i and j is abs(i - j), 
where abs is the absolute value function.

 

Example 1:

Input: s = "loveleetcode", c = "e"
Output: [3,2,1,0,1,0,0,1,2,2,1,0]
Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 3.
The closest occurrence of 'e' for index 1 is at index 3, so the distance is abs(1 - 3) = 2.
For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5, 
but the distance is still the same: abs(4 - 3) == abs(4 - 5) = 1.
The closest occurrence of 'e' for index 8 is at index 6, so the distance is abs(8 - 6) = 2.

Example 2:

Input: s = "aaab", c = "b"
Output: [3,2,1,0]
 

Constraints:

1 <= s.length <= 104
s[i] and c are lowercase English letters.
It is guaranteed that c occurs at least once in s.
 */
