package org.example;

public class ArrayRotations {
    // Method to rotate an array to the right by k positions
    public static void rotateArray(int[] array, int k) {
        // Get the length of the array
        int length = array.length;
        // Handle rotations larger than array length
        k %= length;
        // Reverse the whole array
        reverse(array, 0, length - 1);
        // Reverse the first part
        reverse(array, 0, k - 1);
        // Reverse the second part
        reverse(array, k, length - 1);
    }

    // Method to reverse a portion of an array from index 'start' to 'end'
    private static void reverse(int[] array, int start, int end) {
        // Loop until start is less than end
        while (start < end) {
            // Swap the elements at the start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            // Increment start and decrement end
            start++;
            end--;
        }
    }
}
