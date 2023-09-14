public class Message {

    private String sendNumber;
    private String receiveNumber;
    private MessageText messageText;

    public Message(MessageText messageText, String receiveNumber, String sendNumber) {
        this.receiveNumber = receiveNumber;
        this.sendNumber = sendNumber;
        this.messageText = messageText;
    }

    public Message(MessageText messageText, String sendNumber) {
        this(messageText, "", sendNumber);
    }

    public Message(MessageText messageText) {
        this(messageText, "", "");
    }
    public void setReceiveNumber(String receiveNumber) {
        this.receiveNumber = receiveNumber;
    }

    public void printMessage() {
        System.out.println("Send: " + sendNumber);
        System.out.println("Receive: " + receiveNumber);
        System.out.println("Code: " + messageText.getCode());
        System.out.println("Message: " + messageText.getMessage());
    }
}
