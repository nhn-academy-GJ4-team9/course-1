package org.example;

public class TailBook extends Book{
    private String type;
    public TailBook(String title, String author,String type) {
        super(title, author);
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public String toString(){
        return getTitle()+" "+getAuthor()+" "+getType();
    }
}
