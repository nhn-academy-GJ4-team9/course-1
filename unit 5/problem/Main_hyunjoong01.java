package com.introduction.unit5;

import java.util.Scanner;

public class Main_hyunjoong01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요");
        String line = sc.nextLine();
        line = line.replaceAll("\\s", "").toLowerCase();
        
    
        boolean isPalindrome = true;
        for (int i = 0; i < line.length() / 2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("입력한 문자열은 회문입니다.");
        } else {
            System.out.println("입력한 문자열은 회문이 아닙니다");
        }
        sc.close();
    }
}
