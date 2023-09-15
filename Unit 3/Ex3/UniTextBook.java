package com.introduction.unit3;

public class UniTextBook extends TextBook{
    private String faculty;

    
    public UniTextBook(String title, String author, int price, String course, String faculty) {
        super(title, author, price, course);
        this.faculty = faculty;
    }

    public String getfaculty() {
        return faculty;
    }
    
    public void printBookInfo() {
        System.out.println(getTitle() + " " + getAuthor() + " " + getPrice() + " " + getfaculty() +" "+ getcourse());
    }

    @Override
    public String toString() {
        return getTitle() + " " + getAuthor() + " " + getPrice() + " " + getcourse() +" "+ getfaculty();
    }
    
    
}
