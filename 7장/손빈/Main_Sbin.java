package com.nhnacademy.problems.chapter7.손빈;

import java.util.ArrayList;
import java.util.Arrays;

public class Main_Sbin {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 2, 4, 5, 4, 6, 7, 4, 8, 9, 3, 10 };
        // ArrayList 를 활용해서 numbers에 있는 숫자들의 중복된 배열을 제거하고 출력하세요.
        System.out.println(Arrays.toString(solution(numbers)));
    }

    public static Integer[] solution(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (list.contains(array[i])) {
                continue;
            } else {
                list.add(array[i]);
            }
        }

        return list.toArray(new Integer[list.size()]);
    }
}
