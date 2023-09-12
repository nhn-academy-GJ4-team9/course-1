package org.example;

public class problem01 {
    public static void main(String[] args) {
        // 이름을 나타내는 String 객체 생성

        String name = new String("1234");

        // 첫 번째 문자 출력
        System.out.println(name.substring(0,1));

        // 마지막 문자 출력

        System.out.println(name.substring(name.length()-1,name.length()));
    }
}