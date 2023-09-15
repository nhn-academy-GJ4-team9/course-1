package com.introduction.unit4.Ex4;

public class Ex4_8 {
    public static void method(int a, Account b) {
        a *= 2;
        b.val *= 2;
    }

    public static void main(String[] args) {
        int c = 100;
        Account r = new Account(100);
        method(c, r);
        System.out.println(c + " " + r.val);
    }
    /*
     *  method를 통해 c의 밸류를 복사한 값이 a*=2;를 실행되고 다른 메모리에 할당되므로 main단의 c를 출력하는 결과는 변하지않음.
     *  r.val는 r 인스턴스의 주소에서 값을 뽑아오므로 100 * 2 가 실행.
     */

}
