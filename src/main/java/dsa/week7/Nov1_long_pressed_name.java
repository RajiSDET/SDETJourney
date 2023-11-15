package dsa.week7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Nov1_long_pressed_name {
	 public boolean isLongPressedName(String name, String typed) {
	      
		 Map <Character,Integer> tmap = new LinkedHashMap<Character,Integer>();
		 Map <Character,Integer> nmap = new LinkedHashMap<Character,Integer>();
		 
		 Set<Character> tSet = new LinkedHashSet<Character>();
		 Set<Character> nSet = new LinkedHashSet<Character>();
		 
		
		 
		 if(tmap.size()!=nmap.size())
		 {
			 return false;
		 }
		 
		 
		 
		 for (int i = 0; i < typed.length(); i++) {
			tmap.put(typed.charAt(i), tmap.getOrDefault(typed.charAt(i), 0)+1);
			tSet.add(typed.charAt(i));
		 }
		 
		 for (int i = 0; i < name.length(); i++) {
				nmap.put(name.charAt(i), nmap.getOrDefault(name.charAt(i), 0)+1);
				nSet.add(name.charAt(i));
			 }
		 
		
		 List<Character> tList = new ArrayList<Character>(tSet);
		 List<Character> nList = new ArrayList<Character>(nSet);
		
		 if(!tList.equals(nList)) {
			 System.out.println("not equal");
		 }
		 
		 
			 
		 for (Map.Entry<Character, Integer> entry : nmap.entrySet()) {
			Character nkey = entry.getKey();
			
						
			if(!tmap.containsKey(nkey)) {
				return false;
			}
			
			if(tmap.get(nkey)<nmap.get(nkey)){
				return false;
			}
				
		}
		 return true;
		 
	    }
}

/*PSEUDO CODE
 INPUT - String name String typed 
 OUTPUT - boolean - return true if all chars of name is present in typed else return false
 
 */

/*
https://leetcode.com/problems/long-pressed-name/
925. Long Pressed Name
Your friend is typing his name into a keyboard. Sometimes, when typing a character c, 
the key might get long pressed, and the character will be typed 1 or more times.

You examine the typed characters of the keyboard. 
Return True if it is possible that it was your friends name, with some characters (possibly none) 
being long pressed.
 

Example 1:

Input: name = "alex", typed = "aaleex"
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.
Example 2:

Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it was not in the typed output.
 

Constraints:

1 <= name.length, typed.length <= 1000
name and typed consist of only lowercase English letters.
 
 */
