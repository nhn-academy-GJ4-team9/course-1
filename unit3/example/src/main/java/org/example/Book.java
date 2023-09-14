package org.example;

public class Book {
    private String title;
    private String author;
    private  int price;
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }

    public void printBook(){
        System.out.println(this.title);
        System.out.println(this.author);
    }

    public void printBookPrice(){
        System.out.println(this.title+""+this.author+""+this.price);
    }

    public void windowBook(){
        System.out.println(this.title);
        System.out.println(this.author);
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

    public String toString(){
        return getTitle()+" "+getAuthor()+" "+getPrice();
    }
}
