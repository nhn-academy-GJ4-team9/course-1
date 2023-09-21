package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_Sbin {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5, 4, 6, 7, 4, 8, 9, 3, 10};
        List<Integer> n = new ArrayList<>();

        for (int number : numbers) {
            if (!n.contains(number)) {
                n.add(number);
            }
        }

        int[] result = new int[n.size()];
        for (int i = 0; i < n.size(); i++) {
            result[i] = n.get(i);
        }

        System.out.println("중복 제거된 배열: " + Arrays.toString(result));
    }
}
