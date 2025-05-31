package day3;

public class Pattern42 {
	 public static void main(String[] args) {
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (j >= i) {
	                    if (i == 0 || i == j || j == 4) {
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
