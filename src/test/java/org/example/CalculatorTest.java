package org.example;

import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(5, 3);
        Assert.assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        int result = calc.subtract(5, 3);
        Assert.assertEquals(2, result);
    }

    // Additional test methods for multiplication and division can be added here.
}