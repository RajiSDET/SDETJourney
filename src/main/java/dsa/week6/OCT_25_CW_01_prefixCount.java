package dsa.week6;

public class OCT_25_CW_01_prefixCount {
	
public int prefixCount(String[] words, String pref) {
       
	int counter=0;
	for(String word : words) {
		if(word.length()>=pref.length()) {
		String substring = word.substring(0, pref.length());
		if(substring.length()>=pref.length()) {
			if(substring.equals(pref)) {
				counter++;
			}
		}
		}
	}
	
	return counter;
    }

}

/*PSEUDO CODE - 

Step 1 : Initialize a counter
Step 2 : Iterate through each word in the String 
Step 3 : Each word extract the Substring of size that of the given prefix 
Step 4 : Compare the Substring with the prefix if equal increment counter 
Step 5 : Finally increment Counter 

Edge case if length of word is less than prefix simply continue without incrementing counter 


/*https://leetcode.com/problems/counting-words-with-a-given-prefix/description/
 2185. Counting Words With a Given Prefix

You are given an array of strings words and a string pref.
Return the number of strings in words that contain pref as a prefix.
A prefix of a string s is any leading contiguous substring of s.

 

Example 1:

Input: words = ["pay","attention","practice","attend"], pref = "at"
Output: 2
Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
Example 2:

Input: words = ["leetcode","win","loops","success"], pref = "code"
Output: 0
Explanation: There are no strings that contain "code" as a prefix.
 

Constraints:

1 <= words.length <= 100
1 <= words[i].length, pref.length <= 100
words[i] and pref consist of lowercase English letters.
 */
