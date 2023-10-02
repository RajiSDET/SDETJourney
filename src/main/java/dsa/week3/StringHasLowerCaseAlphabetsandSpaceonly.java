package dsa.week3;

import java.util.HashSet;
import java.util.Set;

public class StringHasLowerCaseAlphabetsandSpaceonly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="djsd ksd";
		char[] cArray = s.toCharArray();
		
		Set<Character> charset = new HashSet<Character>();
		charset.add(' ');
		for (int i = 0; i <26 ; i++) {
			charset.add((char)(i+'a'));
			
		}
		System.out.println(charset);
		for(char c:cArray)
		{
			if(charset.add(c))
			{
				System.out.println("Invalid input");
			}
		}
		
		System.out.println("Valid input");
	}

}

/* The Input should contain all lowercase alphabets and space 
 Pseudo Code 
 
 
 */
