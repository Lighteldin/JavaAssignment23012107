package org.example;

import org.example.product.Product;

import java.util.ArrayList;

public class Cart {
    private int customerId;
    private ArrayList<Product> products;

    public Cart(int customerId) {
        if (customerId < 0)
            this.customerId = (-1 * customerId);
        else
            this.customerId = customerId;

        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }
    public void removeAllProducts(){
        products.clear();
    }
    public int getProductsAmount(){return products.size();}

    public double calculatePrice(){
        double totalPrice = 0;
        for (Product i : products){
            totalPrice+=i.getPrice();
        }
        return totalPrice;
    }

    public Order placeOrder(){
        Order order = new Order(customerId, 1, products, calculatePrice());
        return order;
    }

    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        if (customerId < 0)
            this.customerId = (-1 * customerId);
        else
            this.customerId = customerId;
    }
}