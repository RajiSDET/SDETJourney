package dsa.week11;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class CW01_Nov21_ValidParenthesis {
	
	@Test
	public void test1(){
		Assert.assertTrue(isValid("({[]})"));
	}
	
	@Test
	public void test2(){
		Assert.assertTrue(isValid("()"));
	}
	
	@Test
	public void test3(){
		Assert.assertTrue(isValid("()[]{}"));
	}
	
	@Test
	public void test4(){
		Assert.assertFalse(isValid("(]"));
	}
	
	
	public boolean isValid(String s) {
        // Create an empty stack to hold characters
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the input string
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push it onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            // If it's a closing bracket, check for matching opening bracket
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop(); // Matching pair found
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop(); // Matching pair found
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop(); // Matching pair found
            } else {
                return false; // Invalid character or mismatched brackets
            }
        }   
        
        // If there are any unmatched brackets, return false
        return stack.isEmpty();
    }

}



/*Find if a given parentheses is valid or not
  eg. String input = "({[]})";
output = true;*/
