package dsa.week5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import junit.framework.Assert;

public class Oct_16_HW_02_firstUniqChar {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(0, firstUniqChar("leetcode"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(2, firstUniqChar("loveleetcode"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(-1, firstUniqChar("aabb"));
	}
	

	
public int firstUniqChar(String s) {
       
        char uniChar = 0;
        Map <Character,Integer> map = new LinkedHashMap<Character,Integer>();
        for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
        
        for(Entry<Character, Integer> o: map.entrySet())
        {
                if(o.getValue()==1)
                {
                         uniChar= o.getKey();
                        
                         break;
                }
         }
     
             
        
        
        return s.indexOf(uniChar);
    }

}



/*Pseudo Code  - 
 
 INPUT = String s 
 OUTPUT = int index of the first non-repeating char 
 
  
                        
 Step 1 : Let us use an LinkedHashMap which maintains the insertion order 
 Step 2 : Store char as key and count of char as value 
 Step 3 : Scan through the map values and find that char whose count is just 1 
 Step 4 : If there are no such char whose occurrence count is just one directly return -1; else 
 Step 5 : Find out the index of that char in the input String s and return that index 
 
 */

/*https://leetcode.com/problems/first-unique-character-in-a-string/
 
 387. First Unique Character in a String

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1

Constraints:

1 <= s.length <= 105
s consists of only lowercase English letters.
 
 */
