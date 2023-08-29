package mandatoryHomeWork.postfoundation;

public class Aug_26th_CW_02_Replace_Vowels_M2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder input  = new StringBuilder("Hi testleaf students");
   for (int i = 0; i < input.length(); i++) {
			
			char Check = input.charAt(i) ;
			
			if((Check=='a')||(Check=='e')||(Check=='i')||(Check=='o')||(Check=='u'))
			{
				input.deleteCharAt(i);
			}
			
			
			
		}
   System.out.println(input);
		
		

	}

}
