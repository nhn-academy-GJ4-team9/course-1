package org.example;

public class Main_g {
    public static void main(String[] args) {
        System.out.println(solution(10, 3));
        System.out.println(solution(110, 3));
        System.out.println(solution(10, 11));
    }
    /**
     * %과 / 를 안쓰고 반복문을 사용하여 나머지와 몫을 출력하는
     * 함수를 만드시오.
     */

    public static String solution(int a, int b) {
        int result = 0;
        int remain = 0;

        while (a >= b) {
            a -= b;
            result++;
        }
        remain = a;

        return result + " ... " + remain;
    }
}
