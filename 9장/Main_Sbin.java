package org.example;

import java.util.Scanner;

public class Main_Sbin{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;

        try {
            System.out.print("정수를 입력하세요: ");
            String userInput = scanner.nextLine();
            result = Integer.parseInt(userInput);
            System.out.println("입력한 정수는 " + result + "입니다.");
        } catch (NumberFormatException e) {
            System.err.println("올바른 정수 형식이 아닙니다. 숫자를 입력하세요.");
        } finally {
            scanner.close();
        }
    }
}
