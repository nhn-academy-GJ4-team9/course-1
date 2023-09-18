package org.example;


/**
 * 주어진 문자열에서 괄호가 맞는지 확인하기.
 * 괄호에는 소괄호 (), 중괄호 {}, 대괄호 []이 포함된다.
 * <p>
 * 문자열을 입력받아 해당 문자열 내의 괄호가 올바르게 균형잡혀 있으면 true, 그렇지 않으면 false를 반환한다.
 * 함수명: isBalanced
 * 입력: String s
 * 출력: boolean
 * 예시:
 * <p>
 * "([])" → true
 * "([)]" → false
 * "{[()]}" → true
 * "{[}]" → false
 */


public class BracketChecker {
    public static boolean isBalanced(String s) {

        int result = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }


        sb = sb.reverse();

        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            switch (s.charAt(i)) {
                case '(':
                    if (s.charAt(j) != ')') {
                        result = 1;
                        break;
                    } else {
                        break;
                    }
                case '[':
                    if (s.charAt(j) != ']') {
                        result = 1;
                        break;
                    } else {
                        break;
                    }
                case '{':
                    if (s.charAt(j) != '}') {
                        result = 1;
                        break;
                    } else {
                        break;
                    }


            }

            if (result == 1) {
                break;
            }

        }

        if (result == 1) {
            return false;
        } else {
            return true;
        }

    }

    public static void main(String[] args) {
        System.out.println(isBalanced("([)]"));
    }
}
