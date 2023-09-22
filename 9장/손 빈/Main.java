package com.nhnacademy.problems.chapter9.손빈;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // try- catch - finally 문으로 입력을 받아, 정수 판별 프로그램을 작성해 주세요.
    // 문자열이 입력되면 "올바르지 않는 형식입니다." 로 출력하세요.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("정수를 입력하세요: ");
            int number = scanner.nextInt();
            System.out.println("입력한 정수: " + number);
        } catch (InputMismatchException e) {
            System.out.println("올바르지 않은 형식입니다.");
        } finally {
            scanner.close();
        }
    }
}