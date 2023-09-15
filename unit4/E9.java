package org.example;

class Product {
    private String name;
    private int quantity;

    public Product(String name) {
        this.name = name;
        this.quantity = 0;
    }

    public void downLoad(int quantity) {
        this.quantity += quantity;
    }

    public void upLoad(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return name + ", " + quantity + " pieces";
    }
}
public class E9{
    public static void main (String[] args) {
        Product lamp = new Product("Lamp 60 Watt");
        System.out.println("Before the loading: " + lamp);
        lamp.downLoad(1000);
        lamp.upLoad(100);
        System.out.println("After the loading: " + lamp);
    }
}