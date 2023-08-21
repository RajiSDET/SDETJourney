package mandatoryHomeWork.postfoundation;

import org.junit.Test;

import junit.framework.Assert;

public class Aug_21st_CW_01_ReversedNum {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, ReverseNumCheck(2021));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(false, ReverseNumCheck(12300));
	}
	
	public boolean ReverseNumCheck(int num)
	{
		int temp1 = num;
		int remainder1=0;
		int reversed1 = 0;
        
		while(num>0)
        {
            remainder1=num%10;
			reversed1=(reversed1*10)+remainder1;
			num=num/10;
		}
        
        System.out.println(reversed1);
        
        int temp2 = reversed1;
        int reversed2 = 0;
        int remainder2=0;
        
        while(reversed1>0)
        {
            remainder2=reversed1%10;
			reversed2=(reversed2*10)+remainder2;
			reversed1=reversed1/10;
		}
        
        System.out.println(reversed2);
		
        if(reversed2==temp1)
        {
        	return true;
        }
		
		return false;
	}

}

/*Reversing an integer means to reverse all its digits.

For example, reversing 2021 gives 1202. 
Reversing 12300 gives 321 as the leading zeros are not retained.
Given an integer num, num=2021
reverse num to get reversed1 ; reversed1=12300
then reverse reversed1 to get reversed2. reversed2= 00321
Return true if reversed2 equals num. reversed2==num ie : 123 == 12300 return false ? 
Otherwise return false.
*/

/*PseudoCode
 
 Step 1: convert num to reversed1 using number reverse logic 
 where reversed1 = reverse of num 

 Step 2: convert reversed1 to reversed2 using number reverse logic 
 where reversed2 = reverse of reversed1 
 
 Step 3: if reversed2==original num 
 Return true 
 Else Return false 
 
 */
 