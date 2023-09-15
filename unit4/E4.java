package org.example;

import java.util.Scanner;

public class E4 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("첫 번째 정수를 입력하세요:");
            int num1 = scanner.nextInt();

            System.out.println("두 번째 정수를 입력하세요:");
            int num2 = scanner.nextInt();

            // 산술 평균 계산
            double avg = (num1 + num2) / 2.0;
            System.out.println("산술 평균: " + avg);

            // 기하 평균 계산
            double avg2 = Math.sqrt(num1 * num2);
            System.out.println("기하 평균: " + avg2);

            // 두 수 중 큰 수와 작은 수 찾기
            int max = Math.max(num1, num2);
            int min = Math.min(num1, num2);
            System.out.println("큰 수: " + max);
            System.out.println("작은 수: " + min);
        }

}
