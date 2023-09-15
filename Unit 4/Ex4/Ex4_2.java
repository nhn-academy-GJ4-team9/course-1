package com.introduction.unit4.Ex4;

public class Ex4_2 {
    public static void main(String[] args) {
        short x = 128;
        short y = 1;
        System.out.println(sumOverflow((byte)x,(byte)y));
    }
    
    public static boolean sumOverflow(byte x, byte y) {
        if (x + y < -100) {
            return true;
        } else {
            return false;
        }

    }
}
