package com.introduction.unit4.Ex4;

import java.util.Scanner;

public class Ex4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x / 2 + y / 2);
        System.out.println(Math.sqrt(x) * Math.sqrt(y));
        System.out.println(Math.max(x, y));
    }
}
