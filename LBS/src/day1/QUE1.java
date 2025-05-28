package day1;
import java.util.Scanner;

public class QUE1 {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        
	        int og = number;
	        int reversed =0;
	        
	        while (number>0) {
	        	int digit = number % 10;
	        	reversed = reversed * 10 + digit;
	        	number = number /10;
				
			}
	        if (reversed== og) {
	        	System.out.println("palindrome");
				
			} else {
				System.out.println("not palindrome");

			}
	}

}
