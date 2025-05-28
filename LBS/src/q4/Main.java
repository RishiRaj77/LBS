package q4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		
	     Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        int reversed = 0;

	        while (number != 0) {
	            int digit = number % 10;       // Get last digit
	            reversed = reversed * 10 + digit; // Append digit
	            number = number / 10;          // Remove last digit
	        }

	        System.out.println("Reversed number: " + reversed);
	    }
	}

