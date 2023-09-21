package minchan3;

import java.util.Arrays;

public class Main {
    private static final int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    public static void main(String[] args) {
        printTransposition(matrix);
    }

    /**
     * 상수로 주어진 행렬을 전치행렬의 형태로 출력하는 함수를 작성하시오.
     * <p>
     * 1 2 3
     * 4 5 6
     * 7 8 9
     * <p>
     * 1 4 7
     * 2 5 8
     * 3 6 9
     *
     * @param matrix, 상수로 주어진 3*3 행렬
     */
    public static void printTransposition(int[][] matrix) {
        int matrixSize = matrix.length;
        int[][] convertedMatrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                convertedMatrix[i][j] = matrix[j][i];
            }
        }
        System.out.println(Arrays.deepToString(convertedMatrix));
    }

}
