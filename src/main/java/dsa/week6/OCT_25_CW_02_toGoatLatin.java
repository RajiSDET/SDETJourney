package dsa.week6;

import org.junit.Test;

import junit.framework.Assert;

public class OCT_25_CW_02_toGoatLatin {
	
	@Test
	public void test1()
	{
	  Assert.assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", toGoatLatin("I speak Goat Latin"));	
	}
	
	@Test
	public void test2()
	{
	  Assert.assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa", toGoatLatin("The quick brown fox jumped over the lazy dog"));	
	}
	
public String toGoatLatin(String sentence) {
	
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

return sb.toString();
        
    }

}



/*https://leetcode.com/problems/goat-latin/description/
 824. Goat Latin

You are given a string sentence that consist of words separated by spaces. Each word consists of lowercase and uppercase letters only.

We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.) The rules of Goat Latin are as follows:

If a word begins with a vowel ('a', 'e', 'i', 'o', or 'u'), append "ma" to the end of the word.
For example, the word "apple" becomes "applema".
If a word begins with a consonant (i.e., not a vowel), remove the first letter and append it to the end, then add "ma".
For example, the word "goat" becomes "oatgma".
Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
For example, the first word gets "a" added to the end, the second word gets "aa" added to the end, and so on.
Return the final sentence representing the conversion from sentence to Goat Latin.

 

Example 1:

Input: sentence = "I speak Goat Latin"
Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
Example 2:

Input: sentence = "The quick brown fox jumped over the lazy dog"
Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 

Constraints:

1 <= sentence.length <= 150
sentence consists of English letters and spaces.
sentence has no leading or trailing spaces.
All the words in sentence are separated by a single space.
 */
