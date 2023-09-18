package org.example;

import java.util.Scanner;
//  문제 : 정수 n을 입력받아 구구단을 출력하는 기능을을 구현해주세요.
//  잘못 입력 받을시 재입력을 받는 반복문을 작성해주세요.
public class Main_hyunjoong02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해주세요");

        int n = sc.nextInt();
        if (n > 0) {
            for (int i = 1; i < 10; i++) {
                System.out.println(n + " * " + i + " = " + i * n);
            }
        } else {
            System.out.println("잘못 입력 했습니다. 다시 입력해 주세요.");
            int k = sc.nextInt();
            if(k > 0){
            for (int a = 1; a < 10; a++) {
                System.out.println(k + " * " + a + " = " + k * a);
            }
            }
        }
    }
}
