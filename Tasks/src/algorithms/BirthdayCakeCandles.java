package algorithms;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BirthdayCakeCandles {

	    // Complete the birthdayCakeCandles function below.
	    static int birthdayCakeCandles(int[] ar) {
	            int x = Integer.MIN_VALUE;
	            int y = Integer.MIN_VALUE;
	            int count = 0;

	            for (int i = 0; i < ar.length; i++) {
	            
	            if(x < ar[i]){
	                x = ar[i];
	                count = 1;
	            }
	            else if(x == ar[i]){
	                y = ar[i];
	                count++;
	            }
	            
	        }

	        return count;
	    }

	 private static final Scanner scanner = new Scanner(System.in);

	 public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int arCount = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] ar = new int[arCount];

	        String[] arItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < arCount; i++) {
	            int arItem = Integer.parseInt(arItems[i]);
	            ar[i] = arItem;
	        }

	        int result = birthdayCakeCandles(ar);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
    }
}
