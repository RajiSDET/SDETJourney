package mandatoryHomeWork.postfoundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Aug18_CW_01_self_diving_num {
	@Test 
	public void test1()
	{
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,15,22));
        Assert.assertEquals(expected, self_div_num(1,22));
	}
	
	@Test 
	public void test2()
	{
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(15));
        Assert.assertEquals(expected, self_div_num(14,15));
	}
	
	public List<Integer> self_div_num (int left,int right)
	{
		List<Integer> outputlist = new ArrayList<Integer>();
		
		
		for(int num=left;num<=right;num++)
		{
			List<Integer> digitlist = new ArrayList<Integer>();
			int tempnum=num;
			boolean flag = true;
			
			while(tempnum>0)
			{
				digitlist.add(tempnum%10);
				tempnum=tempnum/10;
			}
			
			for(int i=0;i<digitlist.size();i++){
	            System.out.println(digitlist.get(i));
	        } 
			
			for (Integer digit: digitlist)
			{
				if(digit==0)
				{
					flag = false;
					break;
				}
				else if(num%digit!=0)
				{
					flag = false;
					break;
				}
				else if(num%digit==0)
				{
					flag = true;
					continue;
				}
			}
			
			if(flag==true)
			{
				outputlist.add(num);
			}
			
		}
		
		for(int i=0;i<outputlist.size();i++){
            System.out.println(outputlist.get(i));
        } 
		
		return outputlist;
        
             

	}
}
