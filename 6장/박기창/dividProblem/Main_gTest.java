package gichang2;


import static gichang2.Main_g.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Main_gTest {
    @Test
    @DisplayName("몫, 나머지 값 테스트1")
    void dividtest01() {
        Assertions.assertEquals("3 1", solution(10, 3));
    }

    @Test
    @DisplayName("몫, 나머지 값 테스트2")
    void dividtest02() {
        Assertions.assertEquals("36 2", solution(110, 3));
    }

    @Test
    @DisplayName("몫, 나머지 값 테스트3")
    void dividtest03() {
        Assertions.assertEquals("0 10", solution(10, 11));
    }

}
