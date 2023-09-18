package hyunjoong.org.example;

import java.util.*;
import java.util.stream.Collectors;

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

        for(String i: inputs){
            if(!list.contains(i)){
                list.add(i);
            }
        }
        // TODO 중복되는 문자열을 제거




        // TODO Comparator<String> 사용, 정렬기준 정하기
        Collections.sort(list, (s1, s2) -> s1.length() == s2.length() ? s1.compareTo(s2) : s1.length() - s2.length());

        return list.toArray(new String[list.size()]);
    }



}
