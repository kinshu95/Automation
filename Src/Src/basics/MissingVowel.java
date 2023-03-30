package basics;
import java.util.Scanner;

public class MissingVowel {
		public static void main(String[ ] arg)
		{
			String str, output;
	        Scanner scanner = new Scanner(System.in);
	 
	        System.out.println("Enter a String");
	        str = scanner.nextLine();
	 
	        // Deleting Vowel alphabets from input
	        // string using replaceAll method
	        output = str.replaceAll("[AEIOUaeiou]", "");
	 
	        System.out.println("Output String\n" + output);
	        scanner.close();
	}
	}

