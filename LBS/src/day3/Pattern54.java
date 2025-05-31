package day3;

public class Pattern54 {
	 public static void main(String[] args) {
	        for (char i = 'E'; i >= 'A'; i--) {
	            for (char j = 'A'; j <= 'E'; j++) {
	                if (j >= i) {
	                    if (i == 'A' || i == j || j == 'E') {
	                        // Calculate number as distance from i + 1
	                        System.out.print(j);
	                    } else {
	                        System.out.print(" ");  // spaces for hollow parts
	                    }
	                } else {
	                    System.out.print(" ");      // spaces before the triangle starts
	                }
	            }
	            System.out.println();
	        }
	    }


}
