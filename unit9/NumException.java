package org.example;

/**
 * String 을 정수로 변환 하는 메서드를 작성하세요
 * 정수로 변환이 불능할 경우 예외 처리하고 프로그램을 중지합니다.
 * 출력결과는 다음과 같습니다.
 * =====================================
 * 정수로 변환된 값은 3
 * 정수로 변환된 값은 14
 * 3.141592는 정수로 변환 할 수 없습니다.
 * ====================================
 */

/*

definition declaration
initialization assignment
expression statement
 */

public class NumException {
    public static void solution(String[] arr) {
        int i = 0;
        try {
            while (i < arr.length) {
                System.out.println("정수로 변환된 값은 " + Integer.parseInt(arr[i]));
                i++;
            }
        } catch (NumberFormatException e) {
            System.out.println(arr[i] + " 정수로 변환 할 수 없습니다.");
        }

    }

    public static void main(String[] args) {
        String[] arr = {"3", "14", "3.141592", "998"};
        solution(arr);
    }
}
