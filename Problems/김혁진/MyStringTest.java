import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyStringTest {

    private MyString myString;

    @BeforeEach
    void setUp() {
        myString = new MyString("Hello");
    }

    @Test
    void myConcatTest() {
        assertEquals("Hello World", myString.myConcat(" World"));
    }

    @Test
    void myLengthTest() {
        assertEquals(5, myString.myLength("Hello"));
    }

    @Test
    void myToUpperCaseTest() {
        assertEquals("HELLO", myString.myToUpperCase("hello"));
    }

    @Test
    void myToLowerCaseTest() {
        assertEquals("hello", myString.myToLowerCase("HELLO"));
    }
}
