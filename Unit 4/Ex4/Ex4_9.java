package com.introduction.unit4.Ex4;

public class Ex4_9 {
    public static void main(String[] args) {
        Product lamp = new Product("Lamp 60 Watt");
        System.out.println("Before the loading : " + lamp);
        lamp.downLoad(1000);
        lamp.upLoad(100);
        System.out.println("After the Loading : " + lamp);
    }
}
