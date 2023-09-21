package org.example;

import java.util.Arrays;

public class Main_g {


    /**
     * 정수 1<=n<=100이 매개변수로 주어질때, n x n 크기의 배열을 return하는 함수 작성
     * <p>
     * n=3 ------> answer={{1,0,0},{0,1,0},{0,0,1}}
     * n=5 ------> answer=[[1, 0, 0, 0, 0], [0, 1, 0, 0, 0], [0, 0, 1, 0, 0], [0, 0, 0, 1, 0], [0, 0, 0, 0, 1]]
     * n=1 ------> answer=[[1]]
     *
     * @param n 2차원배열에 들어가는 input값
     * @return int형 2차원배열
     */
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                if (i == j){
                    answer[i][j] = 1;
                }else {
                    answer[i][j] = 0;
                }
            }
        }
  
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString((solution(3))));
    }
}