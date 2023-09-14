import java.util.Scanner;

/**
 * Exercise 04.3 Write a program that reads from the keyboard two integer number and prints on the screen
 */
public class Ex04_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x를 입력");
        int num1 = scanner.nextInt();

        System.out.println("y를 입력");
        int num2 = scanner.nextInt();

        // 산술 평균 계산
        double arithmeticMean = (double) (num1 + num2) / 2;

        // 기하 평균 계산
        double geometricMean = Math.sqrt(num1 * num2);

        System.out.println("산술 평균: " + arithmeticMean);
        System.out.println("기하 평균: " + geometricMean);
        System.out.println("큰 수: " + Math.max(arithmeticMean, geometricMean));
        System.out.println("작은 수: " + Math.min(arithmeticMean, geometricMean));
    }
}
