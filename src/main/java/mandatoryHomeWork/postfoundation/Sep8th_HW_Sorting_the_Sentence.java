package mandatoryHomeWork.postfoundation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;

public class Sep8th_HW_Sorting_the_Sentence {
	
	@Test
	public void test1()
	{
		Assert.assertEquals("I RAJI Test", sortSentence("Test3 I1 RAJI2"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("This is a sentence", sortSentence("is2 sentence4 This1 a3"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals("Me Myself and I", sortSentence("Myself2 Me1 I4 and3"));
	}
	
	 public String sortSentence(String s) {
		 Map<Integer,String> map = new HashMap<Integer,String>();
		 StringBuilder sb = new StringBuilder();
		 String[]  strArray = s.split(" ");
		 for (int i = 0; i < strArray.length; i++) {
			String Words = (String) strArray[i].subSequence(0, strArray[i].length()-1);
			int Occurance = Integer.parseInt(strArray[i].substring(strArray[i].length()-1));
			map.put(Occurance,Words);
		}
		 
		 
		 for (int i = 1; i < 10; i++) {
			 for(Entry<Integer, String> o: map.entrySet())
             {
                     if(o.getKey()==i)
                     {
                    	 
                            sb.append(o.getValue());
                            sb.append(" ");
                     }
             }
		}
		 sb.deleteCharAt(sb.length()-1);
		 String Output = sb.toString(); 
		 return Output;
	    }

}

/*https://leetcode.com/problems/sorting-the-sentence/
1859. Sorting the Sentence

A sentence is a list of words that are separated by a single space with no leading or trailing spaces. 
Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position 
to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as 
"sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, 
reconstruct and return the original sentence.

Pseudo Code - 
INPUT : String s
OUTPUT : String s

Step 1 : Convert the Sentence s to Array of String
Step 2 : Create a Map and store the split value of the String {Key-Number Value-Word}
Step 3 : Sort the Map based on KEY-
Step 4 : Iterate through all elements in the Map Build a String using sb.append + append (" ")
Step 5 : Return the StringBuilder as String after removing the last space


Example 1:

Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4",
then remove the numbers.

Example 2:
Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
 

Constraints:

2 <= s.length <= 200
s consists of lowercase and uppercase English letters, spaces, and digits from 1 to 9.
The number of words in s is between 1 and 9.
The words in s are separated by a single space.
s contains no leading or trailing spaces.*/