package dsa.week11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HW01_884_Uncommon_Words {
	
	public String[] uncommonFromSentences(String s1, String s2) {
	      Map<String , Integer> map = new HashMap<>();
	        List<String> list = new ArrayList<String>();
	        for(String s : s1.split("\\s+")){
	            map.put(s,map.getOrDefault(s,0)+1);
	        }
	        for(String s : s2.split("\\s+	")){
	            map.put(s,map.getOrDefault(s,0)+1);
	        }
	       // System.out.println(map);
	        for(Map.Entry<String,Integer> m : map.entrySet()){
	            if(m.getValue()==1)
	              list.add(m.getKey());
	        }
	        //System.out.println(list);
	        String[] arr = list.toArray(new String[list.size()]);
	     //   System.out.println(Arrays.toString(arr));      
	        return arr;
	    }
}

/*BRUTE FORCE
 Create a MAP
 Add words of s1 inside MAP and its count
 Add words of s2 inside MAP and its count
 
 Those words which are having count as 1 should be added to the final output array
 
 remaining will be the unique elements only - return the same
 */

/*https://leetcode.com/problems/uncommon-words-from-two-sentences/
 884. Uncommon Words from Two Sentences
A sentence is a string of single-space separated words where each word consists only of lowercase letters.

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

 

Example 1:

Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]
Example 2:

Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]
 

Constraints:

1 <= s1.length, s2.length <= 200
s1 and s2 consist of lowercase English letters and spaces.
s1 and s2 do not have leading or trailing spaces.
All the words in s1 and s2 are separated by a single space.
 */
