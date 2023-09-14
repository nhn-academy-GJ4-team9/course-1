package org.example;


    public class MyString {

        private String string;

        public MyString(String string) {
            this.string = string;
        }
        //문자열 연결
        public String myConcat(String str) {
            return this.string + str;
        }
        // 문자열 길이
        public int myLength(String str) {
            return str.length();
        }
        // 대문자 변환
        public String myToUpperCase(String str){
            return str.toUpperCase();
        }

        // 소문자 변환
        public String myToLowerCase(String str){
            return str.toLowerCase();
        }

    }

