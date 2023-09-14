/* 
 * 1. solution의 내용을 채우세요.
 * 2. 해당 출력을 정답으로 만드세요. (미리 만들어진 코드는 수정 불가!)
 */

/**
 * 1번 문제 각 단어에 첫번째 글자를 대문자로 합쳐서 반환하기
 *
 * 2번 문제 두 객체를 다르게 만들기
 */
public class Problem {

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

    /**
     * 1번 문제 구현 부분
     * @param input 문자열
     * @return 각 문자열에 맨 앞 글자를 대문자로 합쳐서 반환
     */
    public static String solution(String input) {
        StringBuilder builder = new StringBuilder();
        String[] inputs = input.split(" ");

        for (String s : inputs) {
            char firstChar = s.charAt(0);
            builder.append(Character.toUpperCase(firstChar));
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
        s = new StringBuilder();
        s.append("!");

        if (!t.toString().equals(s.toString())) {
            System.out.println("정답");
        } else {
            System.out.println("오답");
        }

    }
}
