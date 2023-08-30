package mandatoryHomeWork.postfoundation;

import org.junit.Test;

public class Aug30_HackerRank_Halloween_Choc_CW01 {
	
	@Test
	public void test() {
		missingNumber(new int[] {1,3,4,8,2,7,6});
	}
	
	public void missingNumber(int[] nums) { //{1,3,4,8,2,7,6}
		    
		 	int n = 8;
			int totalsum = ((n)*(n+1))/2;
			System.out.println(totalsum);
			int sum=0;
	        for (int j = 0; j < nums.length; j++) {
	        	sum=sum+nums[j];
			}
	        System.out.println(totalsum-sum);
}
}
