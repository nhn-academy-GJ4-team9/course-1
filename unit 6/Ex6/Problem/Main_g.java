package hyunjoong.org.example.unit6;

public class Main_g {


    /**
     * %과 / 를 안쓰고 반복문을 사용하여 나머지와 몫을 출력하는
     * 함수를 만드시오.
     */
    public static String solution(int input, int input2) {


        int result = 0;
        int rest = input;
        while(rest >= input2){
            rest -= input2;
            result++;
        }


        return result + " " + rest;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 4));

    }
}
