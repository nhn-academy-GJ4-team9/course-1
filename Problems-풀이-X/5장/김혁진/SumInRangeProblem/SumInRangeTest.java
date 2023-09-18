import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumInRangeTest {

    @Test
    public void testSumInRange() {
        int[] arr1 = {3, -2, 4, 7, -5, 9};
        int[] arr2 = {-5, 6, 7, -8, 10, -3, 2};
        int[] arr3 = {1, 2, 3, 4, 5};

        assertEquals(4, SumInRange.sumInRange(arr1, 1, 4));
        assertEquals(15, SumInRange.sumInRange(arr2, 1, 4));
        assertEquals(15, SumInRange.sumInRange(arr3, 0, 4));
        assertEquals(9, SumInRange.sumInRange(arr3, 1, 3));
    }
}
