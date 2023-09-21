package sonbin3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Main_Sbin {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5, 4, 6, 7, 4, 8, 9, 3, 10};
        // ArrayList 를 활용해서 numbers에 있는 숫자들의 중복된 배열을 제거하고 출력하세요.
        ArrayList<Integer> newNumbers = new ArrayList<>();
        for(int number : numbers){
            if(!newNumbers.contains(number)) {
                newNumbers.add(number);
            }
        }
        System.out.println(newNumbers);
    }
}
