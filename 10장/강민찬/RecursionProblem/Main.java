package minchan10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("정수를 입력하시오: ");
            int number = scanner.nextInt();
            preCondition(number);
            solution(number);
        } catch (InputMismatchException e) {
            System.out.println("0보다 큰 정수를 넣어주세요.");
        }
    }

    /**
     * 문제: 입력된 정수만큼 Recursion을 실행하여 해당 출력을 구현하시오.
     * <p>
     * 조건:
     * Recursion을 사용할 것!
     * for, while문 사용금지!
     * Array 등을 비롯한 자료구조 사용금지!
     * <p>
     * 출력:
     * 정수를 입력하시오: 2
     * Activated [ 2 ]
     * Activated [ 1 ]
     * Finished [ 0 ]
     * Re-activated [ 1 ]
     * Finished [ 1 ]
     * Re-activated [ 2 ]
     * Finished [ 2 ]
     *
     * @param number, Recursion을 반복하는 횟수 (int 타입)
     */
    public static void solution(int number) {
        int lastNumber = number;
        int finish = 0;

        recursion(number, finish, lastNumber);
    }

    public static int recursion (int number, int finish, int lastNumber) {
        if (finish == number) {
            System.out.println("Finished [ " + finish + " ] ");
            if (finish == lastNumber) {
                return 0;
            }
            System.out.println("Re-activated [ " + (number + 1) + " ] ");
            return recursion(number+1, finish+1, lastNumber);
        } else {
            System.out.println("Activated [" + number + " ] ");
            return recursion(number - 1, finish, lastNumber);

        }
    }
    private static void preCondition(int number) {
        if (number < 0) {
            throw new InputMismatchException("입력의 크기는 0보다 작을 수 없습니다.");
        }
    }
}
