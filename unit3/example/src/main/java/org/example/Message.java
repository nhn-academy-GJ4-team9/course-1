package org.example;

import java.util.Scanner;

public class Message {
    private String call;
    private String sender;

    private MessageText messageText;

    public Message(MessageText messageText,String call,String sender){
        this.messageText=messageText;
        this.call=call;
        this.sender=sender;
    }
    Message(MessageText messageText,String sender){
        this.messageText=messageText;
        this.sender=sender;
    }

    Message(MessageText messageText){
        this.messageText=messageText;

    }

    public void setCall(String call) {
        this.call = call;
    }

    public MessageText getMessageText() {
        return messageText;
    }


}
