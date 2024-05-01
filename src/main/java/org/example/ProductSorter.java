package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class ProductSorter {

    // This static method sorts an array of Product objects by their price in ascending order.
    public static void sortByPrice(Product[] products) {
        // Use Arrays.sort method with a lambda expression to define the sorting criteria.

        Arrays.sort(products, (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

        // The lambda expression compares two Product objects based on their price.
        // The sort method modifies the 'products' array in place, sorting the Product objects by their price.
        // 'p1.getPrice()' and 'p2.getPrice()' fetch the prices of two Product objects for comparison.
        // 'Double.compare()' compares two double values and returns an integer to determine the order.
    }
}
