package com.nhnacademy.problems.chapter9.박기창;

public class Main extends Exception {

    public Main(String message) {
        super(message);
    }

    public static void main(String[] args) {

        try {
            test(-1);
        } catch (Main e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * input값에 음수값이 들어가면 Main_g 예외가 발생하도록
     * test 함수를 수정
     * 
     * @param input
     * @throws Main_g
     */
    public static void test(int input) throws Main {
        if (input < 0) {
            throw new Main("음수가 들어 갈 수 없습니다.");
        }
    }

}
