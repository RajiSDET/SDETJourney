package dsa.week3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;

public class Ransom_Note {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(false,ransome_note_HashMap("a","b") );
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true,ransome_note_HashMap("aa","aab") );
	}
	
	public boolean ransome_note_HashMap(String ransomNote, String magazine)
	{
		Map<Character,Integer> ransomNotemap = new HashMap<Character,Integer>();
		Map<Character,Integer> magazinemap = new HashMap<Character,Integer>();
		
		for (int i = 0; i < ransomNote.length(); i++) {
			
			//char c = ransomNote.charAt(i);
			ransomNotemap.put(ransomNote.charAt(i),ransomNotemap.getOrDefault(ransomNote.charAt(i), 0) + 1 );
		}
		
        for (int i = 0; i < magazine.length(); i++) {
			
			char c = magazine.charAt(i);
			magazinemap.put(c,magazinemap.getOrDefault(c, 0) + 1 );
		}
        
        MapDifference<Character, Integer> diff = Maps.difference(ransomNotemap, magazinemap);

        System.out.println(diff.entriesInCommon());
        System.out.println(diff.entriesOnlyOnLeft());	
        System.out.println(diff.entriesOnlyOnRight());

        if(diff.entriesOnlyOnLeft().isEmpty())
        {
        	return true;
        }
        
        return false;
        
       /* boolean flag = true;
                
        for(Entry<Character, Integer> rN: ransomNotemap.entrySet())
        {                
                  if(magazinemap.containsKey(rN.getKey()))
                		  {
                	          
                	          int MagValue = magazinemap.get(rN.getKey());
                	          int ransomValue = ransomNotemap.get(rN.getKey());
                	          
                	          if(MagValue<ransomValue)
                	          {
                	        	  flag= false;
                	        	  break;
                	          }
                	        		 
                		  }
                  
                  else if(!magazinemap.containsKey(rN.getKey()))
                    {
	                   return false;
                    }
                
        }
        
          return flag ;*/
        
	}


	/*Pseudo Code for frequency approach
	   if(ransomNote.length()>magazine.length()) directly return false;
	 declare the int[] array 
	  int[] arr = new int[26];
	 
	   for(int i=0;i<s.length();i++) {
                        arr[magazine.charAt(i)-'a']++; 
                        arr[ransomNote.charAt(i)-'a']--;
                }
	if anywhere in the int array the value is less than 0 return false 
	else return true 
	 
	 */
	
	public boolean ransome_note_frequency(String ransomNote, String magazine)	
	{
		 if(ransomNote.length()>magazine.length()) return false;
		 int[] arr = new int[26];
		 
		 for(int i=0;i<magazine.length();i++) {
             arr[magazine.charAt(i)-'a']++; 
            
         }
		 
		 for(int i=0;i<ransomNote.length();i++) {
             
             arr[ransomNote.charAt(i)-'a']--;
             if(arr[ransomNote.charAt(i)-'a']<0)
             {
            	 return false;
             }
         }
		 
         
     
      return true;

		
		
	}
}



/*MapDifference<Character, Integer> diff = Maps.difference(ransomNotemap, magazinemap);

System.out.println(diff.entriesInCommon());
System.out.println(diff.entriesOnlyOnLeft());	
//System.out.println(diff.entriesOnlyOnRight());

if(diff.entriesOnlyOnLeft().isEmpty())
{
	return true;
}*/

/*Pseudo Code 
 
 Inputs - 
 String ransomNote
 String magazine
 
 Problem Statement - Return true only if all characters of ransomNote should be present in Magazine 
 
 HashMap - 
 
 Create a Map1 having chars as Key and char count as Values 
 Create a Map2 having chars as Key and char count as Values 
 
 for each char in Map1 the Map2 value should be greater than or equal to Map1 value - If false anywhere return false else return true
  
 */

/*https://leetcode.com/problems/ransom-note/description/
 
 Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 

Constraints:

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
 
 */
