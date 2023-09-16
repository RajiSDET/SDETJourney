package mandatoryHomeWork.postfoundation;

import org.junit.Test;

import junit.framework.Assert;

public class Sep16th_CW01_Reverse_String {
	
	@Test
	public void test1()
	{
		Assert.assertEquals("IMHSKALAJAR", two_pointer("RAJALAKSHMI"));
	}
	@Test
	public void test2()
	{
		Assert.assertEquals("UHSESURUG", reverseStr2("GURUSESHU"));
	}
	
	public String two_pointer(String str)
	{   
		char[] charArray = str.toCharArray();
		char temp;
		int startindex = 0;
		int lastindex = charArray.length-1;
		
		while(startindex<lastindex)
		{
			temp=charArray[startindex];
			charArray[startindex++]=charArray[lastindex];
			charArray[lastindex--]=charArray[startindex];
		}
		
		return new String(charArray);
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
