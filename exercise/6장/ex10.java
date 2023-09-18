package org.example;

import java.util.Scanner;

public class ex10 {
    public static int factorial(int n) {

        if (n < 0) {
            throw new ArithmeticException("음수 값 x");
        }


        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        try{
            System.out.println(factorial(x));
        }
      catch (ArithmeticException e){
          System.out.println(e.getMessage());
      }
        for (int i = 0; i <= x; i++) {
            System.out.println(factorial(i));

        }
    }
}
