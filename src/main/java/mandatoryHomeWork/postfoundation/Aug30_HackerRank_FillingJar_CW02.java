import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY operations
     */

    public static int solve(int n, List<List<Integer>> operations) {
    // Write your code here
        
        int start_index=0;
        int end_index=0;
        int filler =0;
        int sum=0;
        
        for(List<Integer> temp: operations)
        {
            start_index=temp.get(0);
            end_index=temp.get(1);
            filler=temp.get(2);
            
            System.out.println(start_index);
            System.out.println(end_index);
            System.out.println(filler);
            for(int i=start_index;i<=end_index;i++)
            {
                sum+=filler;
            }
            
        }
        System.out.println(sum);
     
      return sum/n;
    }

}

public class Aug30_HackerRank_FillingJar_CW02 

{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> operations = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                operations.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.solve(n, operations);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
