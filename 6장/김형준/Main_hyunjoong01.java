package com.nhnacademy.algorithm;

import java.util.Scanner;

// 문제 : 정수 n을 입력받아 구구단을 출력하는 기능을을 구현해주세요.
public class Main_hyunjoong01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        do {
            System.out.print("정수를 입력해주세요: ");
            n = sc.nextInt();
            if (n == 0) {
                System.out.println("종료합니다.");
                break;
            }

            for (int i = 1; i <= 9; i++) {
                System.out.println(n + " * " + i + " = " + n * i);
            }

        } while (true);
        sc.close();

    }
}
