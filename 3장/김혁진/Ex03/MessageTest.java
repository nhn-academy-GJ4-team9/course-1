import java.util.Scanner;

public class MessageTest {
    public static void main(String[] args) {
        String senderNumber = "123-456-7890";

        MessageText messageText = new MessageText();
        String receiverNumber = readPhoneNumber("받는사람 번호 ");

        Message message = new Message(messageText, receiverNumber, senderNumber);
        message.printMessage();

        Message additionalMessage = new Message(messageText);
        additionalMessage.setReceiveNumber("987-654-3210");
        additionalMessage.printMessage();
    }

    public static String readPhoneNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }
}