package org.example;

public class Main_g {


    /**
     * 거듭제곱을 구현하는 함수를 만드시오
     * 단, 재귀로
     * math 라이브러리 사용 x
     * pow 함수만 이용
     * <p>
     * x^y
     *
     * @param x
     * @param y
     * @return
     */
    public static int pow(int x, int y) {
      
    }

    public static int s(String s, char c) {
        return solution(s, c, 0, 0);
    }

    /**
     * 재귀을 이용해 함수구현
     * 주어진 문자열과 문자을 통해 문자열중에서 가장 긴 연속된 문자의 길이를 출력
     * Hello,l ---------->2
     * Hellloll,l-------->3
     *
     * @param s     문자열
     * @param c     문자
     * @param index 문자열 인덱스 위치
     * @param count 같은 문자 나온 횟수
     * @return
     */

    public static int solution(String s, char c, int index, int count) {
       
    }


    public static void main(String[] args) {

        System.out.println(pow(3, 8));  //   6561
        
        String s = "hellolll";
        char c = 'l';
        System.out.println(s(s, c));           //3
    }


}
