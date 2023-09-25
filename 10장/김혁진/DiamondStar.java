package com.nhnacademy.problem.김혁진;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DiamondStar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("정수를 입력하시오: ");
            int number = scanner.nextInt();
            preCondition(number);
            drawDiamondStar(1, number + 2);
        } catch (InputMismatchException e) {
            System.out.println("0보다 큰 정수를 입력하세요.");
        }
    }

    /**
     * input, return 직접 재귀 구현
     */
    private static void drawDiamondStar(int number, int limit) {
        if (number == limit) {
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            return;
        }

        if (number % 2 == 0) {
            drawDiamondStar(number + 1, limit);
        } else {
            drawLine(number, limit);
            System.out.println();

            drawDiamondStar(number + 1, limit);

            System.out.println();
            drawLine(number, limit);
        }

    }

    private static void drawLine(int number, int limit) {
        for (int i = 0; i < (limit - number) / 2; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    private static void preCondition(int number) {
        if (number <= 0) {
            throw new InputMismatchException();
        }
    }

}
