package org.example;

import java.util.Scanner;

public class Main_Sbin04 {
    // 숫자를 입력 받아 숫자피라미드를 역으로 출력하는 코드를 작성하세요.

    /**
     * 입력 3
     * 1 2 3 2 1
     * 1 2 1
     * 1
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int x = n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
                System.out.print(" ");
            }

            for (int j = 1; j <= x; j++) {
                System.out.print(j + " ");
            }
            x--;

            for (int j = x; j > 0; j--) {
                System.out.print(j + " ");
            }

            System.out.println();

        }
    }
}
