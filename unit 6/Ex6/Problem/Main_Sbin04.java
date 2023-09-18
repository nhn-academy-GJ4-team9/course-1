package hyunjoong.org.example.unit6;

import java.util.Scanner;

public class Main_Sbin04 {
    // 숫자를 입력 받아 숫자피라미드를 역으로 출력하는 코드를 작성하세요.
    /** 입력 3
     *  1 2 3 2 1
     *    1 2 1
     *      1
     */
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("입력");
        int height = sc.nextInt();
        for( int row = height; row >= 0; row--){
            for(int i = 1; i<= height-row;i++){
                System.out.print(" ");
            }
            for (int i = 1; i< row -1 ; i++){
                System.out.print(i);
            }
            for( int i = row-1 ; i>= 1; i--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
