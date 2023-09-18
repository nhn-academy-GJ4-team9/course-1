package com.nhnacademy.algorithm;

/**
 * 특정 구간의 합 계산
 * 정수 배열과 두 개의 인덱스 i,j가 주어졌을때, 인덱스 i부터 j까지의 원소들의 합을 계산하는 알고리즘을
 * 작성 하세요. 단 조건문만 사용 가능합니다.(for,while.. 사용x)
 */

public class SumInRange {
    /**
     * arr {3, -2, 4, 7, -5, 9} , i = 1 , j = 4 가 주어졌을때 연산
     * [-2, 4, 7, -7] 를 모두 더한 4 라는 결과값이 출력된다.
     *
     * @param arr 연산을 할 배열
     * @param i   첫번째 인덱스값
     * @param j   두번째 인덱스값
     * @return 인덱스 길이만큼 배열에서 더한 값을 반환
     */
    public static int sumInRange(int[] arr, int i, int j) {
        if (i < j) {
            return 0;
        }
        return arr[i] + sumInRange(arr, i + 1, j);
    }

    /**
     * 테스트 예시 프로그램
     */
    public static void main(String[] args) {
        int[] arr = { 3, -2, 4, 7, -5, 9 };
        int i = 1, j = 4;
        int result = sumInRange(arr, i, j);
        System.out.println(result);
    }

}
