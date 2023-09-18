package com.introduction.unit5.Ex5;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(1996, 3, 8);
        Date date2 = new Date(1996, 8,3);
        System.out.println(date);
        System.out.println(date.equalTo(date2));
        System.out.println(date.isPrecedes(date2));
        System.out.println(date2.isLeap(date2));
        date.nextDay();

    }
}
