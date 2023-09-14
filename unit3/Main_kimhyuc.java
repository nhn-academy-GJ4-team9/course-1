package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final int[] TEST_CASES = {
            1,2,2
    };

    private static final int[] TEST_CASES2 = {
            1,2,7
    };

    private static final int[] TEST_CASES3 = {
            1,2,5
    };

    private static final int[] TEST_CASES_RESULT = {
            7,14,32
    };

    public static void main(String[] args) {
        for (int i = 0; i < TEST_CASES.length; i++) {
            System.out.println("Test Case " + (i + 1) + " = "
                    + test(TEST_CASES[i], TEST_CASES2[i],TEST_CASES3[i], TEST_CASES_RESULT[i]));
        }

        System.out.printf("정답률 = %.3f%%", (correct / TEST_CASES.length * 100));
    }

    private static double correct = 0;

    private static boolean test(int input, int input2, int input3,int result) {
        if (solution(input, input2,input3) == result) {
            correct++;
            return true;
        }

        return false;
    }



    // add 메서드를 작성하세요
    // 입력 : 1,1,1   ->  2 + 2 + 2 -> 출력 : 7
    // 입력 : 2,2,2   ->  4 + 4 + 6 -> 출력 : 14
    // 입력 : 2,7,5   ->  9 + 9 + 14  출력 : 32

    public static int solution(int a, int b, int c) {
        int answer = add(a,b) + add(add(a,b))+ add(a,b,c);
        return answer;
    }
    public static int add(int a){
        return a;
    }

    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b,int c){
        return a+b+c;
    }

}
