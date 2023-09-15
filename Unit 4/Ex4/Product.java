package com.introduction.unit4.Ex4;

public class Product {
    private String name;

    private int number;

    public Product(String name) {
        this.name = name;
        this.number = 0;
    }

    public Product(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void downLoad(int i) {
        number += i;
    }

    public void upLoad(int i) {
        number -= i;
    }

    @Override
    public String toString() {
        return  name + "," + number ;
    }

}
