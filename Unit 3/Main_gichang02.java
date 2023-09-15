package org.example;

import java.util.Arrays;

/**
 * 주어진 문자열에 "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후
 * 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 
 */
public class Main_gichang {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("dxccxbbbxxaaaa")));
    }

    public static String[] solution(String input) {
        String result = input.replaceAll("x", " ");
        result  = result.replaceAll("\\s+", " ");
        System.out.println(result);
        System.out.println(result.length());
        String[] answer = result.split(" ");
        

        Arrays.sort(answer);
        return answer;
    }
}