package dsa.week5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;
import org.junit.Test;
import junit.framework.Assert;



public class Oct_18_CW_01_sortPeopleHeight {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(new String[] {"Mary","Emma","John"},sortPeople(new String[] {"Mary","John","Emma"},new int[] {180,165,170}) );
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(new String[] {"Bob","Alice","Bob"},sortPeople(new String[] {"Alice","Bob","Bob"},new int[] {155,185,150}) );
	}
	
	public String[] sortPeople(String[] names, int[] heights) {
	      
		 List<String> list = new ArrayList<String>();
		 TreeMap< Integer,String> sortedMap = new TreeMap<>();
		 
	     for (int i = 0; i < heights.length; i++) {
			 sortedMap.put(heights[i], names[i]);
		}
		 System.out.println(sortedMap);
		 
		 // Get the descending map view
	     NavigableMap<Integer, String> descendingMap = sortedMap.descendingMap();
	     System.out.println(descendingMap);
	     
	     // Get the values in descending order
	     Collection<String> valuesDescending = descendingMap.values();

	     // Print the values in descending order
	     //System.out.println("Values in descending order:");
	     for (String value : valuesDescending) {
	       //  System.out.println(value);
	        list.add(value);
	     }
	     
	     for (int i = 0; i < names.length; i++) {
	    	    
	             names[i]= list.get(i);
	         }
		
		
	     return names;
	    }

}

/*PSEUDO CODE
 INPUTS String[] names = ["Mary","John","Emma"], int[] heights = [180,165,170]
 OUTPUT ["Mary","Emma","John"] -> Sorted Name list based on decreasing order of height
 
 Step 1: Create a TREE MAP - ADD the height and name in MAP 
 Step 2: Create a NavigableMap of same datatype ->  NavigableMap<Integer, String> descendingMap = sortedMap.descendingMap();
 Step 3: Get the Values of this descendingMap inside an Collection of String 
 Step 4: Add these inside a LIST and finally write these list inside the same input String[] names
 Step 5: return names
 
 */

/*https://leetcode.com/problems/sort-the-people/
 2418. Sort the People

You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.

 

Example 1:

Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.
Example 2:

Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, followed by Alice and the second Bob.


Constraints:

n == names.length == heights.length
1 <= n <= 103
1 <= names[i].length <= 20
1 <= heights[i] <= 105
names[i] consists of lower and upper case English letters.
All the values of heights are distinct.
 */
