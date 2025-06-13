package aniket;


public class Miss {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8}; // example array

        System.out.print("Missing numbers: ");

        // For each number from 1 to 10
        for (int i = 1; i <= 10; i++) {
            boolean found = false;

            // Check if i is present in the array
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            // If not found, print it as missing
            if (!found) {
                System.out.print(i + " ");
            }
        }
    }
}
