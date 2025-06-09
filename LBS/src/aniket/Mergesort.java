package aniket;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3, 1};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;

        // Merge both arrays in sorted order
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k++] = first[i++];
            } else {
                mix[k++] = second[j++];
            }
        }

        // Copy remaining elements of first
        while (i < first.length) {
            mix[k++] = first[i++];
        }

        // Copy remaining elements of second
        while (j < second.length) {
            mix[k++] = second[j++];
        }

        return mix;
    }
}
