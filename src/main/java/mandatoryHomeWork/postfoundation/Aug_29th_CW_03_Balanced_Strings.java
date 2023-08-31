package mandatoryHomeWork.postfoundation;

import org.junit.Test;

import junit.framework.Assert;

public class Aug_29th_CW_03_Balanced_Strings {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(4, balancedStringSplit("RLRRLLRLRL"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(2, balancedStringSplit("RLRRRLLRLL"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(1, balancedStringSplit("LLLLRRRR"));
	}
	
	public int balancedStringSplit(String s) {

        int r, l,count;
        r=l=count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R') r++;
            else l++;

            if(r==l) {
                count++;
                r=l=0;
            }
        }
        return count;
    }

}
