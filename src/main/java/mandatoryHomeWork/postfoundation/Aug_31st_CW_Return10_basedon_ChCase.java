package mandatoryHomeWork.postfoundation;

import java.util.Scanner;

public class Aug_31st_CW_Return10_basedon_ChCase {

	
	public static int Find_Char_Case(char input_char ) 
	{
		
			
		if (Character.isLowerCase(input_char)) {
			   return 0;
			}
		else if (Character.isUpperCase(input_char)) {
			    return 1;
			}
		else {
			return -1;
		}
		
	}

	public static void main(String args[]) {

	    Scanner scanner = new Scanner(System.in);
		char input_char = scanner.next().charAt(0);
		System.out.println(Find_Char_Case(input_char));
	}
	
	
}
