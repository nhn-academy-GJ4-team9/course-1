package org.example;
import java.util.Scanner;

public class Exercises4_3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int total = a+b;
            double total02 = (int) Math.sqrt(a * b);


            System.out.println( String.format("%.1f", (double) total/2));
            System.out.println( String.format("%.1f\n", total02));
            System.out.println("더 큰 숫자: " +  Math.max(a,b));
            System.out.println("더 작은 숫자: " + Math.min(a,b));
        }
    }


