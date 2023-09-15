package com.introduction.unit3;

import java.util.Scanner;

public class MessageText {

    
    Scanner sc = new Scanner(System.in);
    String[] input = sc.nextLine().split(" ");

    private String code = input[0];

    private String text = input[1];

    public MessageText() {
        this.code = code;
        this.text = text;

    }

    
    public MessageText(String code, String text) {
        this.code = code;
        this.text = text;
        
    }
    
    public String getCode() {
        return code;
    }
    
    public String getText() {
        return text;
    }
    
    public void setCode(String code) {
        
        this.code = code;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    @Override
    public String toString() {
        return "MessageText [code=" + code + ", text=" + text + "]";
    }

}
