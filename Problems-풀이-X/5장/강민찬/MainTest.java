import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.nhnacademy.강민찬.Main;

public class MainTest {

    @Test
    @DisplayName("solution() 실행결과")
    void getSolutionTest() {
        String[] inputs = { "but", "i", "wont", "hesitate", "no", "more", "no", "more", "it", "cannot", "wait", "im",
                "yours" };
        String[] outputs = { "i", "im", "it", "no", "but", "more", "wait", "wont", "yours", "cannot", "hesitate" };
        String[] expected = Main.solution(inputs);

        if (expected.length != outputs.length) {
            Assertions.assertNotEquals(expected.length, outputs.length);
        }
        Assertions.assertArrayEquals(expected, outputs);
    }
}
