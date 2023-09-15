package org.example;

public class Main {
    private static final String[] TEST_CASES = {
            "He11oWor1d",
            "Program29b8UYP"

    };

    private static final String[] TEST_CASES2 = {
            "lloWorl",
            "merS123"

    };

    private static final int[] TEST_CASES3 = {
            2,
            7

    };

    private static final String[] TEST_CASES_RESULT = {
            "HelloWorld",
            "ProgrammerS123"

    };

    public static void main(String[] args) {
        for (int i = 0; i < TEST_CASES.length; i++) {
            System.out.println("Test Case " + (i + 1) + " = "
                    + test(TEST_CASES[i], TEST_CASES2[i], TEST_CASES3[i], TEST_CASES_RESULT[i]));
        }

        System.out.printf("정답률 = %.3f%%", (correct / TEST_CASES.length * 100));
    }

    private static double correct = 0;

    private static boolean test(String input, String input2, int input3, String result) {
        if (solution(input, input2, input3).equals(result)) {
            correct++;
            return true;
        }

        return false;
    }

    // 입출력 예
    // my: "He11oWor1d"
    // overwrite: "lloWorl"
    // s: 2
    // result: "HelloWorld"

    // my 에서 인덱스 2부터 overwrite의 길이만큼에 해당하는 부분은 "11oWord1" 이고 이를 "lloWorl"로 바꾼
    // "HelloWorld"를 return

    public static String solution(String my, String overwrite, int s) {
        String answer = "";
        answer += my.substring(0, s);
        answer += overwrite;
        answer += my.substring(s+overwrite.length(),my.length());
        System.out.println(answer);


        return answer;
    }

}
