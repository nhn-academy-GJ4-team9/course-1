package com.introduction.unit3;

import java.util.Scanner;

import javax.swing.text.html.StyleSheet;

public class Message {

    private MessageText messageText;
    private String numTocall;
    

    private String numOfsender;


    public Message(MessageText messageText, String numTocall, String numOfsender) {
        this.messageText = messageText;
        this.numTocall = numTocall;
        this.numOfsender = numOfsender;
    }

    public Message(MessageText messageText, String numOfsender) {
        this.messageText = messageText;
        this.numOfsender = numOfsender;
    }

    public Message(MessageText messageText) {
        this.messageText = messageText;
    }

   
    
    public MessageText getMessageText() {
        return messageText;
    }
    public String getNumTocall() {
        return numTocall;
    }


    public String getNumOfsender() {
        return numOfsender;
    }

    public void printMessage() {
        System.out.println(getMessageText());
    }
    public void setNumTocall(String numTocall) {
        this.numTocall = numTocall;
    }

    public void setNumOfsender(String numOfsender) {
        this.numOfsender = numOfsender;
    }
    
    @Override
    public  String toString() {
        return "Message [messageText=" + messageText + ", numTocall=" + numTocall + ", numOfsender=" + numOfsender
                + "]";
    }

    

}
