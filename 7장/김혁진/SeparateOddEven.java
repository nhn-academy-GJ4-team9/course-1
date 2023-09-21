package com.nhnacademy.problems.chapter7.김혁진;

import java.util.Arrays;

/**
 * 주어진 정수 배열에서 모든 홀수를 왼쪽에, 모든 짝수를 오른쪽에 위치시키는 메서드를 작성하세요.
 * 위차가 바뀐 원소들의 순서는 필요 없습니다.
 * <p>
 * 예시:
 * int[] array = {1, 4, 5, 8, 9, 2, 3};
 * separateOddEven(array);
 * // array의 결과는 {1, 5, 9, 3, 8, 2, 4} 또는 다르게 바뀐 배열
 */
public class SeparateOddEven {
    public static void separateOddEven(int[] array) {
        int[] tmps = new int[array.length];
        System.arraycopy(array, 0, tmps, 0, array.length);

        int begin = 0;
        int end = tmps.length - 1;
        int index = 0;
        while (index <= tmps.length - 1) {
            if (tmps[index] % 2 != 0) {
                array[begin++] = tmps[index++];
            } else {
                array[end--] = tmps[index++];
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 4, 5, 8, 9, 2, 3 };
        separateOddEven(array);
        System.out.println(Arrays.toString(array));
    }
}
