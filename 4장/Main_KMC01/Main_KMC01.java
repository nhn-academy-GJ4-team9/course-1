package org.example.Main_KMC01;

public class Main_KMC01 {
    /**
     * 문제: README 참조
     * 예시: README 참조
     *
     * 1. 매직 리터럴?(Magic Number) → 상수로 변경?
     * 2. toCharArray() 사용, 배열로 접근이 효율적?
     *  2-1. 문자를 표현, 사용하는 변수가 필요없음.
     *  2-2. for-each로 간결하게 수행할 수 있음.
     * 3. code의 타입을 int로 규정할 필요가 없음, 연산의 결과가 int형으로 출력
     *
     * @param input, 사용자의 입력
     * @return 주어진 규칙을 활용하여 해독한 원본 문자열 (String)
     */
    public static String solution(String input) {
        StringBuilder builder = new StringBuilder();

        // 이 곳에 소스 작성
        for (int i = 0; i < input.length(); i++) {
            int code = input.charAt(i);

            // 입력받은 String의 문자가 대문자인 경우, 처리
            if (65 <= code && code <= 90) {
                if (code < 'D') {
                    builder.append((char) (code + 23));
                } else {
                    builder.append((char) (code - 3));
                }
            } else {
                // 입력받은 String의 문자가
                builder.append((char) code);
            }
        }

        return builder.toString();
    }
}
