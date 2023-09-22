package org.example;

public class Main_g  extends  Exception{


    public Main_g(String message){
        super(message);
    }
    public static void main(String[] args) {

        try{
            test(-1);
        }catch (Main_g e){
            System.out.println(e.getMessage());
        }


    }

    /**
     * input값에 음수값이 들어가면 Main_g 예외가 발생하도록
     * test 함수를 수정
     * @param input
     * @throws Main_g
     */
    public static void test(int input) throws Main_g {



    }

}
