package day1;

import java.util.Scanner;

public class ARMS {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        
	        int og = number;
	        int arm =0;
	        
	        while (number>0) {
	        	int digit = number % 10;
	        	arm = arm + (digit*digit*digit);
	        	number = number /10;
				}
	        if (arm == og) {
	        	System.out.println("arm");
				
			} else {
				System.out.println("not arm");

			}

}
}
