package hyeokjin3;

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
        if (array == null || array.length == 0) {
            return;
        }

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            while (left < right && array[left] % 2 != 0) {
                left++;
            }
            while (left < right && array[right] % 2 == 0) {
                right--;
            }
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[] array = {1,4,5,8,9,2,3};
        separateOddEven(array);
        System.out.println(Arrays.toString(array));
    }
}