
///**
// * 재귀함수를 이용한 다이아몬드 별찍기
// * 주어진 수 n을 기준으로 다이아몬드 형태의 별(*)을 출력하세요.
// * 별찍기를 수행하는 함수는 재귀함수를 이용하여 구현되어야 합니다.
// *
// * 예제: 2인 경우
// *   *
// *  ***
// *   *
// *
// * 예제 : 3인 겨우
// *    *
// *   ***
// *  *****
// *   ***
// *    *
// */
//기
public class DiamondStar {

    public static String printDiamondStar(int n) {
        StringBuilder result = new StringBuilder();
        drawDiamondStar(n, 0, true, result);
        drawDiamondStar(n, n - 2, false, result);
        return result.toString();
    }

    private static void drawDiamondStar(int n, int level, boolean isUpper, StringBuilder result) {
        if (level < 0 || level >= n) return;

        int spaces = n - 1 - Math.abs(level);
        int stars = 2 * Math.abs(level) + 1;

        for (int i = 0; i < spaces; i++) result.append(" ");

        for (int i = 0; i < stars; i++) result.append("*");

        result.append("\n");

        drawDiamondStar(n, isUpper ? level + 1 : level - 1, isUpper, result);
    }
}
