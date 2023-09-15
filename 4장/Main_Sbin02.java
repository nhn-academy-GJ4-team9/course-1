package org.example;

public class Main_Sbin02 {
    public static void main(String[] args) {
        // 두 집합을 나타내는 boolean 배열 생성 입니다.
        // 이 배열을 통해 교집합, 합집합, 차집합을 연산하세요.
        // 그리고 결과값을 출력하세요.
        // 교집합: [true, false, false, false]
        // 합집합: [true, true, true, false]
        // 차집합: [false, false, true, false]

        boolean[] a = {true, false, true, false};
        boolean[] b = {true, true, false, false};

        boolean[] interSection = interSection(a, b);
        for (boolean bool : interSection) {
            System.out.print(bool + " ");
        }
        System.out.println();

        boolean[] union = union(a, b);
        for (boolean bool : union) {
            System.out.print(bool + " ");
        }
        System.out.println();

        boolean[] diff = diff(a, b);
        for (boolean bool : diff) {
            System.out.print(bool + " ");
        }
        System.out.println();
    }

    public static boolean[] interSection(boolean[] a, boolean[] b) {
        boolean[] result = new boolean[a.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = a[i] && b[i];
        }

        return result;
    }

    public static boolean[] union(boolean[] a, boolean[] b) {
        boolean[] result = new boolean[a.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = a[i] || b[i];
        }

        return result;
    }

    public static boolean[] diff(boolean[] a, boolean[] b) {
        boolean[] result = new boolean[a.length];
        for (int i = 0; i < result.length; i++) {
            if (a[i] && b[i]) {
                result[i] = false;
            } else if (!a[i] && b[i]) {
                result[i] = false;
            } else {
                result[i] = a[i] && !b[i];
            }
        }

        return result;
    }
}
