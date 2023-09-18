package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    private Main() {

    }

    /**
     * 정렬과 중복제거가 되지 않은 String[] 배열을 중복 제거와
     *
     * @param inputs, 중복 제거와 정렬이 되어있지 않은 문자열의 배열(String[]) → Stream 때문에 가변인자 사용
     * @return 중복 제거와, README 파일의 조건대로 정렬이 완료된 문자열 배열(String[])
     */
    public static String[] solution(String[] inputs) {
        ArrayList<String> list = new ArrayList<>();

        // TODO 중복되는 문자열을 제거

        // TODO Comparator<String> 사용, 정렬기준 정하기
        for (int i = 0; i < inputs.length; i++) {
            if (list.contains(inputs[i])) {
                continue;
            }
            list.add(inputs[i]);
        }

        Collections.sort(list, (e1, e2) -> e1.length() == e2.length() ? e1.compareTo(e2) : e1.length() - e2.length());

        return list.toArray(new String[list.size()]);
    }
}