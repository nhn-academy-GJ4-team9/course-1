package gichang2;

public class Main_g {


/**
      %과 / 를 안쓰고 반복문을 사용하여 나머지와 몫을 출력하는
      함수를 만드시오.
 */

    public static String solution(int input, int input2) {
        int result = 0;
        int multi = input2;

        while(input >= input2){
            result++;
            input -= multi;
        }
        int rest = input;

        return result + " " + rest;
    }

    public static void main(String[] args) {
        System.out.println(solution(10,3));
    }
}
