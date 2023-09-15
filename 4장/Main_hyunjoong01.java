package org.example;

// a와 b를 비교하여 결과를 예측하세요. 보다 정확한 결과를 얻을 방법을 추가해주세요.

public class Main_hyunjoong01 {
    public static void main(String[] args) {

        double a = Double.parseDouble(String.format("%.3f", 0.1 + 0.2));
        double b = Double.parseDouble(String.format("%.3f", 0.3));

        if (a == b) {
            System.out.println("a와 b는 같다");
        } else if (a < b) {
            System.out.println("a는 b보다 작다");
        } else {
            System.out.println("a는 b보다 크다");
        }
    }
}

/*
    1. BigDeciaml 타입의 doubleValue() 사용
    2. 절댓값 사용, eps(너무 작은 소수 값)보다 작으면 0이라고 취급
    3. 소수 특정 자리수 까지 반올림, 값을 같게 만들어 값을 비교

    3번 방법을 사용할 예정
 */
