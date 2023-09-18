package org.example;

import java.util.Scanner;

public class Main_hyunjoong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요");
        String line = sc.nextLine();

        boolean isPalindrome = solution(line);
        // 문제 : 거꾸로 해도 같은 문자를 회문이라고 합니다.
        // 문자열을 입력받아 회문인지 아닌지 판별하는 기능을 구현해주세요.
        if (isPalindrome) {
            System.out.println("입력한 문자열은 회문입니다.");
        } else {
            System.out.println("입력한 문자열은 회문이 아닙니다");
        }
        sc.close();
    }
    public static boolean solution(String s) {
        StringBuilder builder = new StringBuilder(s).reverse();
        return s.equals(builder.toString());
    }
}
