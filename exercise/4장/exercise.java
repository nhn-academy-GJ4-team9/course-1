package org.example.exercise;

import java.util.Scanner;

public class exercise {
    private static final double LIRE_TO_EURO_CURRENCY_RATE = 1936.27;

    /**
     * 상수로 주어진 1 euro의 1 lire의 값을 받아, 해당 lire가 몇 euro인지 계산하여 결과를 도출
     * 소수점 밑의 값은 생략, 환전자?의 수수료?
     *
     * @param x, lire 값(int)
     * @return 환전을 완료한 금액
     */
    public static double convertLireEuro(int x) {
        return Math.floor(LIRE_TO_EURO_CURRENCY_RATE * x);
    }

    public static int getArithmaticMean(int a, int b) {
        return (a + b) / 2;
    }

    public static double getGeometricMean(int a, int b) {
        return Double.parseDouble(String.format("%.2f", Math.sqrt(a * b)));
    }

    public static void main(String[] args) {
        System.out.println(convertLireEuro(10));

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수1 :");
        int a = scanner.nextInt();

        System.out.print("정수2 :");
        int b = scanner.nextInt();

        if (getArithmaticMean(a, b) > getGeometricMean(a, b)) {
            System.out.println("산술 평균");
        } else {
            System.out.println("기하 평균");
        }

        scanner.close();
    }
}
