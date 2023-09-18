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

public class Date {
    private int year, month, day;

    public Date(int year, int month, int day) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("에러");
        }
    }

    /** 날짜 유효값 겁사
     *
     * @param day
     * @param month
     * @param year
     * @return
     */
    public static boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > 31) {
            return false;
        }
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[2] = 29;
        }
        return day <= daysInMonth[month];
    }

    /**
     * 날짜가 동일한 날짜인지 검사
     * @param date : 비교 대상 날짜
     */
    public void isEqual(Date date) {
        if (this.day == date.day && this.month == date.month && this.year == date.year) {
            System.out.println("같음");
        } else {
            System.out.println("같지않음");
        }
    }

    /**
     * 날짜가 다른 날짜보다 앞선지 검사
     * @param date : 비교 대상 날짜
     * @return 날짜가 앞서 있으면 true 아니면 false
     */
    public boolean precedes(Date date) {
        if (year != date.year) {
            return year < date.year;
        }
        if (month != date.month) {
            return month < date.month;
        }
        return day < date.day;
    }

    /**
     * 해당 날짜가 윤년인지 검사
     * @return 윤년이면 true 아니면 false
     */
    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * 다음 날짜 계산
     * @return 날짜 추가 후 새로운 날짜 반환
     */
    public Date nextDay() {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear()) {
            daysInMonth[2] = 29;
        }

        int newDay = day + 1;
        int newMonth = month;
        int newYear = year;

        if (newDay > daysInMonth[month]) {
            newDay = 1;
            newMonth++;
            if (newMonth > 12) {
                newMonth = 1;
                newYear++;
            }
        }

        return new Date(newDay, newMonth, newYear);
    }

}