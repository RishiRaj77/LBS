package aniket;

public class Commcar {
	public static void main(String[] args) {
		 String str1 = "rishi";
	        String str2 = "rishiraj";
	        
	        System.out.print("Common characters: ");
	        
	        // Iterate through each character of the first string
	        for (int i = 0; i < str1.length(); i++) {
	            char ch1 = str1.charAt(i);
	            
	            // Check if this character is present in the second string
	            for (int j = 0; j < str2.length(); j++) {
	                char ch2 = str2.charAt(j);
	                
	                // If a common character is found, print it
	                if (ch1 == ch2) {
	                    System.out.print(ch1 + " ");
	                    break; // Break to avoid printing duplicates from str1
	                }
	            }
	        }
		
	}

}
