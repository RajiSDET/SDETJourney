package dsa.week11;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class InrsectionOfTwoArrays {
	
	@Test
	public void test1() {
		int[] num1 = {1,2,3,4,5};
		int[] num2 = {2,4,6,7,8};
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(4);
		Assert.assertEquals(expected,twoPointer(num1,num2));
	}
	
	public List<Integer> twoPointer(int[] num1, int[] num2){
		List<Integer> output = new ArrayList<>();
		int left=0 , right=0;
		
		while(left<num1.length && right<num2.length) {
			
			if(num1[left]==num2[right]) {
				output.add(num1[left]);
				left++;
				right++;
			}
			else if(num1[left]<num2[right]) {
				left++;
			}
			else if(num1[left]>num2[right]) {
				right++;
			}
		}
		
		return output ;
		
	}

}

/*
 INPUTS - two arrays num1 and num2 
 OUTPUT - List having coming elements between num1 and num2 
 
 */
