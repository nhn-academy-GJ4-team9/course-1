package minchan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        for (int i = 0; i < inputs.length; i++) {
            if (!list.contains(inputs[i])) {
                list.add(inputs[i]);
            }
        }
        // TODO Comparator<String> 사용, 정렬기준 정하기
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if (o1.length() != o2.length()) {
                        return o1.length() - o2.length();
                    } else {
                        return o1.compareTo(o2);
                    }
                }
            }

            );
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i]= list.get(i);
        }
        return result;

    }

}