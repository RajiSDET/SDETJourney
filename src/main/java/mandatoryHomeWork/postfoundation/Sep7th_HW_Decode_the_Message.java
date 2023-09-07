package mandatoryHomeWork.postfoundation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import junit.framework.Assert;

public class Sep7th_HW_Decode_the_Message {
	
	@Test
	public void test1() 
	{
		Assert.assertEquals("this is a secret",decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv") );
	}
	
	@Test
	public void test2() 
	{
		Assert.assertEquals("the five boxing wizards jump quickly",decodeMessage("eljuxhpwnyrdgtqkviszcfmabo","zwx hnfx lqantp mnoeius ycgk vcnjrdb") );
	}
	
	
	 public String decodeMessage(String key, String message) {
	        key = key.replaceAll("\\s", "");
			
			//Get the unique chars without space
			String temp = "" + key.charAt(0);
			 
	        for (int i = 1; i < key.length(); i++) {
	            if (!temp.contains(String.valueOf(key.charAt(i))))
	                temp = temp + key.charAt(i);
	        }
	        System.out.println(temp);
	        
	        char[] charArray = temp.toCharArray();
			
	        Map<Character,Character> map = new HashMap<Character,Character> ();
	        
	       
	        for(int i = 0; i < charArray.length; i++){
	          {
	           
	            map.put(charArray[i], (char) (i+'a'));
	          }
	        }
	        map.put(' ', ' ');
	        System.out.println(Arrays.asList(map));
	        
	        char[] messageArray = message.toCharArray();
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < messageArray.length; i++) 
	        {
				
	        	for(Entry<Character, Character> o: map.entrySet())
	            {
	                    if(messageArray[i]==o.getKey())
	                    {
	                         sb.append(o.getValue());
	                    }
	            }
			}
	        
	        System.out.println(sb);
	        String Output = sb.toString();
	        return Output;
	    }

}
