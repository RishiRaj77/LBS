package aniket;

public class Dupstr {
	public static void main(String[] args) {
		char[]a= {'a','b','c','d','e'};
		char[]b= {'a','b','d','e'};
		for (char i = 0; i < a.length; i++) {
			for (char j = 0; j < b.length; j++) {
				if (a[i]==b[j]) {
					System.out.println("repeting element is " + b[j]);
					
				}
			}
		}


}
	
	}


