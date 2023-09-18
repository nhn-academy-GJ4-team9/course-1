package com.nhnacademy.algorithm;

import java.util.Scanner;

public class Main_Sbin04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt() + 2;

        int pivot = num / 2 + 1;
        for (int i = 0; i < num; i++) {
            if (i % 2 != 0) {
                continue;
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            int number = 0;
            boolean flag = true;
            for (int j = i; j < num; j++) {
                if (number >= pivot) {
                    flag = false;
                }

                number = flag ? number + 1 : number - 1;
                System.out.print(number + " ");
            }
            pivot--;
            System.out.println();
        }
        scanner.close();
    }
}
