public class Main_sbin {
    // 인스턴스 변수
    private String title;
    private String author;
    private double price;
    //책과 관련된 정보를 처리하는 Book 클래스를 정의하세요 . 책의 관심 정보는 제목, 저자, 가격입니다. 관심 있는 방법은 다음과 같습니다.
    // 제목과 저자를 매개변수로 사용하여 책 개체를 생성하는 생성자
    // printBook 은 책의 제목과 저자를 두 줄로 인쇄합니다.
    // 책의 제목, 저자 및 가격을 인쇄하는 printBookPrice ;
    // windowBook ​​- 출력 창에 책의 제목과 저자를 두 줄로 표시합니다.
    // 책 제목을 반환하는 getTitle ;
    // 책의 저자를 반환하는 getAuthors ;
    // 책 가격을 반환하는 getPrice ;
    // setPrice - 책의 가격을 매개변수로 전달된 정수 값으로 설정합니다(참고: 정수에는 기본 유형 int를 사용합니다. 단원 4 참조).

    // 생성자
    public Main_sbin(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 책의 제목과 저자를 두 줄로 출력
    public void printBook() {
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
    }

    // 책의 제목, 저자, 가격을 출력
    public void printBookPrice() {
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("가격: " + price);
    }

    // 책의 제목 반환
    public String getTitle() {
        return title;
    }

    // 책의 저자 반환
    public String getAuthor() {
        return author;
    }

    // 책의 가격 반환
    public double getPrice() {
        return price;
    }

    // 책의 가격을 설정
    public void setPrice(int price) {
        this.price = price;
    }

    // 책 정보를 출력 창에 반환
    public String windowBook() {
        return "제목: " + title + "\n저자: " + author;
    }
}
