package gichang4;

import static gichang4.Main_g.solution;

import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Main_gTest {
    @Test
    @DisplayName("합계 테스트")
    void test() throws IOException {
        Assertions.assertEquals(100000, solution("test.txt"));
    }

}
