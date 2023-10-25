package dsa.week6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OCT_25_CW_03_shortestCompletingWord {
	

	public String shortestCompletingWord(String licensePlate, String[] words) {
	      
		String output = null ;
		licensePlate = licensePlate.replaceAll("[^a-zA-Z]", " ");
		licensePlate = licensePlate.replaceAll("\\s", "");
		licensePlate = licensePlate.toLowerCase();
		int min = Integer.MAX_VALUE;
		
		Map<Character,Integer> lpMap = new HashMap<Character,Integer>();
		for (int i = 0; i < licensePlate.length(); i++) {
			lpMap.put(licensePlate.charAt(i), lpMap.getOrDefault(licensePlate.charAt(i), 0)+1);
		}
		
		System.out.println(lpMap);
		for (String word: words) {
		    boolean flag = true;
			
			Map<Character,Integer> wordMap = new HashMap<Character,Integer>();
			for (int i = 0; i < word.length(); i++) {
				wordMap.put(word.charAt(i), wordMap.getOrDefault(word.charAt(i), 0)+1);
			}
			System.out.println(wordMap);
			
			for (Character key : lpMap.keySet()) {
	            int value1 = lpMap.get(key);
	            int value2 = 0;
				if(wordMap.containsKey(key)) {	
	             value2 = wordMap.get(key);
				}
	            if (value1 != value2) {
	               flag=false; // Values for a key are not the same, maps are different
	               break;
	            }
	        }

	   if(flag==true && word.length()<min) {
				   output=word;
					 min = output.length();

					}

		}
		
		return output; 
	
    }

}

/*Inputs - String LicensePlate and String[] words
 Output - String 
 
 Cleanse the license plate string by removing specialcharcters numbers and space and convert to lowercase
 let us add LicensePlate inside a lpMAP with char and its count 
 let us add words inside a wordMap with char and its count -> after converting to lowercase 
 
 for each value in lpMAP if the corresponding value in wMap for the iteration matched for
 all keys directly return that word 
 */
