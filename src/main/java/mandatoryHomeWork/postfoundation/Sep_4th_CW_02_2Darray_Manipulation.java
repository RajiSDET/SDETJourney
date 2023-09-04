package mandatoryHomeWork.postfoundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class Sep_4th_CW_02_2Darray_Manipulation {
	
	@Test
	public void test1() 
	{
		ArrayList<Integer> actual = new ArrayList<Integer>(Arrays. asList(1,2,3,2,3,4,5,4));
		Assert.assertEquals(actual, printMatrix(new int[][] {{1,2},{2,3}
		,{3,4},{4,5}}));
	}
	
	public  List<Integer> printMatrix(int mat[][]){
        // Write your code here.
		List<Integer> OutPutList = new ArrayList<Integer>();
		
 		for(int i=0;i<mat.length;i++)
 		{
 			Integer x = mat[i][0];
			Integer y = mat[i][1];
			
 			if(i%2!=0)
 			{
 				OutPutList.add(y);
 				OutPutList.add(x);
 			}
 			else {
 				OutPutList.add(x);
 				OutPutList.add(y);
 			}
 		}
		
      return OutPutList;
    }

}


/*PSEUDO CODE 

Input nxn 2D array 
int [][] inputMatrix 

Output List built from above 2 Array 
such that if index of inputMatrix is even add to list as is but if odd index reverse and add to list 

loop through the 2D Array 
for even index add as is 
for odd index add (i,1) followed by (i,0);



*/

/*https://www.codingninjas.com/studio/problems/ninja-and-matrix_4537652?leftPanelTab=0
 
 */
