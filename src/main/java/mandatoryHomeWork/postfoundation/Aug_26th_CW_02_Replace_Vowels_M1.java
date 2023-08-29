package mandatoryHomeWork.postfoundation;

public class Aug_26th_CW_02_Replace_Vowels_M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputaddress = "Hi testleaf students";
		String Outputaddress = "";
		
		for (int i = 0; i < inputaddress.length(); i++) {
			
			char Check = inputaddress.charAt(i) ;
			
			if((Check=='a')||(Check=='e')||(Check=='i')||(Check=='o')||(Check=='u'))
			{
				Outputaddress=Outputaddress+"";
			}
			
			else 
			{
				Outputaddress+=Check;
			}
			
		}
		System.out.println(Outputaddress);
		
		
	}

}

/*
 Iterate through the String using loop
 Capture char at each index and check if it is vowel - aeiou
 if yes replace output with empty
 else add the remaining chars to putput as it is 
 */

/*
 Write a program to remove vowels from a String 
 Example: Input: "Hi testleaf students" 
 Output: "H tstlf studnts"*/
 