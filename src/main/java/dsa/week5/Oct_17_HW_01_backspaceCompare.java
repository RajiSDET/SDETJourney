package dsa.week5;

import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class Oct_17_HW_01_backspaceCompare {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true,backspaceCompare("ab#c","ad#c") );
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true,backspaceCompare("ab##","c#d#") );
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(false,backspaceCompare("a#c","b") );
	}
	
public boolean backspaceCompare(String s, String t) {
	
	Stack<Character> stack_s = new Stack<>();
	Stack<Character> stack_t = new Stack<>();
	
	for (int i = 0; i < s.length(); i++) {
		 
		if(s.charAt(i)=='#')
		 {
			 if(!stack_s.isEmpty())
				{
				 stack_s.pop();
				}
			 
			 else if(stack_s.isEmpty())
				{
				 continue;
				}
		 }
		else
		{
			 stack_s.push(s.charAt(i));
		}
			
	}
	
	for (int i = 0; i < t.length(); i++) {
		 
		if(t.charAt(i)=='#')
		 {
			 if(!stack_t.isEmpty())
				{
				 stack_t.pop();
				}
			 
			 else if(stack_t.isEmpty())
				{
				 continue;
				}
		 }
		else
		{
			 stack_t.push(t.charAt(i));
		}
			
	}
	
	System.out.println(stack_s.equals(stack_t));
	
	
	
	return stack_s.equals(stack_t);
	
}}
 
/*PSEUDO CODE - Handle continuous ## - Do nothing in those cases 
 INPUTS - String s String t 
 Declare a Stack<Character> stack_s = new Stack<>();
 Declare a Stack<Character> stack_t = new Stack<>();
 
 Add each char to stack -
 if # is encountered - stack.pop(stack.peek());
 
 Compare both Stacks if equal - return true else return false 
 
 */

/* https://leetcode.com/problems/backspace-string-compare/
 
 844. Backspace String Compare
Given two strings s and t, return true if they are equal when both are typed into empty text editors. 
'#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
 

Constraints:

1 <= s.length, t.length <= 200
s and t only contain lowercase letters and '#' characters.

 
 */
