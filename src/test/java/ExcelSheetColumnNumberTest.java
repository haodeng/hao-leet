import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExcelSheetColumnNumberTest {

    @Test
    public void test_titleToNumber(){
        ExcelSheetColumnNumber columnNumber = new ExcelSheetColumnNumber();
        Assertions.assertEquals(1, columnNumber.titleToNumber("A"));
        Assertions.assertEquals(2, columnNumber.titleToNumber("B"));

        Assertions.assertEquals(27, columnNumber.titleToNumber("AA"));
        Assertions.assertEquals(28, columnNumber.titleToNumber("AB"));
        Assertions.assertEquals(701, columnNumber.titleToNumber("ZY"));

        Assertions.assertEquals(703, columnNumber.titleToNumber("AAA"));
    }
}
