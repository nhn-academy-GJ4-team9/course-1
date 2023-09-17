package com.nhnacademy.exercise.chapter7;

public class Main {
    private static final int[][] matrix = {
            { 1, 0, 0 },
            { 4, 5, 0 },
            { 7, 8, 9 }
    };

    public static void main(String[] args) {
        System.out.println(lowerTriangular(matrix));

        Apartment apartment = new Apartment(18, "광주광역시 동구 필문대로 309");

        apartment.addResident("1");
        apartment.addResident("2");
        apartment.addResident("3");
        apartment.addResident("4");
        apartment.addResident("5");

        apartment.remove(3);

        System.out.println(apartment);
    }

    public static boolean lowerTriangular(int[][] m) {
        boolean isLowerTriangular = true;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i < j && m[i][j] != 0) {
                    isLowerTriangular = false;
                    break;
                }
            }
        }

        return isLowerTriangular;
    }
}
