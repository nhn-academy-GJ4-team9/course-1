package org.example;

import java.util.Scanner;

public class MessageText {

    private String code;
    private String complete_message;
    MessageText(String code,String complete_message){
        this.code=code;
        this.complete_message=complete_message;
    }

    public String getCode() {
        return code;
    }

    public String getComplete_message() {
        return complete_message;
    }

    public String toString(){
        return code+" "+complete_message;
    }


}
