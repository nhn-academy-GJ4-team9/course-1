package org.example;

public class Exercises10_3 {

    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        int ackerMann = ackermann(m,n);
        System.out.println(ackermann(3,4));

    }
    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        }else if (n == 0){
            return ackermann(m - 1, 1);
        }
        return ackermann(n - 1, ackermann(m,n-1));
    }
}
