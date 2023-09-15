package org.example;

public class Main_KMC01 {
    /**
     * 문제: README 참조
     * 예시: README 참조
     *
     * @param input, 사용자의 입력
     * @return 주어진 규칙을 활용하여 해독한 원본 문자열 (String)
     */
    public static String solution(String input) {
        StringBuilder builder = new StringBuilder();



        for (char c:input.toCharArray()) {
            if (!(c>=65 && c<=90)) {
                builder.append((char)(c));
            } else if (c<=67 && c>=65) {
                builder.append((char)(c+23));
            } else{
                builder.append((char)(c-3));
            }

        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("ABC"));
    }


}