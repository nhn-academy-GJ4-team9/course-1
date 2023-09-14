import java.util.Scanner;

/**
 * book 예제 실행 클래스.
 * 정적 메서드와 동적 메서드
 */
public class BookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("책의 제목 입력");
        String title1 = scanner.nextLine();
        System.out.print("책의 저자 입력: ");
        String authors1 = scanner.nextLine();
        Book book1 = new Book(title1, authors1);

        System.out.print("책의 제목 입력");
        String title2 = scanner.nextLine();
        System.out.print("책의 저자 입력: ");
        String authors2 = scanner.nextLine();
        Book book2 = new Book(title2, authors2);

        book1.printBook();
        book2.printBook();

        book1.setPrice(1000);
        book1.printBookPrice();
    }
}