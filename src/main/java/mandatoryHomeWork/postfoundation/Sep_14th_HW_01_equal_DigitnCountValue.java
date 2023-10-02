package mandatoryHomeWork.postfoundation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import junit.framework.Assert;

public class Sep_14th_HW_01_equal_DigitnCountValue {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true,digitCount("1210") );
	}
	@Test
	public void test2()
	{
		Assert.assertEquals(false,digitCount("030") );
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(true,digitCount("21200") );
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(true,digitCount("42101000") );
	}	

	    public boolean digitCount(String num) {
	    	
	    	
	    	char[] charArray = num.toCharArray();
	    	
	    	if(charArray.length==1)
	    	{
	    		if(charArray[0]!='0')
	    		{
	    			return false;
	    		}
	    	}
	    	
	    	int[] input = new int[charArray.length];
	    	
	    	for (int i = 0; i < charArray.length; i++) 
	    	{
	    		input[i] = (int)charArray[i]-'0';
	    		System.out.println(input[i]);
			}
	    	
	    	boolean digitcountmatch = false;
	    	Map <Integer,Integer> map = new HashMap<Integer,Integer>();
	    	
	    	
	    	
	    	for (int i=0;i<input.length;i++)
	         {
	                 if(map.keySet().contains(input[i]))
	                                 {
	                         map.put(input[i],map.get(input[i])+1);
	                                 }
	                  else {
	                  map.put(input[i],1);
	                  }
	                            
	         }
	    	
	    	for (int i=0;i<input.length;i++)
	         {
	                 if(!map.keySet().contains(i))
	                               
	                 {map.put(i,0);}
		                  }
	    	
	    		    	
	    	System.out.println(Arrays.asList(map));
	    	
	     	
	    	StringBuilder sb = new  StringBuilder(); 
	    	for(Entry<Integer, Integer> o: map.entrySet())
            {
                 
                           sb.append(o.getValue()) ;
                   
            }
	    
	    	if(num.equals(sb.toString()))
	    	{
	    		digitcountmatch=true;
	    	}
	        
	    	return digitcountmatch;
	    }
	}
	



/*Pseudo Code

Create a Map and write the number and its respective count as Key and Value 
sort the Map based on the key 
the Array and Map value should match return true 
else return false

for missing entries in between add the index directly and insert the count as zero
 
 */

/*https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/description/
 2283. Check if Number Has Equal Digit Count and Digit Value

Return true if for every index i in the range 0 <= i < n, 
the digit i occurs num[i] times in num, otherwise return false.

 

Example 1:

Input: num = "1210"
Output: true
Explanation:
num[0] = '1'. The digit 0 occurs once in num.
num[1] = '2'. The digit 1 occurs twice in num.
num[2] = '1'. The digit 2 occurs once in num.
num[3] = '0'. The digit 3 occurs zero times in num.
The condition holds true for every index in "1210", so return true.
Example 2:

Input: num = "030"
Output: false
Explanation:
num[0] = '0'. The digit 0 should occur zero times, but actually occurs twice in num.
num[1] = '3'. The digit 1 should occur three times, but actually occurs zero times in num.
num[2] = '0'. The digit 2 occurs zero times in num.
The indices 0 and 1 both violate the condition, so return false.
 

Constraints:

n == num.length
1 <= n <= 10
num consists of digits.
 */
