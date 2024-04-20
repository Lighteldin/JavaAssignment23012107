package org.example.product;

public class Product {
    private int productId;
    private String name;
    private double price;

    public Product() {}
    public Product(int productId, String name, double price) {
        if (productId < 0)
            this.productId = (-1 * productId);
        else
            this.productId = productId;

        this.name = name;

        if (price < 0)
            this.price = (-1 * price);
        else
            this.price = price;
    }

    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        if (productId < 0)
            this.productId = (-1 * productId);
        else
            this.productId = productId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price < 0)
            this.price = (-1 * price);
        else
            this.price = price;
    }
}
