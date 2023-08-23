package mandatoryHomeWork.postfoundation;

import org.junit.Test;

import junit.framework.Assert;

public class Aug_21st_HW_01_FlowerBed {
	
	@Test
	public void test1()
	{
	  Assert.assertEquals(true,canPlaceFlowers(new int[] {1,0,0,0,1},1) );
	}
	
	@Test
	public void test2()
	{
	  Assert.assertEquals(false,canPlaceFlowers(new int[] {1,0,0,0,1},2) );
	}
	
	 public boolean canPlaceFlowers(int[] flowerbed, int n) {
	        int count = 0;
	        int l = flowerbed.length;
	        if(n==0)
	        return true;
	        if(l == 1){
	            if(flowerbed[0] == 0)
	            return true;
	            else
	            return false;
	            
	             }
	        
	        if(flowerbed[0] ==0 && flowerbed[1] == 0){
	            count++;
	            flowerbed[0] = 1;
	        }
	        
	        for(int i =1 ; i< flowerbed.length - 1; i++){
	            if(flowerbed[i] ==0){
	                if(flowerbed[i-1] ==0 && flowerbed[i+1] ==0){
	                    flowerbed[i] = 1;
	                    count++;
	                }
	                

	            }
	             
	            
	        }
	        
	        if(flowerbed[l-1] ==0 && flowerbed[l-2] == 0)
	        count ++;
	        if(count >= n)
	        return true;

	        return false;
	    }

}

/*

605. Can Place Flowers

https://leetcode.com/problems/can-place-flowers/

You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

 

Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
 

Constraints:

1 <= flowerbed.length <= 2 * 104
flowerbed[i] is 0 or 1.
There are no two adjacent flowers in flowerbed.
0 <= n <= flowerbed.length*/