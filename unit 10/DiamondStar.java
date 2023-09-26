package hyeokjin10;
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
     *
     * @return
     */


    public static void drawDiamondStar(int input,int fin, int space) {//input 1, fin 5
        if(input == fin){
            drawOneLine(input);
        } else if( input % 2 == 1){
            drawBlank(space); // 1,3,5 >> 2, 1 ,0
            drawOneLine(input); // 위삼각
            drawDiamondStar(input+1,fin,space-1);
            drawBlank(space);
            drawOneLine(input); // 아래삼각

        } else {
            drawDiamondStar(input+1,fin,space);
        }

    }
    public static void drawOneLine(int input){
        if(input == 0){
            System.out.println();
        } else {
            System.out.print("*");
            drawOneLine(input-1);
        }
    }
    public static void drawBlank(int space){
        if(space == 0 ){
            System.out.print("");
        } else {
            System.out.print(" ");
            drawBlank(space-1);
        }
    }


    public static void main(String[] args) {
        drawDiamondStar(1,7,3);


    }


}