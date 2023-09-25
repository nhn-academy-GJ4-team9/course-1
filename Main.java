package org.example;


import java.util.Stack;

public class Main {
    static long recursion =0;
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {
        System.out.println(ackermann(3,2));
    }
    public static long ackermann(long m , long n) {


        if(m==0)
            return n+1;
        else if(n==0)
            return ackermann(m-1,1);
        else
            return ackermann(m-1, ackermann(m,n-1));
    }

    public static int ackermann(int a, int b){
        while(true){
            recursion++;
            if(a==0){
                b++;
                if(stack.size() ==0){
                    return b;
                } else {
                    a = stack.pop();
                }
            } else if (b == 0) {
                a--;
                b=1;
            } else {
                stack.push(a-1);
                b--;
            }
        }
    }
}