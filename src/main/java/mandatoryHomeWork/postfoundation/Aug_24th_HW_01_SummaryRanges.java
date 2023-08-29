package mandatoryHomeWork.postfoundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class Aug_24th_HW_01_SummaryRanges {
	
@Test
public void test1()
{
	List<String> expected =new ArrayList<String>();
	expected.add("0->2");
	expected.add("4->5");
	expected.add("7");
	
	Assert.assertEquals(expected, summaryRanges(new int[] {0,1,2,4,5,7}));}

@Test
public void test2()
{
	List<String> expected =new ArrayList<String>();
	expected.add("0");
	expected.add("2->4");
	expected.add("6");
	expected.add("8->9");
	
	Assert.assertEquals(expected, summaryRanges(new int[] {0,2,3,4,6,8,9}));}

public List<String> summaryRanges(int[] num) {


int i=0;
		int j=0;
		List<Integer> templist = new ArrayList<Integer>();
		List<String> Outputlist = new ArrayList<String>();
		Set<Integer> tempset = new HashSet<Integer>();

		if(num.length==0)
		{
			System.out.println("Do nothing");
			
		}
		
		else if(num.length==1)
		{
			 Outputlist.add(String.valueOf(num[0]));
			
		}
		
		else {
	
		
		for (i=0; i < num.length-1; i++) {
			
			if(num[i+1]==num[i]+1)
			{
				templist.add(num[i]);
				templist.add(num[i+1]);
				System.out.println(Arrays.toString(templist.toArray()));
				
							
			}
			tempset.addAll(templist);
			if(tempset.size()==num.length)
			{
				Outputlist.add(templist.get(0)+"->"+templist.get(templist.size()-1));
				break;
			}
			
		  else if(num[i+1]!=num[i]+1)
			{
				templist.add(num[i]);
				System.out.println(Arrays.toString(templist.toArray()));
				j=i;
				
				if(!templist.isEmpty()) 
				{
					
					if(templist.size()==1)
					{
						Outputlist.add(String.valueOf(templist.get(0)));
						templist.clear();
					}
					else {
						
				Outputlist.add(templist.get(0)+"->"+templist.get(templist.size()-1));
				System.out.println(Arrays.toString(Outputlist.toArray()));
				templist.clear();}
			    }
				
			}
			
		
			
		}
		
		if(tempset.size()!=num.length)
		{
			
		
		
		if(num[(num.length)-1]==num[(num.length)-2]+1)
		{
			Outputlist.add(num[(num.length)-2]+"->"+num[(num.length)-1]);
		}
		if(num[(num.length)-1]!=num[(num.length)-2]+1)
		{
			Outputlist.add(String.valueOf(num[(num.length)-1]));
		}
		}
		
		
		}
		
		System.out.println(Arrays.toString(Outputlist.toArray()));

return Outputlist;

}

}

/*
 https://leetcode.com/problems/summary-ranges/
 
 228. Summary Ranges
You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b
 

Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
Example 2:

Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"
*/
