package org.example;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        try {

            int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        }

        System.out.println(sum);
    }
}


//try문에서 벗어나게 되면 지역변수인 sum이 삭제됨으로 밖으로 꺼내면 해결됨
