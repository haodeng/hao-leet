import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    public void test_twoSum()
    {
        TwoSum ts= new TwoSum();
        int[] result = ts.twoSum(new int[]{3, 3}, 6);
        Assertions.assertEquals(result[0], 0);
        Assertions.assertEquals(result[1], 1);

        result = ts.twoSum(new int[]{0, 1, 1, 2}, 2);
        Assertions.assertEquals(result[0], 0);
        Assertions.assertEquals(result[1], 3);
    }
}
