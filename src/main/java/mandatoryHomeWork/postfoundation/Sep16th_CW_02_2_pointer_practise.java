package mandatoryHomeWork.postfoundation;

import org.junit.Assert;
import org.junit.Test;

public class Sep16th_CW_02_2_pointer_practise {
	
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[] {0,3}, target_index(new int[] {2,3,5,7},9));
	}
	
	public int[] target_index(int[] nums, int target)
	{
		int[] Output = new int[2];
		int startIndex=0;
		int lastIndex=nums.length-1;
		while(startIndex<lastIndex)
		{
			if(nums[startIndex]+nums[lastIndex]==target)
			{
				Output[0]=startIndex;
				Output[1]=lastIndex;
			}
			startIndex++;
			lastIndex--;
		}
		return Output;
	}

}

/*PseudoCode
 Input: new int[] nums = [2,3,5,7], int target = 9 
 initialize start_index =0
 initialize last_index = nums.length-1
 
 while start_index<last_index 
if at some point nums[start_index]+ nums[last_index] is equal to target
output[0]=start_index
output[1]=last_index
  
 
 */

/*2.Given a sorted array of integers nums and an integer target, 
  return indices of the two numbers such that they add up to target. 
  Input: nums = [2,3,5,7], target = 9 
  Output: [0,3] 
  Output: Because nums[0] + nums[3] == 9, we return [0, 3].*/
