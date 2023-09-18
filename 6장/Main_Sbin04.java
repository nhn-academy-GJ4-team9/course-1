package org.example;

import java.util.Scanner;

public class Main_Sbin04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("피라미드의 높이를 입력하세요: ");
        int height = scanner.nextInt();

        if (height < 1) {
            System.out.println("피라미드의 높이는 1 이상이어야 합니다.");
            return;
        }

        for (int i = height; i >= 1; i--) {

            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
