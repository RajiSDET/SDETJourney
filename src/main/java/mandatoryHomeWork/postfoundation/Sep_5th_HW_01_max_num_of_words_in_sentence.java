package mandatoryHomeWork.postfoundation;
import org.junit.Assert;
import org.junit.Test;

public class Sep_5th_HW_01_max_num_of_words_in_sentence {
	@Test
	public void test1()
	{
		Assert.assertEquals(3, mostWordsFound(new String[] {"please wait", "continue to fight", "continue to win"}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(6, mostWordsFound(new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
	}
	
    public int mostWordsFound(String[] sentences) {
        
    	int maxLength=0;
    	String[] strArray = null;
    	for (int i = 0; i < sentences.length; i++) {
    		  
    		strArray = sentences[i].split(" ");  
    		if(maxLength<strArray.length)
    		{
    			maxLength=strArray.length;
    		}
    	}
    	return maxLength;
    }
	

}

/*Pseudo Code
INPUT - String [] - Array of Strings - Each element is a statement 
OUTPUT - int Word count of MaxLengthSentence

Logic - 

int length 
int max_length

Scan through each element of String StringArr[]

Convert each StringArr[i] to another Array of words and fetch the length of this array  
Store it inside length 
if(length>max_length)
{
max_length=length;
}
return max_length



 * */

/*https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
 2114. Maximum Number of Words Found in Sentences

A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.

 

Example 1:

Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
Explanation: 
- The first sentence, "alice and bob love leetcode", has 5 words in total.
- The second sentence, "i think so too", has 4 words in total.
- The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
Example 2:

Input: sentences = ["please wait", "continue to fight", "continue to win"]
Output: 3
Explanation: It is possible that multiple sentences contain the same number of words. 
In this example, the second and third sentences (underlined) have the same number of words.
 

Constraints:

1 <= sentences.length <= 100
1 <= sentences[i].length <= 100
sentences[i] consists only of lowercase English letters and ' ' only.
sentences[i] does not have leading or trailing spaces.
All the words in sentences[i] are separated by a single space.

 */
