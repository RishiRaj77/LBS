package aniket;

import java.util.Arrays;

public class Dupli {
	 public static void main(String[] args) {
	        int[] arr = {7, 10,20,7, 4, 3, 20, 15};
	        
	        
	        Arrays.sort(arr);
	        for (int i = 0; i < arr.length-1; i++) {
				if (arr[i]==arr[i+1]) {
					System.out.println("duplicate" + arr[i]);
					
				}
			}
	        
}
}
