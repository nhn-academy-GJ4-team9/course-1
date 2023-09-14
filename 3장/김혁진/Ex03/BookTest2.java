import java.util.Scanner;

public class BookTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 책 정보 입력
        System.out.println("책 제 입력");
        String title1 = scanner.nextLine();
        System.out.println("책 저자 입력");
        String authors1 = scanner.nextLine();
        System.out.println("학부 입력");
        String faculty1 = scanner.nextLine();

        // 첫 번째 책 객체 생성
        BCNTextbook firstBook = new BCNTextbook(title1, authors1, faculty1);

        // 첫 번째 책 정보 출력
        System.out.println("책 정보 출력");
        System.out.println("Title: " + firstBook.getTitle());
        System.out.println("Authors: " + firstBook.getAuthor());
        System.out.println("Faculty: " + firstBook.getFaculty());

        // 두 번째 책 정보 입력
        System.out.println("제목 입력");
        String title2 = scanner.nextLine();
        System.out.println("저자 입력");
        String authors2 = scanner.nextLine();

        // 두 번째 책 객체 생성 (Book 타입)
        Book secondBookInfo = new Book(title2, authors2);

        // 두 번째 책의 주제 입력
        System.out.println("책 주제 입력");
        String topic2 = scanner.nextLine();

        // 두 번째 책의 소설 객체 생성
        Novel secondBookNovel = new Novel(title2, authors2, topic2);

        // 두 번째 책 정보 출력
        System.out.println("책 정보 출력");
        System.out.println("Title: " + secondBookInfo.getTitle());
        System.out.println("Authors: " + secondBookInfo.getAuthor());

        System.out.println("책 정보 출력");
        System.out.println("Title: " + secondBookNovel.getTitle());
        System.out.println("Authors: " + secondBookNovel.getAuthor());
        System.out.println("Type: " + secondBookNovel.getType());

        // 첫 번째 책의 가격 입력
        System.out.println("책 가격 입력");
        int price1 = scanner.nextInt();
        firstBook.setPrice(price1);

        // 첫 번째 책의 정보 출력
        System.out.println("책 정보 출력");
        System.out.println("Title: " + firstBook.getTitle());
        System.out.println("Authors: " + firstBook.getAuthor());
        System.out.println("Faculty: " + firstBook.getFaculty());
        System.out.println("Price: " + firstBook.getPrice());

        scanner.close();
    }
}
