package org.example;

public class Product {
    // Private instance variable 'name' to hold the name of the product
    private String name;

    // Private instance variable 'price' to hold the price of the product
    private double price;

    // Constructor to initialize a new Product object with a name and price
    public Product(String name, double price) {
        this.name = name; // Assign the 'name' argument to the 'name' instance variable
        this.price = price; // Assign the 'price' argument to the 'price' instance variable
    }

    // Public method 'getName' to return the name of the product
    public String getName() {
        return name; // Return the value of the 'name' instance variable
    }

    // Public method 'getPrice' to return the price of the product
    public double getPrice() {
        return price; // Return the value of the 'price' instance variable
    }
}
