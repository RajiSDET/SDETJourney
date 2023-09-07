package mandatoryHomeWork.postfoundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class Sep4th_HW_01_String_is_Acronym {
	
	@Test
	public void test1()
	{
		ArrayList<String> words = new ArrayList<String>(Arrays. asList("alice","bob","charlie"));
		Assert.assertEquals(true,isAcronym(words,"abc") );
	}
	
	@Test
	public void test2()
	{
		ArrayList<String> words = new ArrayList<String>(Arrays. asList("an","apple"));
		Assert.assertEquals(false,isAcronym(words,"a") );
	}
	
	@Test
	public void test3()
	{
		ArrayList<String> words = new ArrayList<String>(Arrays. asList("never","gonna","give","up","on","you"));
		Assert.assertEquals(true,isAcronym(words,"ngguoy") );
	}
	
public boolean isAcronym(List<String> words, String s) {
	StringBuilder sb = new StringBuilder();
	
	for (int i = 0; i < words.size(); i++) {
		String temp = words.get(i);
		sb.append(temp.charAt(0));
		
	}
	System.out.println(sb);
	
	if(sb.toString().equals(s))
	{
		return true;
	}
        
	return false;
    }

}

/*
 https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/
  
 * 
 * */
