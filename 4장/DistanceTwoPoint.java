package org.example;

/**
 * 두 점 사이의 거리를 Math 함수를 이용해서 구하기.
 */
public class DistanceTwoPoint {
    /**
     *  (x1,y1) (x2,y2) 가 주어졌을때 주 점 사이의 거리를 구하라
     * @param x1 의 좌표
     * @param y1 의 좌표
     * @param x2 의 좌표
     * @param y2 의 좌표
     * @return 두 점사이의 거리를 double 로 리턴 오차 허용
     */
        public static double calculateDistance(double x1, double y1, double x2, double y2) {
        // 코드 구현부
            return Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));
        }

}
