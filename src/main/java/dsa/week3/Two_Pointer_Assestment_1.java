package dsa.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class Two_Pointer_Assestment_1 {
	
	
	@Test
	public void test1()
	{
		 List<Integer> expected  = new ArrayList<Integer>();
		 expected.add(0);
		 expected.add(1);
		 expected.add(1);
		 expected.add(2);
		 expected.add(3);
		 expected.add(5);
		 expected.add(7);
		 expected.add(7);
		 
		 
		 
		 List<Integer> a  = new ArrayList<Integer>();
		 a.add(1);
		 a.add(5);
		 a.add(7);
		 a.add(7);
		 
		 List<Integer> b  = new ArrayList<Integer>();
		 b.add(0);
		 b.add(1);
		 b.add(2);
		 b.add(3);
		 
		 Assert.assertEquals(expected,mergeArrays(a,b));
	}
	 public static List<Integer> mergeArrays(List<Integer> a, List<Integer> b) {
		    // Write your code here
		 
		 List<Integer> output = new ArrayList<Integer>();
		 
		 for (int i = 0; i < a.size(); i++) {
			 
				 output.add(a.get(i));
				 output.add(b.get(i));
		 }
			
		Collections.sort(output);
		
	 System.out.println(output);	 
		 return output;

		    }

}

/*Pseudo Code
Inputs - two lists a and b 
Output - concatenated list of a and b 

Approach - 2 pointer 
let there be 1 pointer 
pointer shall go from 0 to size of one of the arrays 
get the values from both list 
whichever is less add that first 
if equal add them as is 
return output list 
 

Step1- 
Step2-
Step3-
Step4- 
Step5-
Step6-
*/

/*Problem - 









*/
