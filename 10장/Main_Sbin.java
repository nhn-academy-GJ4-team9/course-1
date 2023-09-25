package org.example;

public class Main_Sbin {
    // int값으로 정수를 받아 재귀 함수로 팩토리얼 계산하는 프로그램을 작성해주세요.
    public static void main(String[] args) {
        int n = 7;
        int factorial = calculateFactorial(n);
        System.out.println(factorial);
    }

    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}

