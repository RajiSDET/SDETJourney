package mandatoryHomeWork.postfoundation;

import java.util.Arrays;
import org.junit.Test;

import junit.framework.Assert;


public class Aug_23rd_HW_01_ArrayPartitioning {
	
	@Test 
	public void test1()
	{
		Assert.assertEquals(4,arrayPairSum(new int[] {1,4,3,2}) );
	}
	@Test 
	public void test2()
	{
		Assert.assertEquals(9,arrayPairSum(new int[] {6,2,6,5,1,2}) );
	}
    public int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums);
        int sum=0;
        for (int i=0;i<nums.length;i+=2)
        {
            sum+=nums[i];
        }
    
    return sum;

}}
