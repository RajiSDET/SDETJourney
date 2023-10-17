package dsa.week5;

public class Rough {

	/*private static String processBackspace(String s){
        StringBuilder sb = new StringBuilder(s);
       
        while(sb.indexOf("#")>=0){
            if(sb.indexOf("#") == 0)
                sb.deleteCharAt(0);
            else
                sb.delete(sb.indexOf("#")-1, sb.indexOf("#")+1);
        }
        System.out.println(sb.toString());
        return sb.toString();
        
    }*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abd#c";
		 StringBuilder sb = new StringBuilder(s);
		
			
			 System.out.println(sb.indexOf("#"));
			 sb.delete(sb.indexOf("#")-1,  sb.indexOf("#")+1);
			 System.out.println(sb.toString());
				String t = "#a#c";
		//processBackspace(s);
		
	}

}
