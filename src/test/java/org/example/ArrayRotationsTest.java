package org.example;

import org.junit.Test;

import org.junit.Assert;

public class ArrayRotationsTest {

    @Test
    public void testRotateArray() {
        // Define a test array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        // Define the number of rotations
        int k = 6;
        // Call the rotateArray method with the test array and number of rotations
        ArrayRotations.rotateArray(array, k);
        // Define the expected rotated array
        int[] expectedRotatedArray = {3, 4, 5, 6, 7, 8, 1, 2};
        // Assert that rotateArray correctly rotates the array
        Assert.assertArrayEquals(expectedRotatedArray, array);
    }
}