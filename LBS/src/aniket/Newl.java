package aniket;

import java.util.Arrays;

public class Newl{
    public static void main(String[] args) {
        int[] oldarr = {3, 1, 2, 3, 4, 2, 5, 1};
        
        // Sort the array
        Arrays.sort(oldarr);
        
        // Initialize a counter for unique elements
        int uniqueCount = 0;

        // Iterate through the sorted array
        for (int i = 0; i < oldarr.length; i++) {
            // If it's the first element or different from the previous one
            if (i == 0 || oldarr[i] != oldarr[i - 1]) {
                oldarr[uniqueCount] = oldarr[i]; // Store unique element
                uniqueCount++; // Increment the count of unique elements
            }
        }

        // Print the new length of the array
        System.out.println("New length of the array: " + uniqueCount);
        
        // Optional: Print the unique elements
        System.out.print("Unique elements: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(oldarr[i] + " ");
        }
    }
}
