package mandatoryHomeWork.postfoundation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Rough {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "YazabABay";
		String NiceString ="";
		List<String> subStrings = new ArrayList<String>();
		
		for (int i = 0; i < s.length()-2; i++) {
			if(Math.abs(s.charAt(i)-s.charAt(i+1))==32)
			subStrings.add(s.substring(i));
		}
		System.out.println(300/100);
		System.out.println(300%100);
		
		int maxlen=subStrings.get(0).length();
		NiceString=subStrings.get(0);
		//System.out.println(maxlen);
		
		for(String substr:subStrings)
		{
			
			if(substr.length()>maxlen)
			{
				maxlen=substr.length();
				NiceString=substr; 
			}
					
		}
		
		
		System.out.println(NiceString);
		
		int A = 'A';
		int a = 'a';
		int B = 'B';
		int b = 'b';
		int Z = 'Z';
		int z= 'z';
		/*System.out.println(A-a);
		System.out.println(B-b);
		System.out.println(Z-z);
		
		System.out.println(a-A);
		System.out.println(b-B);
		System.out.println(z-Z);*/
 StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length()-1; i++)
		{
			if(Math.abs(s.charAt(i)-s.charAt(i+1))==32)
			{
			//System.out.println(Math.abs(s.charAt(i)-s.charAt(i+1)));
			sb.append(s.charAt(i));
			sb.append(s.charAt(i+1));
			}
		}
		
		//System.out.println(sb.toString());
		
		}
	}
			
		
		
	
	
		









