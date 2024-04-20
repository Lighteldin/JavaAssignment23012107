package org.example.product;

public class ElectronicProduct extends Product{
    private String brand;
    private int warrantyPeriod;

    public ElectronicProduct() {}
    public ElectronicProduct(int productId, String name, double price, String brand, int warrantyPeriod) {
        super(productId, name, price);
        this.brand = brand;

        if (warrantyPeriod <0)
            this.warrantyPeriod = (-1 * warrantyPeriod);
        else
            this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    public void setWarrantyPeriod(int warrantyPeriod) {
        if (warrantyPeriod <0)
            this.warrantyPeriod = (-1 * warrantyPeriod);
        else
            this.warrantyPeriod = warrantyPeriod;
    }
}
