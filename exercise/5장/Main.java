/**
 * 연습 05.7 다음 기능이 정의된 날짜를 나타내는 Java 클래스를 구현합니다,
 * 날짜, 특정 일, 월, 연도 생성;
 * 일, 월, 연도 반환;
 * 두 날짜가 같은지 테스트합니다.
 * 날짜가 다른 날짜보다 앞에 있는지 테스트합니다.
 * 날짜의 연도가 윤년인지 테스트합니다.
 * 다음 날의 날짜를 계산해 보세요.
 * 날짜를 나타내는 클래스의 모든 기능을 테스트하는 프로그램도 작성하세요.
 */
public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(2023,3,28);
        Date date2 = new Date(2023,12,12);
        System.out.println(date1);
        System.out.println("같은 날짜인지 검사");
        date1.isEqual(date2);
        date1.precedes(date2);
        System.out.println("윤년인지 검사");
        date1.isLeapYear();
        Date nextDate = date1.nextDay();
        System.out.println("다음 날짜");
        System.out.println(nextDate);
    }
}