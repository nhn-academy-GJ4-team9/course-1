package hyunjoong.org.example;

import java.util.Arrays;

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

        char res = 0;
        for (int i = 0; i< input.length(); i++){
             res = input.charAt(i);
             if(res >=65 && res <=67 ){
                builder.append((char)( res+23));
                continue;
            }
            if(res >= 65 && res <=90){
                builder.append((char)(res -3) );

            } else if( !(res >= 65 && res <=90)){
                builder.append(res);
            }
        }


        return builder.toString();
    }

    public static void main(String[] args) {
        solution("LQWURGXFWLRQ WR SURJUDPPLQJ MDYD");
    }
}
