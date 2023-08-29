package mandatoryHomeWork.postfoundation;

public class Aug_26th_CW_01_IPAddress {

	public static void main(String[] args) {
	
		String inputaddress = "1.1.1.1";
		String Outputaddress = "";
		
		for (int i = 0; i < inputaddress.length(); i++) {
			
			char Check = inputaddress.charAt(i) ;
			
			if(Check=='.')
			{
				Outputaddress=Outputaddress+"[.]";
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
PSEUDO CODE 

*/

/*
Given a valid IP address, return a defanged version of that IP address. 
A defanged IP address replaces every period "." with "[.]". Do Not Use the replaceAll() 
Example 1: Input: address = "1.1.1.1" Output: "1[.]1[.]1[.]1"
 */
