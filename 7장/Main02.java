package org.example;
import java.util.ArrayList;
import java.util.List;
// 문제 : 4x4 배열 내의 숫자들중 target 숫자와 일치 하는 값을 가진 position 배열을 출력하시오
public class Main02 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 2 },
                { 4, 2, 2, 1 },
                { 2, 5, 6, 2 },
                { 7, 2, 2, 8 }
        };
        int target = 2;
        List<int[]> occurrences = findAllOccurrences(matrix, target);
        for (int[] occurrence : occurrences)
            System.out.println("Target " + target + " found at position: [" + occurrence[0] + ", " + occurrence[1] + "]");
    }

    private static List<int[]> findAllOccurrences(int[][] matrix, int target) {
        List<int[]> occurrences = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    int[] occurrence = {i, j};
                    occurrences.add(occurrence);
                }
            }
        }
        return occurrences;
    }
}
