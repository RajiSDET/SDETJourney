package mandatoryHomeWork.postfoundation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.junit.Assert;
import org.junit.Test;



public class Sep_11th_CW_01_SortArray_0_1_2 

{
	
	@Test
	public void test1()
	{
		Assert.assertArrayEquals(new int[] {0,0,1,2,2},sorter(new int[] {1,0,2,2,0}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertArrayEquals(new int[] {0,0,1,1,2,2,2},sorter(new int[] {1,2,0,2,2,0,1}));
	}

	public int[] sorter(int[] input)
	{
		Map <Integer,Integer> map = new HashMap<Integer,Integer>();
		 int zeros_count=0;
		 int ones_count=0;
		 int twos_count=0;
		 
		
	for (int i=0;i<=input.length-1;i++)
    {
            if(map.keySet().contains(input[i]))
                            {
                              map.put(input[i],map.get(input[i])+1);
                            }
             else {
             map.put(input[i],1);
             }
                       
    }
	
	for(Entry<Integer, Integer> o: map.entrySet())
    {
            if(o.getKey()==0)
            {
                 zeros_count= o.getValue();
                 
                 for (int i = 0; i <= zeros_count-1; i++)
                 {
             		input[i]=0;
             	 }
            }
            if(o.getKey()==1)
            {
                ones_count= o.getValue();
               
                 for (int i = zeros_count; i <= ones_count-1+zeros_count; i++)
                 {
             		input[i]=1;
             	 }
            }
            if(o.getKey()==2)
            {
                 twos_count= o.getValue();
                 for (int i = twos_count+zeros_count; i < input.length; i++)
                 {
             		input[i]=2;
             	 }
            }
    }
	
	
	return input;
	
	
	}
	
}



/*PSEUDO CODE
Count the number of zeros , 1s and 2s and store in a map
Start from index 0 to countofZero-1 write so many zeros
from the index of countofZero-1 to CountoTwopluscountofZero-1 write so many 1s
CountoTwopluscountofZero-1 to end of Array write so many 2s 
*/

/*
 Given an array A[] consisting of only 0s, 1s, and 2s. 
 The task is to write a function that sorts the given array.
 The functions should put all 0s first, then all 1s and all 2s in last.
 */