package mandatoryHomeWork.postfoundation;

import java.util.ArrayList;

public class Aug30_HackerRank_FillingJar_CW02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> array_list = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 3; i++) {
			ArrayList<Integer> sub_array_list = new ArrayList<Integer>();
			// The space for the 0th roArrayListw can be allocated with the use of new keyword, this is done in this line. The 0th row also allows the store of 0 value as default .
			//array_list.add(new ArrayList<Integer>());
			//array_list.add(new ArrayList<Integer>());
			sub_array_list.add(0, 1);
			sub_array_list.add(1, 2);
			sub_array_list.add(2, 100);
			
			array_list.add(sub_array_list);
		}
		System.out.println(array_list.size());
		
		System.out.println(array_list);
		
		  for(int i=0;i<array_list.size();i++){
               System.out.println(array_list.get(i));
           } 
                

	}

}

/**/
