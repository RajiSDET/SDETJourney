package dsa.week6;

import java.util.HashMap;
import java.util.Map;

public class OCT_24_CW_01_restoreString {

	public String restoreString(String s, int[] indices) {

		Map<Integer,Character> map = new HashMap<Integer,Character>();

		for (int i = 0; i < indices.length; i++) {
			map.put(indices[i], s.charAt(i));
		}
		System.out.println(map);
		s="";

		for (int i = 0; i < indices.length; i++)
		{
			s=s+map.get(i);
		}
		return s;	

	}


}

/*
PSEUDO CODE 

CREATE A TREE MAP and Store the values of the both arrays {indices,s.charat[i]]
Iterate through the Map and Make a String 

 */
/*
 https://leetcode.com/problems/shuffle-string/

 1528. Shuffle String

You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

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
