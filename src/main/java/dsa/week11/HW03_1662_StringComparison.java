package dsa.week11;

import org.junit.Assert;
import org.junit.Test;

public class HW03_1662_StringComparison {

	@Test
	public void test1() {
		String[] word1 = {"ab", "c"};
		String[] word2 = {"a", "bc"};
		Assert.assertTrue(arrayStringsAreEqual(word1,word2));
	}
	
public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
			sb1.append(word1[i]);
		}
        for (int i = 0; i < word2.length; i++) {
			sb2.append(word2[i]);
		}
        
        return sb1.toString().equals(sb2.toString());
    }
}

/*Step 1: Using a String Builder convert word1 and word2 arrays to a single sb
  Step 2 : Compare values of both arrays if equal return true else return false*/

/*https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

 

Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
Example 3:

Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
 

Constraints:

1 <= word1.length, word2.length <= 103
1 <= word1[i].length, word2[i].length <= 103
1 <= sum(word1[i].length), sum(word2[i].length) <= 103
word1[i] and word2[i] consist of lowercase letters.
 */