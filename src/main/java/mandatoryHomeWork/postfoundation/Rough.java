package mandatoryHomeWork.postfoundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Rough {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		int k=3;
		
		List<Integer> outputList = new ArrayList<Integer>(n);
		
		for (int i = k; i < n; i++) {
			outputList.add(arr[i]);
			}
		for (int i = 0; i < k; i++) {
			outputList.add(arr[i]);
			}
		
		System.out.println(outputList);
		
		
			
}}
			
		
		
	
	
		









