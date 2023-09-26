package org.example;

// int값으로 정수를 받아 재귀 함수로 팩토리얼 계산하는 프로그램을 작성해주세요.

public class Main_Sbin {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(4));
    }

    public static int calculateFactorial(int n) {
        if (n <0 )
            return n;
        else if (n == 1) 
            return 1;
        else {
            return n * calculateFactorial(n - 1);
            }
    }
}

