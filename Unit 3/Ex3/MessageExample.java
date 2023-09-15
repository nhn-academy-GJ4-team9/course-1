package com.introduction.unit3;

import java.util.Scanner;

public class MessageExample {
    static String numOfSender = "01012345678";
    static String numTocall = "01087654321";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MessageText messageText = new MessageText();
        Message message = new Message(messageText, numTocall, numOfSender);
        
        System.out.println(message.getMessageText());
        System.out.println(message.getNumTocall());

        
        message.setNumTocall(inputPhoneNum(sc));

        System.out.println(message.getNumTocall());
        sc.close();
    }

    public static String inputPhoneNum(Scanner sc) {
        return sc.nextLine();
    }

}
