package org.example;

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
        // 여기에 코드를 작성하세요.
        int temp;
        int odd = 0;
        
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                temp = array[i];
                array[i] = array[odd];
                array[odd] = temp;
                odd++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 4, 5, 8, 9, 2, 3 };

        separateOddEven(array);
        System.out.println(Arrays.toString(array));
    }
}