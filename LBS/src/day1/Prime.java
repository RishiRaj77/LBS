package day1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        
	        int count = 0;
	        
	        for (int i = 0; i < number; i++) {
	        	
	        	if (number%2 == 0) {
	        		count ++;
					
				}
	        		
			}
	    	if (count == 2) {
        		System.out.println("prime");
				
			} else {
				System.out.println("not prime ");

			}
	        

	}

}
