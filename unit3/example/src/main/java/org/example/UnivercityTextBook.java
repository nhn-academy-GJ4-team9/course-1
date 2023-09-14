package org.example;

public class UnivercityTextBook extends TextBook{
    private String pro;
    public UnivercityTextBook(String title, String author, String course,String pro) {
        super(title, author, course);
        this.pro=pro;
    }

    public String getPro() {
        return pro;
    }

    public String toString(){
        return getTitle()+" "+getAuthor()+" "+getCourse()+" "+getPro()+" "+getPrice();
    }
}
