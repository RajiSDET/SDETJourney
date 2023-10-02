package dsa.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class Two_Pointer_Assestment_2 {
	
	@Test
	public void test1()
	{
	List<Integer> expected  = new ArrayList<Integer>();
	 expected.add(9);
	 expected.add(1);
	 expected.add(7);
	 expected.add(3);
	 expected.add(5);
	 expected.add(4);
	 expected.add(6);
	 expected.add(2);
	 expected.add(8);
	 expected.add(0);
	 
	 List<Integer> input  = new ArrayList<Integer>();
	 input.add(9);
	 input.add(8);
	 input.add(7);
	 input.add(6);
	 input.add(5);
	 input.add(4);
	 input.add(3);
	 input.add(2);
	 input.add(1);
	 input.add(0);
	 
	 System.out.println(input);
	 
	 List<List<Integer>> operations  = new ArrayList<List<Integer>>();
	 operations.add(Arrays.asList(0,9));
	 operations.add(Arrays.asList(4,5));
	 operations.add(Arrays.asList(3,6));
	 operations.add(Arrays.asList(2,7));
	 operations.add(Arrays.asList(1,8));
	 operations.add(Arrays.asList(0,9));
	
	 
	 Assert.assertEquals(expected,performOperations(input,operations));
	 
	
	 
	}
	public static List<Integer> performOperations(List<Integer> arr, List<List<Integer>> operations) {
	    // Write your code here
		
		
		
		for (int i = 0; i <operations.size(); i++) {
			
			
				int left = operations.get(i).get(0);
				int right = operations.get(i).get(1);
				
			
				while(right>left)
				{
					int temp = arr.get(right);
					arr.set(right,arr.get(left));
					arr.set(left,temp);
					
					right--;
					left++;
				}
			
		}
		
			
		
		System.out.println(arr);
		return arr;

	    }

}


/*Pseudo Code
 Inputs - 
 arr[] = [9,8,7,6,5,10,4,3,2,1,0]
 operations = [[0,9],[4,5],[3,6],[2,7],[1,8],[0,9]]
 
 
 
 Output - arr[]
 for each element in operations 
 set left = list.get(0).get(0)
 set right = list.get(0).get(1)
 
 swap 
 
 
 Approach - 
 
 Step1- 
 Step2-
 Step3-
 Step4- 
 Step5-
 Step6-
 */

/*Problem - 
 
 
 
 
 
 
 
 
 
 
 */
