package org.example;

import java.util.Scanner;

public class MessageTest {

    public static String keyborad(Scanner scanner){
        String phonenumber="";
        phonenumber=scanner.nextLine();
        return phonenumber;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String call=keyborad(scanner);
        String sender=keyborad(scanner);
        String code=keyborad(scanner);
        String complete_message=keyborad(scanner);

        MessageText messageText = new MessageText(code,complete_message);
        Message message = new Message(messageText,call,sender);

        System.out.println(message.getMessageText());

        scanner.close();

    }
}
