package org.example;

/**
 * 재귀함수를 이용한 다이아몬드 별찍기
 * 주어진 수 n을 기준으로 다이아몬드 형태의 별(*)을 출력하세요.
 * 별찍기를 수행하는 함수는 재귀함수를 이용하여 구현되어야 합니다.
 * <p>
 * 예제: 2인 경우
 * *
 * ***
 * *
 * <p>
 * 예제 : 3인 겨우
 * *
 * ***
 * *****
 * ***
 * *
 */
public class DiamondStar {
    static int blank = 1;

    /**
     * input, return 직접 재귀 구현
     *
     * @return
     */
    public static String drawDiamondStar(int input, int count, int plus, String str, int r) {
        if (count == (input * 2) - 2) {
            str += (" ").repeat(input - 1);
            str += ("*\n");
            return str.toString();
        } else if (count == 0) {
            str += (" ").repeat(input - 1);
            str += ("*\n");
            count = count + 1;
            return drawDiamondStar(input, count, plus, str, r);
        } else if (count == input - 1) {
            str += "*".repeat((count * 2) + 1);
            str += "\n";
            count = count + 1;
            plus = 1;
            return drawDiamondStar(input, count, plus, str, r);
        } else if (plus == 1) {
            str += (" ").repeat(blank);
            blank++;
            r = r - 2;
            str += "*".repeat(r);
            str += "\n";
            count = count + 1;
            plus = 1;
            return drawDiamondStar(input, count, plus, str, r);
        } else if (plus == 0) {
            str += (" ").repeat(input - count - 1);
            str += "*".repeat((count * 2) + 1);
            str += "\n";
            count = count + 1;
            return drawDiamondStar(input, count, plus, str, r);

        }

        return null;
    }

    public static void main(String[] args) {
        int input = 3;
        int count = 0;
        int plus = 0;
        int r = input * 2 - 1;
        String str = "";
        System.out.println(DiamondStar.drawDiamondStar(input, count, plus, str, r));
    }
}
