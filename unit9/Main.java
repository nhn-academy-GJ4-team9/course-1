package org.example;

/*
 * 문제: 다음 소스의 오류를 해결하고 그 이유를 기술 하시오.
 *
 * 조건:
 *  1. main() 함수를 수정하시 마시오.
 *  2. B() 함수의 파라미터의 값을 변경하지 마시오.
 *  3. B()의 Statement Block 내부를 수정하지 마시오.
 */


public class Main {
    public static void main(String[] args) {
        try {
            A();
        } catch (Exception e) {
            e.getMessage();
            System.out.println("오류 발생, 종료");
        }
    }

    public static void A() throws Exception {

        B(22);
    }

    public static void B(int number) throws Exception {
        if (number % 2 == 0) {
            throw new Exception("오류");
        }
    }
}
