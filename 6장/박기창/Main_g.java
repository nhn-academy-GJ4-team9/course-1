package com.nhnacademy.algorithm;

public class Main_g {
    public static void main(String[] args) {
        System.out.println(solution(10, 3));
        System.out.println(solution(110, 3));
        System.out.println(solution(10, 11));
    }

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
