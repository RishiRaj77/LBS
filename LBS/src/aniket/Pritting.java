package aniket;

public class Pritting {
	public static void main(String[] args) {
		for (char i = 'a'; i <= 'e'; i++) {
			
			for (int j = 'a'; j <='e'; j++) {
				
				if (j>=i ) {
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
