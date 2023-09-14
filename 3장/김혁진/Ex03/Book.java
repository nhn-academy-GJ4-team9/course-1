/**
 * Book class.
 */
public class Book {
    private String title;
    private String author;
    private int price;

    /**
     * 책의 생성자.
     *
     * @param title
     * @param author
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * 책의 제목과 저자를 한줄씩 출력하기 위한 메서드.
     */
    public void printBook() {
        System.out.println("책 제목 :" + this.title);
        System.out.println("책 저자 :" + this.author);
    }

    /**
     * 책의 제목,저자,가격을 출력하는 메서드
     */
    public void printBookPrice() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(getPrice());
    }

    /**
     * 책의 제목을 반환
     *
     * @return  제목
     */
    public String getTitle() {
        return title;
    }

    /**
     * 책의 저자를 반환
     *
     * @return  저자
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 책의 가격을 반환.
     *
     * @return 가격
     */
    public int getPrice() {

        return price;

    }

    public void setPrice(int price) {
        this.price = price;
    }
}
