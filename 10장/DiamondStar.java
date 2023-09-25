package org.example;
/**
 * 재귀함수를 이용한 다이아몬드 별찍기
 * 주어진 수 n을 기준으로 다이아몬드 형태의 별(*)을 출력하세요.
 * 별찍기를 수행하는 함수는 재귀함수를 이용하여 구현되어야 합니다.
 *
 * 예제: 2인 경우
 *   *
 *  ***
 *   *
 *
 * 예제 : 3인 겨우
 *    *
 *   ***
 *  *****
 *   ***
 *    *
 */

public class DiamondStar {
    /**
     * input, return 직접 재귀 구현
     */

    public static void diamondStar(int n){
        int total = 0;
        int width = 1;
        int count = 0;
        boolean flag = false;

        if(flag == false && n == total+1){
            width = (n-total)*2-1;
            count = (total*2)-width-2;
        }

        if(n == total*2){
            return;
        }
        if(n <= total){
            if(width != total){
                System.out.print(" ");
                diamondStar(n);
            }else{
                if(count!=(n*2)-1){
                    System.out.print("*");
                    diamondStar(n);
                }else{
                    System.out.println();
                    n++;
                    diamondStar(n);
                }
            }
        }else{
            if(width > 0){
                System.out.print(" ");
                diamondStar(n);
            }else{
                if(count>0){
                    System.out.print("*");
                    diamondStar(n);
                }else{
                    System.out.println();
                    n++;
                    width = n-total;
                    count = (total*2)-(width*2)-1;
                    diamondStar(n);
                }
            }
        }
    }
}