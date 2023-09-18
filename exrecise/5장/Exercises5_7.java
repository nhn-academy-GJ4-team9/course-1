package org.example;

import java.util.Scanner;

public class Exercises5_7 {
    public static void main(String[] args) {
        //윤년&날짜 코딩
        Scanner scanner = new Scanner(System.in);
        System.out.println("년도를 입력하세요:");
        int LeepYear = scanner.nextInt();
        if (LeepYear % 4 == 0){
            System.out.println("윤년입니다.");
        }else {
            System.out.println("평년입니다.");
        }
        System.out.println("일수를 적어주세요:");

        int month=1;
        int day =scanner.nextInt();
        int[] list = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i<list.length; i++){
            if(day>list[i]){
                day -=list[i];
                month++;
            }else{
                break;
            }
        }

        System.out.println(month +"  "+ day);
    }
}

