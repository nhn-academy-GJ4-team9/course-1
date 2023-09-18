package org.example;

public class Main_g {


    /**
     * %과 / 를 안쓰고 반복문을 사용하여 나머지와 몫을 출력하는
     * 함수를 만드시오.
     */
    public static String solution(int input, int input2) {
        int dividend = input;
        int divisor = input2;

        int result, rest;

        result = 0;
        rest = dividend;
        while (rest >= divisor) {
            rest = rest - divisor;
            result++;
        }

        return result + " " + rest;
    }

    public static void main(String[] args) {
        solution(3, 4);

    }
}
