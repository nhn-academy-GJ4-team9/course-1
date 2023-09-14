import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Exercise 04.1 Write a method
 */
public class Ex04_01 {
    static final double LIRE_TO_EURO_RATE = 1936.27;

    /**
     * 리라를 유로로 변환하는 메서드
     *
     * @param x 리라의 갯수
     * @return 리라를 유로로 변경
     */
    public static double convertLireEuro(int x) {
        BigDecimal perEuroBigDecimal = new BigDecimal(LIRE_TO_EURO_RATE);
        BigDecimal xBigDecimal = new BigDecimal(x);
        BigDecimal xPerEuro = xBigDecimal.divide(perEuroBigDecimal, 4, RoundingMode.HALF_UP);
        double result = xPerEuro.doubleValue();
        return result;
    }

    /**
     * 리라 유로 환율 계산 출력.
     */
    public static void main(String[] args) {
        System.out.println(convertLireEuro(1000));
    }
}
