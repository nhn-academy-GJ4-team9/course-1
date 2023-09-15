package com.introduction.unit3;

import java.util.Scanner;

public  class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printBook() {
        System.out.println(getTitle());
        System.out.println(getAuthor());
    }

    public void printBookPrice() {
        System.out.println(getTitle() + " " + getAuthor() + " " + getPrice());
    }

    public void windowBook() {
        printBook();
    }
}
