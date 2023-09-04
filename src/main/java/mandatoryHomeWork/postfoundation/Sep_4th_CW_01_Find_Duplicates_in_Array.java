package mandatoryHomeWork.postfoundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import org.junit.Test;

import junit.framework.Assert;

public class Sep_4th_CW_01_Find_Duplicates_in_Array {
	
	@Test
	public void test1()
	
	{
		ArrayList<Integer> actual = new ArrayList<>(Arrays. asList(1, 3, 4, 2, 2));
		Assert.assertEquals(2, findDuplicate(actual,actual.size()));
	}
	
	public static int findDuplicate(ArrayList<Integer> arr, int n)
	{
		 Collections.sort(arr);
		 int Dup =0;
		for (Integer i = 1; i<= n-1; i++) 
		{
			
			if(i!=arr.get(i))
			{
				Dup=arr.get(i);
			}
			
		}
        return Dup;
    }

}

/*
 
https://www.codingninjas.com/studio/problems/find-duplicate-in-array_8289592

Problem Statement
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
1
3
1 1 2
Sample Output 1:
1
Explanation of Sample Input 1:
1 is repeated in the array, hence function returns 1.
Sample Input 2:
3
5
1 3 4 2 2
5
3 1 3 4 2
3
1 1 1
Sample Output 2:
2
3
1

 */
