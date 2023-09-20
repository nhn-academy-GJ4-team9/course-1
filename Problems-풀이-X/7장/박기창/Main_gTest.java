package org.example;

import static org.example.Main_g.solution;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Main_gTest {
    @Test
    @DisplayName("첫번쨰 테스트")
    void firstTest() {
        int[][] answer = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        Assertions.assertTrue(Arrays.deepEquals(solution(3), answer));
    }

    @Test
    @DisplayName("두번쨰 테스트")
    void firstTest2() {
        int[][] answer = {{1, 0, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 0}, {0, 0, 0, 0, 1}};
        Assertions.assertTrue(Arrays.deepEquals(solution(5), answer));
    }

    @Test
    @DisplayName("세번쨰 테스트")
    void firstTest3() {
        int[][] answer = {{1}};
        Assertions.assertTrue(Arrays.deepEquals(solution(1), answer));
    }

}
