package org.example;

public class ArrayOperations {
    // Method to find the maximum value in an array
    public static int findMax(int[] array) {
        // Initialize max with the smallest possible integer value
        int max = Integer.MIN_VALUE;

        // Loop through each element in the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element is greater than the current max
            if (array[i] > max) {
                // If so, update the max with the new value
                max = array[i];
            }
        }

        // Return the maximum value found in the array
        return max;
    }
}
