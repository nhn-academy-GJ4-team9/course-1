package org.example;

public class Main_KMC01 {
    /**
     * 암호문 해독하기
     *
     * 26개의 대문자 알파벳으로 이루어진 단어를 3문자를 옮겨 겹치지 않게 나열하여 얻은 단어가 있다.
     * 암호화된 단어를 원래 단어로 돌려놓는 프로그램을 작성하시오.
     * 변환전 A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
     * 변환후 D E F G H I J K L M N O P Q R S T U V W X Y Z A B C
     *
     * [ 조건 ]
     * 입력되는 알파벳은 대문자로 한정
     * 숫자나 기타문자도 입력될 수 있음, 이러한 문자는 규칙을 적용 X
     * int를 char로 변경하는 메서드 등 사용 불가
     * 주어진 문자가 문자인지 숫자인지 판별하는 메서드 등 사용 불가
     * [ 예시 ]
     * 입력	->	출력
     * MRV		JOY
     * NRUHD	KOREA
     * @param input, 사용자의 입력
     * @return 주어진 규칙을 활용하여 해독한 원본 문자열 (String)
     */
    public static String solution(String input) {
        StringBuilder builder = new StringBuilder();

        // 이 곳에 소스 작성
        for (int i = 0; i < input.length(); i++) {
            int code = input.charAt(i);
            
            if (65 <= code && code <= 90) {
                if (code < 'D') {
                    builder.append((char) (code + 23));
                } else {
                    builder.append((char) (code - 3));
                }
            } else {

                builder.append((char) code);
            }
        }

        return builder.toString();
    }
}
