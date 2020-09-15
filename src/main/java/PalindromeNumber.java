/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 *
 * Example 1:
 *
 * Input: 121
 * Output: true
 * Example 2:
 *
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Follow up:
 *
 * Coud you solve it without converting the integer to a string?
 */
public class PalindromeNumber {

    public boolean isPalindrome_stringSolution(int x) {
        if (x < 0) return false;
        if (x < 10) return true;

        char[] numbers = (x + "").toCharArray();
        int i = 0, j = numbers.length - 1;
        while (i < j){
            if (numbers[i] != numbers[j]) return false;
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome_stringSolution(10));
        System.out.println(p.isPalindrome_stringSolution(121));
    }
}
