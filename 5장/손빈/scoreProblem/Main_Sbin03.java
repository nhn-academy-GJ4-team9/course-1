package sonbin;

import java.util.Scanner;

public class Main_Sbin03 {
    public static void main(String[] args) {
        //if - else를 이용해서 점수를 입력받아 학점을 출력하는 프로그램을 작성하세요.
        //90점 이상A,80점 이상B,70점 이상C,60점 이상D,그 외에는 F입니다.

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        char result;
        if (score >= 90) {
            result = 'A';
        } else if (score >= 80) {
            result = 'B';
        }
        //...
        else {
            result = 'F';
        }
        System.out.println(result);
    }
}
