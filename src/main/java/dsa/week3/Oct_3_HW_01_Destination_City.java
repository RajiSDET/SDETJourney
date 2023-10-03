package dsa.week3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class Oct_3_HW_01_Destination_City {
	
	@Test
	
	public void test1()
	{
		List<List<String>> twoDList = new ArrayList<>();
        twoDList.add(new ArrayList<>(List.of("London","New York")));
        twoDList.add(new ArrayList<>(List.of("New York","Lima")));
        twoDList.add(new ArrayList<>(List.of("Lima","Sao Paulo")));
		Assert.assertEquals("Sao Paulo", destCity(twoDList));
	}
	
public String destCity(List<List<String>> paths) {
	
	
		List<String> mylist = new ArrayList<String>();
		
		for (int i = 0; i < paths.size(); i++) 
		{
			String x = paths.get(i).get(0);
			mylist.add(x);
		
		}
		
			
		for (int i = 0; i < paths.size(); i++)
		{
			String y = paths.get(i).get(1);
		    if(mylist.contains(y))
		     {
			   mylist.remove(y);
		     }
				 else 
		    	mylist.add(y);
		}
		
		Iterator<String> iterator = mylist.iterator();
		String lastElement = null;

	    while (iterator.hasNext()) {
	        lastElement = iterator.next();
	    }

	    return lastElement;


	
	        
    }

}
/*PSEUDO CODE
 
 Input - 2d List : List<List<String>> paths
 Output - String s
 
 Declare one set 
 add all the list values inside list 
 if list.contains is true - remove value from list else add it to the list  
 remaining last value in the set should be returned - use iterator

 */

/*
 https://leetcode.com/problems/destination-city/
 1436. Destination City
You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.

 

Example 1:

Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo" 
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
Example 2:

Input: paths = [["B","C"],["D","B"],["C","A"]]
Output: "A"
Explanation: All possible trips are: 
"D" -> "B" -> "C" -> "A". 
"B" -> "C" -> "A". 
"C" -> "A". 
"A". 
Clearly the destination city is "A".
Example 3:

Input: paths = [["A","Z"]]
Output: "Z"
 

Constraints:

1 <= paths.length <= 100
paths[i].length == 2
1 <= cityAi.length, cityBi.length <= 10
cityAi != cityBi
All strings consist of lowercase and uppercase English letters and the space character.
 */