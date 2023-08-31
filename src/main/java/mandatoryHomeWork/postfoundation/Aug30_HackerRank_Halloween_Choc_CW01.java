package mandatoryHomeWork.postfoundation;

import java.util.Scanner;

import org.junit.Test;

public class Aug30_HackerRank_Halloween_Choc_CW01 {
	
	
	
	 private static Scanner in;

	    public static void main(String[] args) {
	        in = new Scanner(System.in);

	        int numberTestCases = in.nextInt();

	        start(numberTestCases);

	    }

	    private static void start(int numberTestCases) {
	        in.nextLine();
	        StringBuilder result = new StringBuilder();
	        for(int i = 0; i < numberTestCases; i++){
	            result.append(maxNumberChocolatePieces((long)in.nextInt()));
	            result.append("\n");
	          //  in.nextLine();
	        }
	        System.out.print(result);
	    }

	    protected static long maxNumberChocolatePieces(long i) {
	        long pieces = (i/2) * (i-i/2);

	        return pieces;
	    }
}
