package org.example;

import java.util.Arrays;

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

        boolean[] c=new boolean[4];
        boolean[] d=new boolean[4];
        boolean[] e=new boolean[4];


        for (int i=0;i<c.length;i++){
            c[i]=a[i]&&b[i];
        }

        for (int i=0;i<c.length;i++){
            d[i]=a[i]||b[i];
        }

        for (int i=0;i<c.length;i++){
            e[i]=!b[i];
        }

        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));

    }
}
