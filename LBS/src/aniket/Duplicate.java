package aniket;

public class Duplicate {
	    public static void main(String[] args) {
	        int[] arr = {21, 11, 23, 5, 4, 14, 11, 21};
	        int n = arr.length;

	        // Bubble Sort to sort the array in ascending order
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap arr[j] and arr[j + 1]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        // Display the sorted array
	        System.out.print("Sorted Array: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        // Find and display duplicate elements
	        System.out.print("Duplicate elements: ");
	        boolean hasDuplicates = false;
	        for (int i = 0; i < n - 1; i++) {
	            if (arr[i] == arr[i + 1]) {
	                // To avoid printing duplicates multiple times
	                if (i == 0 || arr[i] != arr[i - 1]) {
	                    System.out.print(arr[i] + " ");
	                    hasDuplicates = true;
	                }
	            }
	        }
	        if (!hasDuplicates) {
	            System.out.print("None");
	        }
	    }
	}


