package org.example;

public class MyString {

    private String string;

    public MyString(String string) {
        this.string = string;
    }

    public String myConcat(String str) {
        // 1. 문자열 연결 구현
        this.string=this.string.concat(str);
        return this.string;
    }

    public int myLength(String str) {
        // 2. 문자열 길이 구현

        return str.length();
    }

    public String myToUpperCase(String str){
        // 3. 대문자 반환 구현
        return str.toUpperCase();
    }

    public String myToLowerCase(String str){
        // 4. 소문자 반환 구현
        return str.toLowerCase();
    }

}