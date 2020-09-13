/**
 * Write a function that takes a string as input and reverse only the vowels of a string.
 *
 * Example 1:
 *
 * Input: "hello"
 * Output: "holle"
 * Example 2:
 *
 * Input: "leetcode"
 * Output: "leotcede"
 * Note:
 * The vowels does not include the letter "y".
 */
public class ReverseVowelsOfAString {

    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();

        int i = 0, j = chars.length -1;
        char temp;
        while (i < j){
            if (isVowel(chars[i]) && isVowel(chars[j])) {
                temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;

                i++;
                j--;
            }
            else if (isVowel(chars[i])) {
                j--;
            }
            else if (isVowel(chars[j])) {
                i++;
            }
            else {
                i++;
                j--;
            }
        }

        return new String(chars);
    }

    private boolean isVowel(char c){
        return c == 'a' ||
                c == 'e' ||
                c == 'i' ||
                c == 'o' ||
                c == 'u' ||
                c == 'A' ||
                c == 'E' ||
                c == 'I' ||
                c == 'O' ||
                c == 'U';
    }
}
