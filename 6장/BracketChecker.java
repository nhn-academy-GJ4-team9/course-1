package org.example;

public class BracketChecker {

    public static void main(String[] args) {
        System.out.println(isBalanced(""));
    }

    public static boolean isBalanced(String s) {

        if (s.isEmpty()) {
            return true;
        }

        char[] arr = s.toCharArray();
        if (arr.length % 2 != 0) {
            return false;
        }

        for (int begin = 0, end = arr.length - 1; begin < arr.length / 2; begin++, end--) {
            char[] begins = { '(', '{', '[' };
            char[] ends = { ')', '}', ']' };

            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[begin] == begins[i] && arr[end] != ends[i]) {
                    return false;
                }
            }
        }

        return true;
    }
}