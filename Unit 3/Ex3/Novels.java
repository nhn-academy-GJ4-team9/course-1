package com.introduction.unit3;

public class Novels extends Book {

    private String genre;

    
    public Novels(String title, String author, int price, String genre) {
        super(title, author, price);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
    
    public void printBookInfo() {
        System.out.println(getTitle() + " " + getAuthor() + " " + getPrice() + " " + getGenre());
    }

}
