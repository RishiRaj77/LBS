package aniket;
package java.util;

public class Duplicateormot {
	 public static void findDuplicatesSorted(int[] arr) {
	        if (arr == null || arr.length <= 1) {
	            System.out.println("No duplicates possible in an array of size 0 or 1.");
	            return;
	        }
	        boolean foundDuplicate = false;
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] == arr[i - 1]) {
	                System.out.println("Duplicate found (in sorted array): " + arr[i]);
	                foundDuplicate = true;
	            }
	        }
	        if (!foundDuplicate) {
	            System.out.println("No duplicates found in the sorted array.");
	        }
	    }
	
	

public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5 , 5};
    System.out.println("Array 1: " + java.util.Arrays.toString(arr1));
    findDuplicatesSorted(arr1);
    
}
}
