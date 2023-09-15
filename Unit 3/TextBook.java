package com.introduction.unit3;

public class TextBook extends Book {
    private String course;

    
    public TextBook(String title, String auString, int price, String course) {
        super(title, auString, price);
        this.course = course;
    }
    
    public String getcourse() {
        return course;
    }
    
}
