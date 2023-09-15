package com.introduction.unit4.Ex4;

public class Ex4_10 {
    public static char lastCharacter(String s) {
        return s.charAt(s.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(lastCharacter("apple"));
    }
    
}
