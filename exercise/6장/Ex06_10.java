package problem;


import java.util.Scanner;

public class Ex06_10 {

    public static int factorial(int n) {
        if (n<= 0){
            System.out.println("음수 불가");
        }
        if (n == 1) {
            return 1;
        }
        else if (n == 2) {
            System.out.print(n + " * 1 = ");

            return 2;
        }
        else {
            System.out.print(n + " * ");
            return factorial(n-1) *  n;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}
