package mandatoryHomeWork.postfoundation;

import org.junit.Test;

import junit.framework.Assert;

public class Sep_13th_CW_02_Palindrome_Check_after_delete_char {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true,validPalindrome("ABCDCBA") );
	}
	@Test
	public void test2()
	{
		Assert.assertEquals(false,validPalindrome("sjdndk") );
	}
	
	public static boolean validPalindrome(String s) {
		
		boolean isPalindrome=false;
		
		for (int i = 0; i < s.length(); i++) {
			StringBuilder sb = new StringBuilder(s);
						
			if(sb.deleteCharAt(i).toString().equals(sb.reverse().toString()))
			{
				isPalindrome=true;
				break;
			}
			
		}
		
		return isPalindrome;
	}

}

/*PSEUDO CODE
 INPUT String s
 Output Boolean - true if palindrome else false
 
 Logic 
 s = "VWHGWV"
 Set a flag - isPalindrome = false
 
 Loop through array of chars from String
  
 Write this to a StringBuilder
 delete char at specific index 
 compare the sb with sb.reverse 
 if they are equal in any iteration set isPalindrome = true and break
  
 */

/*https://www.codingninjas.com/studio/problems/valid-palindrome_2663285
 
Problem Statement
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
2
8
AZBCDCBA
3
ABA
Sample Output 1:
YES
YES
Explanation Of Sample Input 1:
For the first test case,
If we remove the letter ‘Z’ from the string , the remaining string ‘ABCDCBA’ is palindromic.Hence, the answer is YES.

For the second test case:
The given string is already palindromic. Hence, the answer is YES.
Sample Input 2:
2
6
ROSSVR
6
VWHGWV
Sample Output 2:
NO
YES










 */
