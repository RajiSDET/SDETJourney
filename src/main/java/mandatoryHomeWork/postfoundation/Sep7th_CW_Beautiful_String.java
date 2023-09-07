package mandatoryHomeWork.postfoundation;

import org.junit.Test;

import junit.framework.Assert;

public class Sep7th_CW_Beautiful_String {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2, BeautifyString("0000"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(2, BeautifyString("1111"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(1, BeautifyString("01011"));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(0, BeautifyString("0101"));
	}
	
	@Test
	public void test5()
	{
		Assert.assertEquals(2, BeautifyString("1001"));
	}
	
	
	public int BeautifyString(String STR)
	{
		int correctionCount=0;
		
		// Convert the String to Integer Array
		
	    int[] array = new int[STR.length()];
	 
	      for (int i = 0; i < STR.length(); i++) {
	            
	            array[i] = STR.charAt(i) - '0';
	        }
	      
	      
	      
	    // Logic if the Array begins with 0
	      
	      if(array[0]==0)
	      {
	      
	    for (int i = 2; i < array.length; i=i+2)
	      
	      {
	    	if(array[i]!=0)
	    	{
	    		correctionCount++;
	    		array[i]=0;
	    	}
	    				
		   }
	    for (int i = 1; i < array.length; i=i+2)
		      
	      {
	    	if(array[i]!=1)
	    	{
	    		correctionCount++;
	    		array[i]=1;
	    	}
	    				
		   }
	    
	    
	      }
	      
	      // Logic if the Array begins with 1 
	      else if(array[0]==1)
	      {
	      
	    for (int i = 2; i < array.length; i=i+2)
	      
	      {
	    	if(array[i]!=1)
	    	{
	    		correctionCount++;
	    		array[i]=1;
	    	}
	    				
		   }
	    for (int i = 1; i < array.length; i=i+2)
		      
	      {
	    	if(array[i]!=0)
	    	{
	    		correctionCount++;
	    		array[i]=0;
	    	}
	    				
		   }
	    
	    
	      }
	        
	     
	        
		return correctionCount;
	}

}

/*

Pseudo Code 
Input - String STR
Output - int count 

1. Convert String to Array 
2. Check the first if index is 0 -> 
a.Check if all even index is 0 if not replace it with 0 and count the number times we corrected if not equal 
b.Check if all odd index is 1 if not replace it with 1 and count the number times we corrected if not equal

3.Check the first if index is 0 -> 
a.Check if all even index is 0 if not replace it with 0 and count the number times we corrected if not equal 
b.Check if all odd index is 1 if not replace it with 1 and count the number times we corrected if not equal

Make sure return correction counter = 2a+2b+3a+3b


/*

Ninja has been given a binary string ‘STR’ containing either ‘0’ or ‘1’. 
A binary string is called beautiful if it contains alternating 0s and 1s.
For Example:‘0101’, ‘1010’, ‘101’, ‘010’ are beautiful strings.
He wants to make ‘STR’ beautiful by performing some operations on it. 
In one operation, Ninja can convert ‘0’ into ‘1’ or vice versa.

Your task is to determine the minimum number of operations 
Ninja should perform to make ‘STR’ beautiful.

*/