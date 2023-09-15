package com.introduction.unit4.Ex4;

public class Account {
    public int val;

    public Account(int x) {
        val = x;
    }

    public static void increment(int p) {
        p = p + 1;

    }

    public static void main(String[] args) {
        Account r1, r2;
        r1 = new Account(100);
        r2 = r1;
        r2.val = 234;
        System.out.println(r1.val);
        int c1, c2;
        c1 = 100;
        c2 = c1;
        c2 = 234;
        System.out.println(c1);

        int a = 10;
        increment(a);
        System.out.println(a);
    }

}
