package org.example;

import java.util.*;

public class Main {

    private static final String[] TEST_CASES = {
            "rermgorpsam"
    };

    private static final int[][] TEST_CASES2 = {
            { 2,3},
            { 0,7},
            { 5,9 },
            { 6,10}
    };

    private static final String[] TEST_CASES_RESULT = {
            "programmers"
    };

    public static void main(String[] args) {

        System.out.println("Test Case " + 1 + " = " + test(TEST_CASES[0],TEST_CASES2, TEST_CASES_RESULT[0]));


        System.out.printf("정답률 = %.3f%%", (correct / TEST_CASES.length * 100));
    }

    private static double correct = 0;

    private static boolean test(String my, int[][] queries,String result) {
        if (solution(my,queries).equals(result)) {
            correct++;
            return true;
        }

        return false;
    }

    /*
     * 문자열 my과 이차원 정수 배열 queries가 매개변수로 주어집니다.
     * queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
     * my에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
     */

     /*
      *     my	                    queries                    result
        "rermgorpsam"	[[2, 3], [0, 7], [5, 9], [6, 10]]	"programmers"
      */

      /*
       * queries	   my
                  "rermgorpsam"
         [2, 3]	  "remrgorpsam"
         [0, 7]	  "progrmersam"
         [5, 9]	  "prograsremm"
         [6, 10]  "programmers"


         따라서 "programmers"를 return 합니다.
       */


    public static String solution(String my,int[][] queries) {
        String answer = my;

        for (int[] a:queries) {
            int x=a[0];
            int y=a[1];
            StringBuffer s = new StringBuffer();
            for (int i = y; i >=x ; i--) {
                s.append(answer.charAt(i));
            }
            answer=answer.substring(0,x)+s+answer.substring(y+1);
        }


        return answer;
    }
}