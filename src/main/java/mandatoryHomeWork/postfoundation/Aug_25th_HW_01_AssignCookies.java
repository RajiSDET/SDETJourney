package mandatoryHomeWork.postfoundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class Aug_25th_HW_01_AssignCookies {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(1, findContentChildren(new int[] {1,2,3},new int[] {1,1}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(2, findContentChildren(new int[] {1,2},new int[] {1,2,3}));
	}
	
	
	     public int findContentChildren(int[] g, int[] s) 
		 
		 {
	         List<Integer> GreedList = new ArrayList<Integer>();
			List<Integer> CookieList = new ArrayList<Integer>();
			int contentChildren =0;

			for (int i = 0; i < s.length; i++) {
				CookieList.add(s[i]);
			}
			
			for (int i = 0; i < g.length; i++) {
				GreedList.add(g[i]);
			}
			
			for(Integer greedfactor:GreedList)
			{
				if(CookieList.contains(greedfactor))
				{
					contentChildren++;
					CookieList.remove(greedfactor);
				}
			}
			
		      for(int i=0;i<CookieList.size();i++){
	              System.out.println(CookieList.get(i));
	          } 
	               	
			
		 System.out.println("Output ="+contentChildren);
			return 	contentChildren;
	     }

	}

/*
 455. Assign Cookies
Assume you are an awesome parent and want to give your children some cookies. 
But, you should give each child at most one cookie.

Each child i has a greed factor g[i], 
which is the minimum size of a cookie that the child will be content with; 
and each cookie j has a size s[j]. 
If s[j] >= g[i], we can assign the cookie j to the child i, and 
the child i will be content. 

Your goal is to maximize the number of your content children and output the maximum number.

 

Example 1:

Input: g = [1,2,3], s = [1,1]
Output: 1
Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
And even though you have 2 cookies, since their size is both 1, 
you could only make the child whose greed factor is 1 content.
You need to output 1.

Example 2:

Input: g = [1,2], s = [1,2,3]
Output: 2
Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2. 
You have 3 cookies and their sizes are big enough to gratify all of the children, 
You need to output 2.
 */
