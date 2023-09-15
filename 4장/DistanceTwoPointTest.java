package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceTwoPointTest {
    /**
     * (0.0) 부터 (1,1) 까지의 거리를 테스트.
     * 결과값이 1.4142135623730951 이며 오차를 허용하기 때문에 BigDecimal(X)
     */
    @Test
    public void testCalculateDistance() {
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 1.0;
        double y2 = 1.0;

        double expectedDistance = 1.4142135623730951;
        double actualDistance = DistanceTwoPoint.calculateDistance(x1, y1, x2, y2);

        assertEquals(expectedDistance, actualDistance, 1e-9);
    }

    /**
     * 음수 값 거리 테스트
     */
    @Test
    public void testCalculateDistance_case2() {
        double x1 = -2.0;
        double y1 = 3.0;
        double x2 = 2.0;
        double y2 = -3.0;

        double expectedDistance = 7.211102550927978;  // 직접 계산된 거리 값
        double actualDistance = DistanceTwoPoint.calculateDistance(x1, y1, x2, y2);

        assertEquals(expectedDistance, actualDistance, 1e-9);
    }
}
