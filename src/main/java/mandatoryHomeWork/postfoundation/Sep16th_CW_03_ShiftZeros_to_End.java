package mandatoryHomeWork.postfoundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Sep16th_CW_03_ShiftZeros_to_End {
	
	@Test
	public void test1()
	{
		Assert.assertArrayEquals(new int[] {1,1,0},zerosToEnd(new int[] {1,0,1}) );
	}

	@Test
	public void test2()
	{
		Assert.assertArrayEquals(new int[] {1,3,12,0,0},zerosToEnd(new int[] {0,1,0,3,12}) );
	}
	
	public int[] zerosToEnd(int[] nums)
	{
		
        int left = 0;
        // iterate over nums array with right pointer
        for(int right = 0; right < nums.length; right++)
        {
            // increment left pointer only if right pointer value is non zero:
            if(nums[right] != 0) 
            {                
                int tmp = nums[right];
                nums[right] = nums[left];
                nums[left] = tmp;
                left++;
            }
        }
		
		return nums;
	}

}


/*Input - Integer Array eg - Input: nums = [0,1,0,3,12] 
  Output - Integer Array eg - Output: [1,3,12,0,0]
  
  -> have two pointer left and right adjacent to each-other 
  -> 
   
   
 *
 */

/*Given an integer array nums, move all 0's to the end of it 
 * while maintaining the relative order of the non-zero elements. 
 * Note that you must do this in-place without making a copy of the array.
 *  Example 1: Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]*/
 