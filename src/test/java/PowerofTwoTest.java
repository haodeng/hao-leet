import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerofTwoTest {

    @Test
    public void test_isPowerOfTwo()
    {
        PowerofTwo powerofTwo = new PowerofTwo();
        Assertions.assertFalse(powerofTwo.isPowerOfTwo(-1));
        Assertions.assertFalse(powerofTwo.isPowerOfTwo(0));
        Assertions.assertTrue(powerofTwo.isPowerOfTwo(1));
        Assertions.assertFalse(powerofTwo.isPowerOfTwo(218));
        Assertions.assertTrue(powerofTwo.isPowerOfTwo(16));
        Assertions.assertFalse(powerofTwo.isPowerOfTwo(1073741825));
    }
}
