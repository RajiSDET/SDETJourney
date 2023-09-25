package dsa.week2;

import java.lang.reflect.Array;

import org.junit.Assert;
import org.junit.Test;

public class Sep23_CW2 {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(new Boolean[] {false, false, true, true}, SentencePalinCheck1("this is a Tst"));
	}

	public Boolean[] SentencePalinCheck1(String Sentence)
	{
		String[] SArray = Sentence.split(" ");
		Boolean[] output = new Boolean[SArray.length];
		
		for(int i=0;i<SArray.length;i++)
		{
			SArray[i]=SArray[i].toLowerCase();
			output[i] = new StringBuffer(SArray[i]).reverse().toString().equals(SArray[i]);
		}
		return output;
	}
	

}

/*
 INPUT String s - Sentence 
 OUTPUT Boolean Array of size same as sentence 
 Convert the sentence to String Array based on Space
 Take each Word and check if palindrome using the String Buffer statement 
 and write into output 
 
*/

/*Given an input String,return a boolean array 
 * by validate each of the word is a palindrome. 
 * Input = "this is a Tst" output = [false, false, true, true]
 */
