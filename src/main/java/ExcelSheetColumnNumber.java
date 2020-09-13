/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * For example:
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * Example 1:
 *
 * Input: "A"
 * Output: 1
 * Example 2:
 *
 * Input: "AB"
 * Output: 28
 * Example 3:
 *
 * Input: "ZY"
 * Output: 701
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 7
 * s consists only of uppercase English letters.
 * s is between "A" and "FXSHRXW".
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        if (s == null || s.isEmpty() || s.length() > 7)
            throw new IllegalArgumentException("Input String not not be empty and length should <= 7.");

        char[] letters = s.toCharArray();

        int columnNumber = 0;
        for (int i = 0; i < letters.length; i++){
            if (!isUppercaseLetter(letters[i]))
                throw new IllegalArgumentException("Upper case letter required");

            columnNumber += Math.pow(26 , letters.length -1 - i) * getSingleColumnNumber(letters[i]);
        }

        return columnNumber;
    }

    private int getSingleColumnNumber(char c){
        //A -> 1, B ->2, ... , Z -> 26
        return (int) c - 64;
    }

    private boolean isUppercaseLetter(char c){
        int ascii = (int) c;
        // 'A' <= c <= 'Z'
        return ascii >= 64 && ascii <=90;
    }
}
