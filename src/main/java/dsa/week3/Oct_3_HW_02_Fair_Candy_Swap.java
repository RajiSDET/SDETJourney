package dsa.week3;

import org.junit.Assert;
import org.junit.Test;

public class Oct_3_HW_02_Fair_Candy_Swap {
	
	@Test
	public void test1()
	{
		Assert.assertArrayEquals(new int[] {1,2}, Swap_Candy(new int[] {1,1},new int[] {2,2}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertArrayEquals(new int[] {2,3}, Swap_Candy(new int[] {2},new int[] {1,3}));
	}
	
	public int[] Swap_Candy(int[] aliceSizes,int[] bobSizes)
	
	
	
	{
		int sum1 =0;
	    int sum2 =0;
	    for(int i : aliceSizes)
	        sum1+=i;
	    for(int i : bobSizes)
	        sum2+= i;
	    
	    int diff = (sum1-sum2)/2;
	    
	    for(int j = aliceSizes.length -1;j>=0; j--)
	    {
	        for(int k = bobSizes.length -1; k>=0; k--)
	            
	        {
	            if(aliceSizes[j]-bobSizes[k] == diff)
	                return new int[]{aliceSizes[j],bobSizes[k]};
	        }
	    }
	    return new int[]{-1,-1};
		/*int[] output = new int[2];
		int alicesum=0,alicelength=aliceSizes.length;
		int bobsum=0,boblength=bobSizes.length;
		
		
		for (int i = 0; i < aliceSizes.length; i++) {
			alicesum+=aliceSizes[i];
		}
		int ALICE =alicesum;
		//System.out.println(ALICE);
		
		for (int i = 0; i < bobSizes.length; i++) {
			bobsum+=bobSizes[i];
		}
		int BOB =bobsum;
		//System.out.println(BOB);
		
		if(alicelength<=boblength)
		{
			for (int i = 0; i < alicelength; i++) {
				alicesum=ALICE;
				bobsum=BOB;
				for (int j = 0; j < boblength; j++) {
					alicesum=alicesum-aliceSizes[i]+bobSizes[j];
					System.out.println(alicesum);
					bobsum=bobsum-bobSizes[j]+aliceSizes[i];
					System.out.println(bobsum);
					if(alicesum==bobsum)
					{
						output[0]=aliceSizes[i];
						output[1]=bobSizes[j];
						break;
					}
					alicesum=ALICE;
					bobsum=BOB;
				}
			}
		}
		
		else
		{
			for (int i = 0; i < boblength; i++) {
				alicesum=ALICE;
				bobsum=BOB;
				for (int j = 0; j < alicelength; j++) {
					alicesum=alicesum-aliceSizes[j]+bobSizes[i];
					System.out.println(alicesum);
					bobsum=bobsum-bobSizes[i]+aliceSizes[j];
					System.out.println(bobsum);
					if(alicesum==bobsum)
					{
						output[0]=aliceSizes[j];
						output[1]=bobSizes[i];
						break;
					}
					alicesum=ALICE;
					bobsum=BOB;
				}
			}
		}
		
		return output;*/
		
	}

}

/*Pseudo Code
 Used Internet help
 
Basically we need to equal the sum of these two arrays by swapping one of element from both array,
Lets's Suppose sum of aliceSizes is SumA and sum of bobSizes is SumB
So we have to do the follow
    SumA-x+y = SumB +x-y
    
    where x is candies given by alice
    and y is candies given by bob
    
    As it is mentioned in question that they both have to excahnge some thing in order to have equal balance , Hence x and y always exists in the ans
   **SumA -x +y = SumB +x-y
   SumA-SumB = 2x - 2y
  (SumA-SumB)/2 = x-y ------------------------- equation 1
   ** 
    Now problem is reduced to finding x and y where they follow eq. 1
 
 */

/* https://leetcode.com/problems/fair-candy-swap/
 
 888. Fair Candy Swap

Alice and Bob have a different total number of candies. 
You are given two integer arrays aliceSizes and bobSizes where aliceSizes[i] is the number of candies of the ith box of candy that Alice has 
and bobSizes[j] is the number of candies of the jth box of candy that Bob has.

Since they are friends, they would like to exchange one candy box each so that after the exchange, 
they both have the same total amount of candy. 
The total amount of candy a person has is the sum of the number of candies in each box they have.

Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange, 
and answer[1] is the number of candies in the box that Bob must exchange. 
If there are multiple answers, you may return any one of them. It is guaranteed that at least one answer exists.

 

Example 1:

Input: aliceSizes = [1,1], bobSizes = [2,2]
Output: [1,2]
Example 2:

Input: aliceSizes = [1,2], bobSizes = [2,3]
Output: [1,2]
Example 3:

Input: aliceSizes = [2], bobSizes = [1,3]
Output: [2,3]
 

Constraints:

1 <= aliceSizes.length, bobSizes.length <= 104
1 <= aliceSizes[i], bobSizes[j] <= 105
Alice and Bob have a different total number of candies.
There will be at least one valid answer for the given input.
 
 */
