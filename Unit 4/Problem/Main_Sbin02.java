package hyunjoong.org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

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




        System.out.println("교집합 : " + Arrays.toString(inter(a, b)));
        System.out.println("합집합 : " + Arrays.toString(union(a, b)));
        System.out.println("차집합 : " + Arrays.toString(differ(a,b)));
    }
    public static boolean[] inter(boolean[] a, boolean[] b){

        boolean[] section = new boolean[4];
        for (int i = 0 ; i< a.length; i++){

                if (a[i] && b[i] ){
                    section[i] = true;

                } else {
                    section[i]= false;
                }


        }
      return section;
    }
    public static boolean[] union(boolean[] a, boolean[] b){
        boolean[] section = new boolean[4];
        for (int i = 0 ; i< a.length; i++){

                if ( a[i] || b[i]){
                    section[i] = true;
                } else {
                    section[i] = false;
                }

        }
        return section;
    }
    public static boolean[] differ(boolean[] a, boolean[] b){
        boolean[] section = new boolean[4];
        for (int i = 0 ; i< a.length; i++){

                if ( !(a[i] || b[i])){
                    section[i] = true;
                } else {
                    section[i] = false;
                }

        }
        return section;
    }




}
