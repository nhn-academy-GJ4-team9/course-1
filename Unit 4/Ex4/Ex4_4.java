package com.introduction.unit4.Ex4;

public class Ex4_4 {
    public static void main(String[] args) {
        System.out.println(even(2));
    }
    
    public static boolean even(long x) {
        if (x % 2 == 0) {
            return true; 
        } else {
            return false;
        }
    }
}
