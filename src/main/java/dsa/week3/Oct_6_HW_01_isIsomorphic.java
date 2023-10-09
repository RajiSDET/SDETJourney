package dsa.week3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

public class Oct_6_HW_01_isIsomorphic {
	
	@Test
	public void test1()
	{
		Assert.assertTrue(isIsomorphic("egg","add"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertFalse(isIsomorphic("foo","bar"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertTrue(isIsomorphic("paper","title"));
	}
	
	public boolean isIsomorphic(String s, String t) {
        int sArr[]=new int[200];
        int tArr[]=new int[200];

      for(int i=0;i<s.length();i++)
        {
            if(sArr[s.charAt(i)]!=tArr[t.charAt(i)])
                return false;

            sArr[s.charAt(i)]=i+1;
            tArr[t.charAt(i)]=i+1;
        }
        return true;
    }
	
public boolean isIsomorphic_using_Map(String s, String t) {
	
	Map<Character,Integer> smap = new HashMap<Character,Integer>();
	Map<Character,Integer> tmap = new HashMap<Character,Integer>();
	for (int i = 0; i < s.length(); i++) {
		smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0)+1);
		tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0)+1);
	}
	System.out.println(smap);
	System.out.println(tmap);
	
	Set<Integer> sSet = new TreeSet<>(smap.values()); 
	Set<Integer> tSet = new TreeSet<>(tmap.values()); 
	
	if(sSet.equals(tSet))
	{
		return true;
	}
	
	return false;
    }
	

}

/*PSEUDO CODE 
 
 Add the chars of s as Key and t as Value in a Map 
 Iterate through the map and build a string using SB 
 if the final SB.toString is same as t return true else return false
 
 */

/*https://leetcode.com/problems/isomorphic-strings/
 205. Isomorphic Strings

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character 
while preserving the order of characters. No two characters may map to the same character, 
but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
 

Constraints:

1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.
 
 
 
 
 */
