package com.nhnacademy.problem.김형준;

public class RecursivePower {
    /**
     * 문제 : 거듭제곱을 recursive 형태로 구현해주세요.
     * 음의 정수의 지수를 받을 경우 포함.
     * 지수가 음의 정수인 경우 소수 계산을 위해 double로 타입 설정했습니다.
     * 
     * @param base 밑 값
     * @param exp  지수 값
     * @return 밑과 지수에 대한 거듭제곱 값
     */
    public static double power(double base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    /**
     *
     * result의 예상 결과값 >> 8.0
     */
    public static void main(String[] args) {
        double base = 2.0;
        int exp = 3;
        double result = power(base, exp);
        System.out.println(base + "의 " + exp + " 거듭제곱은 " + result + "입니다.");
    }

}
