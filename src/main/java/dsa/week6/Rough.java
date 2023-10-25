package dsa.week6;

public class Rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "This#string%contains^3432special*characters&.";
		str = str.replaceAll("[^a-zA-Z]", " ");
		str = str.replaceAll("\\s", "");
		System.out.println(str);
	}

}
