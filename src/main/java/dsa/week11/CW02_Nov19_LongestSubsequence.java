package dsa.week11;

import org.junit.Test;

import junit.framework.Assert;

public class CW02_Nov19_LongestSubsequence {
	
	@Test
	public void test1() {
		Assert.assertEquals(3,Longest_SubSeq(new int[] {1,3,5,4,7}) );
	}
	
	public int Longest_SubSeq(int[] nums) {
		int left=0, right=0, current_len=0;
		int max_len =Integer.MIN_VALUE;
		while(right<nums.length-1) {
			
			if(nums[right+1]>nums[right]) {
				right++;
				current_len = right-left+1;
				if(current_len>max_len) {
					max_len = current_len;
				}
			}
			else if(nums[right+1]<nums[right]){
				left = right+1;
				right= right+1;
			}
			else if(nums[right+1]==nums[right]){
				left = right;
			
			}
			
				
		}
			
		return max_len;
	}
	

	
}

/*PSEUDO CODE 2 Pointer
 INPUT - int[] nums
 OUTPUT - int max_length
 
Sliding Window Approach 
int left = 0 
int right = left+1
max_length = right-left

increment right pointer until right+1 >  right 
else calculate max_length = right-left
let left = right 
and increment right until next dip is detected 
calculate new max_length and compare with previous value - Store which ever is greater 
continue until right pointer reaches end of array 

Initialize the pointers
    left = 0, right = 0, max_length = 1, current_length = 1

    Iterate through the array
        >> If the next element is greater than the current element
            > Increase the current length
            > Move the right pointer forward
            > Update max_length if current_length is greater
        else:
            > If the sequence is not increasing, reset the current length
            > Move both pointers forward
    return max_length


*/

/*
 Given an unsorted array of integers nums, 
 return the length of the longest continuous increasing subsequence (i.e. subarray). 

int nums[] = {1,3,5,4,7}
Output: 3

ie: 1,3,5
    3,5
    4,7
    
int nums[] = {7,4,6,12,14,14,3}
Output : 3
4,6,12,14
6,12,14
12,14

 */
