package mandatoryHomeWork.postfoundation;


public class Rough {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 30003, k = 3;
		int k_beauty=0;
		String Str=""+num;
				
		for (int i = 0; i <= Str.length()-k; i++) {
			StringBuilder sb= new StringBuilder();

			for (int j = i; j < i+k; j++) {
				sb.append(Str.charAt(j));
			}
			int divisor = Integer.parseInt(sb.toString());
			if(divisor!=0)
			{
				if(num%divisor==0)
				{
					k_beauty++;
				}
			}
		}
		
      System.out.println(k_beauty);
		
		
			
}
	}
			
		
		
	
	
		









