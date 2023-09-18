package com.nhnacademy.algorithm;

public class Main_Sbin03 {
    public static void main(String[] args) {
        System.out.println(getGrade(86));
    }

    public static char getGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
