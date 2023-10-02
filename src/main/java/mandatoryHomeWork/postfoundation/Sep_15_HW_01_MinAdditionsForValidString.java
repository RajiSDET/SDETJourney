package mandatoryHomeWork.postfoundation;

public class Sep_15_HW_01_MinAdditionsForValidString {
	
	public int addMinimum(String word) {
        int k = 0, prev = 'z', n = word.length();
        for (int i = 0; i < n; ++i) {
            k += word.charAt(i) <= prev ? 1 : 0;
            prev = word.charAt(i);
        }
        return k * 3 - n;
    }

}


/*PSEUDO CODE
 Took Help from ChatGPT 
 
1) a) Initialize variables k (keeps track of insertions needed), 
   b) prev (to store the previous character, initialized with a character greater than any valid character)
   c) n (length of the input word).
   
Example 1:
Input: word = "b"
Output: 2

2) Iterate through each character in the word:

If the current character is less than or equal to the previous character (prev), increment k (indicating an insertion is needed to maintain the order of "abc").
Update prev to the current character for the next iteration.
Calculate the total minimum insertions needed:

Multiply k by 3 (because for each insertion, we add 'a', 'b', and 'c').
Subtract n to account for the characters already present in the original word.
Return the calculated minimum insertions.

The logic is based on the fact that we want to maintain the order "abc" in the string, 
so we count the insertions needed to achieve this order and then calculate the 
total number of insertions considering 'a', 'b', and 'c' for each insertion.
 


/*PROBLEM STATEMENT - https://leetcode.com/problems/minimum-additions-to-make-valid-string/description/
 
 2645. Minimum Additions to Make Valid String
Given a string word to which you can insert letters "a", "b" or "c" anywhere 
and any number of times, return the minimum number of letters that must be inserted so that word becomes valid.

A string is called valid if it can be formed by concatenating the string "abc" several times.

Example 1:

Input: word = "b"
Output: 2
Explanation: Insert the letter "a" right before "b", and the letter "c" right next to "a" to obtain the valid string "abc".
Example 2:

Input: word = "aaa"
Output: 6
Explanation: Insert letters "b" and "c" next to each "a" to obtain the valid string "abcabcabc".
Example 3:

Input: word = "abc"
Output: 0
Explanation: word is already valid. No modifications are needed. 
 

Constraints:

1 <= word.length <= 50
word consists of letters "a", "b" and "c" only. 
 
 */
