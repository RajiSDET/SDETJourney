package dsa.week1;

import org.junit.Test;

import junit.framework.Assert;

public class Sep22_HW02_K_beauty {
	
	@Test
	public void test1() {
		Assert.assertEquals(2, divisorSubstrings(240,2));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(2, divisorSubstrings(430043,2));
	} 
	
	@Test
	public void test3() {
		Assert.assertEquals(1, divisorSubstrings(10,1));
	}
	

	
	public int divisorSubstrings(int num, int k) {
	    int k_beauty=0;
			String Str=""+num;  
					
			for (int i = 0; i <= Str.length()-k; i++) {
				StringBuilder sb= new StringBuilder();

				for (int j = i; j < i+k; j++) {
					sb.append(Str.charAt(j));
				}
				int divisor = Integer.parseInt(sb.toString());
				if(divisor!=0)
				{
					if(num%divisor==0)
					{
						k_beauty++;
					}
				}
			}
			
	      System.out.println(k_beauty);
	        return  k_beauty; 
	    }
}
