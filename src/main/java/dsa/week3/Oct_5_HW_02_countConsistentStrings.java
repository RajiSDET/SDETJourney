package dsa.week3;

public class Oct_5_HW_02_countConsistentStrings {
public int countConsistentStrings(String allowed, String[] words) {
    int counter =0;
    
    for (String word:words) {
    	boolean flag =true;
    	for (int i = 0; i < word.length(); i++) 
    	{
			if(!allowed.contains(String.valueOf(word.charAt(i))))
			{
				flag=false;
				break;
			}
				
		}
    	if(flag)
    	{
    		counter++;
    	}
		
	}
    
    return counter;
	
    }
	

}

/*Pseudo Code 
 Inputs - String allowed , String[] words
 Consistent String = should contains only chars which are a part of String allowed
 Output - int count = Count the Number of Consistent Strings
 
 loop through the words array
 iterate through all chars in each string and check if allowed.contains(String.valueOf(targetChar))==false
 set flag as false and break - else let the flag be true and continue till end of string
 before next iteration if flag is true increment the counter 
 finally return the counter 
 */

/*https://leetcode.com/problems/count-the-number-of-consistent-strings/
 1684. Count the Number of Consistent Strings
 
You are given a string allowed consisting of distinct characters and an array of strings words. 
A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.

 
Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
Example 2:

Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.
Example 3:

Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
Output: 4
Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
 

Constraints:

1 <= words.length <= 104
1 <= allowed.length <= 26
1 <= words[i].length <= 10
The characters in allowed are distinct.
words[i] and allowed contain only lowercase English letters.
 */
