package com.nhnacademy.problems.chapter9.김혁진;

public class NumException {
    public static void solution(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                int number = Integer.parseInt(arr[i]);
                System.out.println(number);
            } catch (NumberFormatException e) {
                System.out.println(arr[i] + "는 정수로 변환 할 수 없습니다.");
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = { "3", "14", "3.141592", "998" };
        solution(arr);
    }
}