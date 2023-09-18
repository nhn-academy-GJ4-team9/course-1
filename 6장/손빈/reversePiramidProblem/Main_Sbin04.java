package sonbin2;

import java.util.Scanner;

public class Main_Sbin04 {
    // 숫자를 입력 받아 숫자피라미드를 역으로 출력하는 코드를 작성하세요.

    /**
     * 입력 3
     * 1 2 3 2 1
     *   1 2 1
     *     1
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n * 2 - i; j++) {
                if(i==j){
                for(int l =0 ; l < i - 1; l++){
                    System.out.print("  ");
                }}
                if (j > n) {
                    int k;
                    k = n * 2 - j;
                    System.out.print(k - m + " ");
                } else {
                    System.out.print(j - m + " ");
                }

            }

            System.out.println();
            m++;
        }

    }
}
