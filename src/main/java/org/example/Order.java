package org.example;

import org.example.product.Product;

import java.util.ArrayList;

public class Order {
    private int customerId;
    private int orderId;
    private ArrayList<Product> products;
    private double totalPrice;

    public Order(int customerId, int orderId, ArrayList<Product> products, double totalPrice){
        if (customerId < 0)
            this.customerId = (-1 * customerId);
        else
            this.customerId = customerId;

        if (orderId < 0)
            this.orderId = (-1 * orderId);
        else
            this.orderId = orderId;

        this.products = products;

        if (totalPrice < 0)
            this.totalPrice = (-1 * totalPrice);
        else
            this.totalPrice = totalPrice;
    }

    public String printOrderInfo(){
        String s = "Order ID: " + orderId+
        "\nCustomer ID: " + customerId+
        "\nTotal Price: $" + totalPrice;
        return s;
    }
    public ArrayList<String> getProducts(){
        ArrayList<String> productNames = new ArrayList<>();
        for (Product i : products){
            productNames.add(i.getName());
        }
        return productNames;
    }
}