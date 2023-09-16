package mandatoryHomeWork.postfoundation;

import org.junit.Test;

import junit.framework.Assert;

public class Sep16th_CW01_Reverse_String {
	
	@Test
	public void test1()
	{
		Assert.assertEquals("IMHSKALAJAR", reverseStr("RAJALAKSHMI"));
	}
	@Test
	public void test2()
	{
		Assert.assertEquals("UHSESURUG", reverseStr2("GURUSESHU"));
	}
	
	public String reverseStr(String str)
	
	{
		StringBuilder sb = new StringBuilder();
		char[] charArray = str.toCharArray();
		for (int i =charArray.length-1 ; i >=0; i--) {
			sb.append(charArray[i]);
			
		}
		return sb.toString();
	}
	
   public String reverseStr2(String str)
	
	{
		StringBuilder sb = new StringBuilder(str);
		
		return sb.reverse().toString();
	}

}
