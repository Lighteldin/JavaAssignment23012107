package org.example;

public class Customer {
    private int customerId;
    private String name;
    private String address;

    public Customer(){}
    public Customer(int customerId, String name, String address) {
        if (customerId < 0)
            this.customerId = (-1 * customerId);
        else
            this.customerId = customerId;

        this.name = name;
        this.address = address;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}