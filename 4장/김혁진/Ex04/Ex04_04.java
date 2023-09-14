/**
 * Exercise 04.4 Write a predicate with header
 */
public class Ex04_04 {
    /**
     * 주어진 숫자 x가 짝수인지 확인합니다.
     * @param x 검사할 숫자
     * @return 짝수이면 true 홀수이면 false
     */
    public static boolean even(long x) {
        return x % 2 == 0;
    }

    /**
     * 홀수 짝수 판별 프로그램 실행.
     */
    public static void main(String[] args) {
        System.out.println(even(10));
        System.out.println(even(15));
    }
}
