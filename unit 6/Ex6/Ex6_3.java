package com.introduction.unit6.Ex6;

public class Ex6_3 {
    public static int factorial(int n) {
        int nFactorial = 1;

        if (n < 0) {
            System.out.println("n is negative, wrong input");
            return nFactorial = n;
        }
        while (n > 0) {
            nFactorial *= n;
            n--;
        }

        return nFactorial;

    }

    public static void main(String[] args) {
        System.out.println(factorial(4));

    }
}
