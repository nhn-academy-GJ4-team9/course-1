/* 
 * 1. solution의 내용을 채우세요.
 * 2. 해당 출력을 정답으로 만드세요. (미리 만들어진 코드는 수정 불가!)
 */

public class Problem02 {

    private static final String[] TEST_CASES = {
            "ars nova",
            "ludwig van beethoven",
            "sergei vasilievich rachmaninoff"
    };

    private static final String[] TEST_CASES_RESULT = {
            "AN",
            "LVB",
            "SVR"
    };

    private static double correct = 0;

    private static boolean test(String input, String result) {
        if (solution(input).equals(result)) {
            correct++;
            return true;
        }

        return false;
    }

    public static String solution(String input) {
        StringBuilder builder = new StringBuilder();
        String[] inputs = input.split(" ");

        for (String s : inputs) {
            // 내용을 채우세요.
            builder.append(s.substring(0,1).toUpperCase());
           
        }

        return builder.toString();
    }

    public static void main(String[] args) {

        // 1번 문제
        for (int i = 0; i < TEST_CASES.length; i++) {
            System.out.println("Test Case " + (i + 1) + " = " + test(TEST_CASES[i], TEST_CASES_RESULT[i]));
        }

        System.out.printf("정답률 = %.3f%%", (correct / TEST_CASES.length * 100));
        System.out.println();

        // 2번 문제
        StringBuilder s = new StringBuilder("test");
        StringBuilder t;
        t = s;
        s.append("!");

        if (!t.toString().equals(s.toString())) {
            System.out.println("정답");
        } else {
            System.out.println("오답");
        }

    }
}
