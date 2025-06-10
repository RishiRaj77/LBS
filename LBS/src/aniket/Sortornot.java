package aniket;

public class Sortornot {

    public static boolean isSorted(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }

        for (int i = 1; i < arr.length; i++) {
        	
            if (arr[i] < arr[i - 1]) {
            	
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
    	
        int[] arr1 = {1, 3, 2, 4, 5};        
        System.out.println("Array 1 is sorted: " + isSorted(arr1)); 

        
    }
}

