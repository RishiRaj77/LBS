package aniket;

import java.util.Arrays;

public class DEl {
	public static void main(String[] args) {
		int[]oldarr= {1,2,3,4,5};
		int pos=2;
		
		int[]newarr = new int[oldarr.length-1];
		
		for (int i = 0; i < pos; i++) {
			newarr[i]=oldarr[i];
			
		}
		
		for (int j = pos+1; j < oldarr.length; j++) {
			newarr[j-1]=oldarr[j];
			
		}
		 System.out.println(Arrays.toString(newarr));

	}
	

}
