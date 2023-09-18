package com.introduction.unit6;

import java.util.Scanner;
//  문제 : 정수 n을 입력받아 구구단을 출력하는 기능을을 구현해주세요.
public class Main_hyunjoong01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해주세요");

        int n = sc.nextInt();
        while (n > 1 && n < 9) {
            if (n > 1 && n <9) {
                for(int i = 1; i< 10; i++){
                    System.out.println(n +" * " + i +" = " + n * i);
                }
            } else {
                System.out.println("invald input");
            }
            System.out.println("정수를 입력해주세요");
            n = sc.nextInt();
        }
        sc.close();
    

    }
}
