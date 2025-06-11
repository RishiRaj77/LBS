package aniket;

import java.util.Arrays;

public class Kth {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        
        Arrays.sort(arr); 
        
        System.out.println(k + "th smallest element is " + arr[k - 1]);
        System.out.println(k + "th largest element is " + arr[arr.length-k]);

    }
}
