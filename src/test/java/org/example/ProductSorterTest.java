package org.example;

import org.junit.Assert;
import org.junit.Test;

// Create a test class for the ProductSorter class
public class ProductSorterTest {

    // Define a test method to test the sorting of products by price
    @Test
    public void testSortByPrice() {
        // Create an array of Product objects with names and prices
        Product[] products = new Product[] {
                new Product("Laptop", 1200.00),
                new Product("Phone", 800.00),
                new Product("Watch", 300.00)
        };

        // Call the sortByPrice method to sort the products by price
        ProductSorter.sortByPrice(products);

        // Assert that the first product in the sorted array has the name "Watch"
        Assert.assertEquals("Watch", products[0].getName());

        // Assert that the second product in the sorted array has the name "Phone"
        Assert.assertEquals("Phone", products[1].getName());

        // Assert that the third product in the sorted array has the name "Laptop"
        Assert.assertEquals("Laptop", products[2].getName());
    }
}