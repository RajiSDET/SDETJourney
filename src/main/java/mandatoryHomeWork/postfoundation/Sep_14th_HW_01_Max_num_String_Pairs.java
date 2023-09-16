package mandatoryHomeWork.postfoundation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import junit.framework.Assert;

public class Sep_14th_HW_01_Max_num_String_Pairs {

	@Test
	public void test1() {
		Assert.assertEquals(9, addMinimum("aaaabb"));
	}

	@Test
	public void test2() {
		Assert.assertEquals(2, addMinimum("b"));
	}

	@Test
	public void test3() {
		Assert.assertEquals(6, addMinimum("aaa"));
	}

	@Test
	public void test4() {
		Assert.assertEquals(0, addMinimum("abcabc"));
	}

	@Test
	public void test5() {
		Assert.assertEquals(6, addMinimum("aaabac"));
	}

	@Test
	public void test6() {
		Assert.assertEquals(6, addMinimum("aaabbc"));
	}

	public int addMinimum(String word) {

		int counter = 0;
		StringBuilder sb = new StringBuilder();
		char[] charArray = word.toCharArray();
		String s1 = null;
		String s2 = null;
		String s3 = null;
		String s4 = null;

		System.out.println(word);

		if (word.contains("abc")) 
		{
			if (word.length() == 3) {
				return 0;
			}

			word = word.replace("abc", "");

			if (word.length() == 0) {
				return 0;
			} 
			
			else {

				if (word.contains("ab")) {

					s1 = word.replace("ab", "");
					counter = (word.length() - s1.length()) / 2;

				}
				if (s1.contains("bc")) {

					s2 = s1.replace("bc", "");
					counter += (s1.length() - s2.length()) / 2;

				}

				if (s2.contains("ac")) {

					s3 = s2.replace("ac", "");
					counter += (s2.length() - s3.length()) / 2;

				}

				if (s3 != null) {counter += s3.length() * 2;}
				else if (s2 != null) {counter += s2.length() * 2;}
				else if (s1 != null) {counter += s1.length() * 2;}
				else {counter += word.length() * 2;}

			}
		}

		else if (word.contains("ab")) //aaabbc
		
		{

			word = word.replace("ab", ""); //aabc
			counter++;  //1
			
			if (word.contains("abc")) { 
				word = word.replace("abc", ""); // a
				
			}
			
			if (word.contains("ab")) { 
				word = word.replace("ab", ""); // ac
				counter++; //2
			}
			
			if (word.contains("ac")) {
				word = word.replace("ac", ""); //
				counter++; //3
			}
			
			if (word.contains("bc")) {
				word = word.replace("bc", ""); //a
				counter ++;
			}
			
			if (word.length()>0)
			{
				counter+=word.length()*2;
			}
		} 
		
		
		else if (word.contains("ac")) {

			s1 = word.replace("ac", "");
			counter = (word.length() - s1.length()) / 2;

			if (s1.contains("bc")) {
				s2 = s1.replace("bc", "");
				counter += (s1.length() - s2.length()) / 2;
			}
			
			
			if (s2 != null) {counter += s2.length() * 2;} 
			else {counter += s1.length() * 2;}
		}

		else 
		{
			counter = word.length() * 2;
		}

		System.out.println(counter);

		return counter;

	}
}

/*
 * PSEUDO CODE Input - String word Output - int counter
 * 
 * 
 * Let us create a Map with key as a , b , c and its value as 0 to start with
 * Convert the String to char Array Iterate through the input String words and
 * update the values of respective keys in the map find out which among the 3
 * char has max value Calc how much are the remaining chars short by this max
 * value and increment the counter
 * 
 * 
 * 
 */

/*
 * https://leetcode.com/problems/minimum-additions-to-make-valid-string/ 2645.
 * Minimum Additions to Make Valid String Medium 466 17 Companies Given a string
 * word to which you can insert letters "a", "b" or "c" anywhere and any number
 * of times, return the minimum number of letters that must be inserted so that
 * word becomes valid.
 * 
 * A string is called valid if it can be formed by concatenating the string
 * "abc" several times.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: word = "b" Output: 2 Explanation: Insert the letter "a" right before
 * "b", and the letter "c" right next to "a" to obtain the valid string "abc".
 * Example 2:
 * 
 * Input: word = "aaa" Output: 6 Explanation: Insert letters "b" and "c" next to
 * each "a" to obtain the valid string "abcabcabc". Example 3:
 * 
 * Input: word = "abc" Output: 0 Explanation: word is already valid. No
 * modifications are needed.
 * 
 * 
 * Constraints:
 * 
 * 1 <= word.length <= 50 word consists of letters "a", "b" and "c" only.
 */