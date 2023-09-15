package com.introduction.unit4.Ex4;

public class Ex4_1 {
    public static final double LIRE_TO_EURO_RATIO = 1987.6;
    public static void main(String[] args) {
        System.out.println(convertLireEuro(100));
    }

    public static double convertLireEuro(int x) {
        double euro = Math.floor(x / LIRE_TO_EURO_RATIO * Math.pow(10, 14)) / Math.pow(10, 14);
        return euro; 
    }
}
