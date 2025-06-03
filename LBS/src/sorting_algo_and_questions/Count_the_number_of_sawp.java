package sorting_algo_and_questions;

public class Count_the_number_of_sawp {
	public static void main(String[] args) {
		int[] arr = {29, 10, 14, 37, 13};
		int count = 0;
        // Selection Sort logic
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            // Find the smallest element in the unsorted part
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                    
                }
            }

            // Swap the smallest element with arr[i]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            count ++;
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
           
        }
        
        // Print swap count
        System.out.println("\nNumber of swaps: " + count);
	}
	

}
