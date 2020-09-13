import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseVowelsOfAStringTest {

    @Test
    public void test_reverseVowels()
    {
        ReverseVowelsOfAString r = new ReverseVowelsOfAString();
        Assertions.assertEquals("holle", r.reverseVowels("hello"));
        Assertions.assertEquals("leotcede", r.reverseVowels("leetcode"));

        Assertions.assertEquals("hoa", r.reverseVowels("hao"));
        Assertions.assertEquals("hhh", r.reverseVowels("hhh"));
        Assertions.assertEquals("123", r.reverseVowels("123"));
    }
}
