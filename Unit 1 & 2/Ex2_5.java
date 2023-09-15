package com.introduction.unit2;

public class Ex2_5 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Kim");
        StringBuffer answer = new StringBuffer();
        answer.append(sb.charAt(sb.length() - 1)).append(sb.charAt(0));
        System.out.println(answer.toString());
    }
}
