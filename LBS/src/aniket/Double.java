package aniket;
import java.util.Arrays;
import java.util.Iterator;

public class Double {
	public static void main(String[] args) {
		int[]arr= {1,1,2,2,3,4,4,5,5};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]!=arr[j]) {
					System.out.println(arr[i]);
					i++;
					
				}
				
			}
			
		}
		
		
		
		
		
		
	}
}
	
