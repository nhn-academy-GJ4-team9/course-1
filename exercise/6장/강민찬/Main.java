package com.nhnacademy.exercise.chapter6;

import java.util.Scanner;

public class Main {
    private Main() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        factorial(scanner.nextInt());
        scanner.close();
    }

    private static void preCondition(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("0 이상의 수를 입력하셔야 합니다.");
        }
    }

    public static int factorial(int number) {
        preCondition(number);

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
            System.out.print(result + " ");
        }
        System.out.println();

        return result;
    }
}
