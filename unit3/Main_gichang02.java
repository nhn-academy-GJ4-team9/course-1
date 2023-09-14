package org.example;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * 주어진 문자열에 "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후
 * 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 
 */
public class Main_gichang {
    public static void main(String[] args) {
        System.out.println(solution("dxccxbbbxxaaaa"));
    }

    public static String[] solution(String input) {
        String[] answer = {};
        String[] split = input.split("x");
        System.out.println(Arrays.toString(split));
        ArrayList<String> al = new ArrayList<>();
        int x = 0;
        for (int i = 0; i < split.length; i++) {

            al.add(split[i]);
            x++;
            if (split[i].equals("")) {
                al.remove(x - 1);
                x--;
            }
        }
        answer = new String[al.size()];
        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}