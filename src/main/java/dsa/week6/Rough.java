package dsa.week6;

import java.util.Arrays;

public class Rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Input: sentence = "I speak Goat Latin"
		  Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"*/
		
		String sentence = "I speak Goat Latin";
		String[] SenArray = sentence.split(" ");
		
		for (int i = 0; i < SenArray.length; i++) {
	        String word = SenArray[i];
			if((word.charAt(0)=='a'||word.charAt(0)=='e'||word.charAt(0)=='i'||
					word.charAt(0)=='o'||word.charAt(0)=='u'||word.charAt(0)=='A')||
					word.charAt(0)=='E'||word.charAt(0)=='I'||word.charAt(0)=='O'||
							word.charAt(0)=='U')
            {
				word+="ma";}
				
				else {
					word=word.substring(1, word.length())+word.charAt(0)+"ma";
				}
				SenArray[i]=word;
				
			}
		
		String[] array = new String[SenArray.length];

        for (int i = 0; i <SenArray.length ; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                sb.append("a");
            }
            array[i] = sb.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <SenArray.length ; i++) {
    			
        	sb.append(SenArray[i]+=array[i]);
    			sb.append(" ");
        }
    		sb.deleteCharAt(sb.length()-1);
			System.out.println(sb.toString());
					
		}
		
	}


