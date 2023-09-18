import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class BracketCheckerTest {

    @Test
    public void testIsBalanced() {
        BracketChecker checker = new BracketChecker();

        assertTrue(checker.isBalanced("([])"));
        assertFalse(checker.isBalanced("([)]"));
        assertTrue(checker.isBalanced("{[()]}"));
        assertFalse(checker.isBalanced("{[}]"));
        assertTrue(checker.isBalanced(""));
    }
}
