package com.nhnacademy.problem.손빈;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("정수를 입력하시오: ");
            int number = scanner.nextInt();
            preCondition(number);
            System.out.println(calculateFactorial(number));
        } catch (InputMismatchException e) {
            System.out.println("0 이상의 정수를 넣어주세요.");
        }
    }

    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * calculateFactorial(n - 1);
    }

    private static final void preCondition(int number) {
        if (number < 0) {
            throw new InputMismatchException();
        }
    }
}
