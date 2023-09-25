package dsa.week2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Sep24_CW_03_AssignCookies {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(1,findContentChildren(new int[] {1,2,3},new int[] {1,1}) );
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(2,findContentChildren(new int[] {1,2},new int[] {1,2,3}) );
	}
	
 public int findContentChildren(int[] g, int[] s) 
	 
	 {
	 int output =0;
	 
	 List<Integer> cookielist = new ArrayList<Integer>();
	 
	 for (int i = 0; i < s.length; i++) {
		 cookielist.add(s[i]);
	 }
	 //System.out.println(cookielist);
	 
	 for (int i = 0; i < g.length; i++)
	 {
		 int temp = g[i];
		 System.out.println(temp);
		 if(cookielist.contains(temp))
		 {
			 //list.remove(Integer.valueOf(2));
			 cookielist.remove(Integer.valueOf(g[i]));
			 output++;
		 }
	 }
	 System.out.println(cookielist);
	 
	 return output;
	 
	 }

}

/*BruteForce
 add both arrays to List 
 Greedlist Cookie list 
 loop through all elements of Greedlist and check if cookielist contains the same 
 if yes - remove that element from cookie list and increment output 
 
 */


