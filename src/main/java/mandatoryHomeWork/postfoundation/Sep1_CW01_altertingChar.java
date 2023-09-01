package mandatoryHomeWork.postfoundation;

import java.util.Iterator;

public class Sep1_CW01_altertingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Method 1
		for (int i = 97; i <=122; i=i+2) {
			
			char c=(char)i;
			System.out.println(c);
			
		}
		// Method 2 
		String output = "";
        for (char c ='a'; c <='z'; c++) {
        	 output+= c;
			 c++;}
        System.out.println(output);
        
        //Method 3 using String Builder
        
        StringBuilder sb = new StringBuilder();

	    for (char c = 'a'; c<='z'; c++) {
	      sb.append(c);
	      c++;
	    }
	    System.out.println(sb);

	}

}
