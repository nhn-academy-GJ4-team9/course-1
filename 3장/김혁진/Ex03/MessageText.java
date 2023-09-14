import java.util.Scanner;

/**
 * message를 변수명으로 사용해도 되는가 ?
 * 간격을 얼마나 해야 하는가 ?
 *
 */
public class MessageText {
    private String code;
    private String message;

    /**
     * 메시지 생성자
     */
    public MessageText() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the code: ");
        this.code = scanner.nextLine();

        System.out.print("Enter the message: ");
        this.message = scanner.nextLine();
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

