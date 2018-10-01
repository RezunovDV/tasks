package strings;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Pangram {

	    // Complete the pangrams function below.
	    static String pangrams(String s) {
	    char [] arrChar = {'q', 'w', 'e', 'r', 't', 'y', 'u','i', 'o', 'p', 'a', 's', 'd', 'f', 'g','h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};

	    String str = s.toLowerCase();
	        
	     char [] word = str.toCharArray();
	     int count = 0;
	     
	        for (int i = 0; i < word.length; i++) {
	            for (int j = 0; j < arrChar.length; j++) {
	                if(arrChar[j] == word[i]){
	                    arrChar[j] = '1';
	                    count++;
	                }
	            }
	        }
	       if(count == 26){
	           return "pangram";
	       }else
	       return "not pangram";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String s = scanner.nextLine();

	        String result = pangrams(s);

	        bufferedWriter.write(result);
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
   }
}

