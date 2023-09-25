package hyeokjin10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiamondStarTest {

    /**
     * 테스트 코드 input 값 직접 작성
     */
    @Test
    void testPrintDiamondStar() {
        String test1 = "  *\n" +
                "***\n" +
                "  *\n";
        assertEquals(test1, DiamondStar.drawDiamondStar());

        String test2 = "   *\n" +
                "  ***\n" +
                "*****\n" +
                "  ***\n" +
                "   *\n";
        assertEquals(test2, DiamondStar.drawDiamondStar());
    }
}
