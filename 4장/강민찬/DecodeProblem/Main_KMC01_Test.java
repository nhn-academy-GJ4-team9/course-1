import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Main_KMC01_Test {

    private static Stream<Arguments> testCase() {
        return Stream.of(
                Arguments.of("LQWURGXFWLRQ WR SURJUDPPLQJ MDYD", "INTRODUCTION TO PROGRAMMING JAVA"),
                Arguments.of("FKRVXQ" , "CHOSUN"),
                Arguments.of("QKQDFDGHPB_JM04", "NHNACADEMY_GJ04")
        );
    }

    @ParameterizedTest
    @MethodSource("testCase")
    @DisplayName("solution() 정상적 실행")
    void getSolutionTest(String input, String result) {
        String expected = Main_KMC01.solution(input);
        Assertions.assertEquals(expected, result);
    }

}