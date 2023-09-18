package org.example;

import java.util.Scanner;

public class Exercises6_10 {
    public static long Factorial(int n) {
        if (n < 0) {
            System.out.println("음수는 정의되지 않습니다.");
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("양의 정수 n을 입력하세요: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("양의 정수를 입력해야 합니다.");
        } else {
            System.out.println("1부터 " + n + "까지의 숫자:");
            for (int i = 1; i <= n; i++) {
                long factorial = Factorial(i);
                System.out.println(i + "! = " + factorial);
            }
        }

    }
}
