package org.example;

import java.util.Scanner;

//  문제 : 정수 n을 입력받아 구구단을 출력하는 기능을을 구현해주세요.
public class Main_hyunjoong02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해주세요");

        int n = sc.nextInt();
        int i = 1;
        while (true) {
            if (i <= 9) {
                System.out.println(n + " * " + i + " = " + n * i);
                i++;
                continue;
            } else {
                break;
            }

        }
        sc.close();


    }
}
