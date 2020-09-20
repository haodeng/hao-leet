import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 * Example 4:
 *
 * Input: s = "([)]"
 * Output: false
 * Example 5:
 *
 * Input: s = "{[]}"
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) return false;

        boolean anyBrackets = false;
        Stack stack = new Stack();
        char[] chars = s.toCharArray();
        for(char c : chars) {
            if (isOpenBracket(c)) {
                stack.push(c);
                anyBrackets = true;
            }

            if (isCloseBracket(c)){
                if (stack.size() == 0) return false;

                char lastOpenBracket = (char) stack.pop();
                if (!isBracketMatch(lastOpenBracket, c))
                    return false;
            }
        }

        return anyBrackets ? stack.size() == 0 : false;
    }

    private boolean isOpenBracket(char c){
        return c == '(' || c == '[' || c == '{';
    }

    private boolean isCloseBracket(char c){
        return c == ')' || c == ']' || c == '}';
    }

    private boolean isBracketMatch(char openBracket, char closeBracket){
        return (openBracket == '(' && closeBracket == ')') ||
                (openBracket == '[' && closeBracket == ']') ||
                (openBracket == '{' && closeBracket == '}');
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("()"));
        System.out.println(vp.isValid("()[]{}"));
        System.out.println(vp.isValid("(]"));
        System.out.println(vp.isValid("([)]"));
        System.out.println(vp.isValid("{[]}"));
        System.out.println(vp.isValid("{[dasd(dd)l;;;'1]}"));

        System.out.println(vp.isValid(""));
        System.out.println(vp.isValid(null));
        System.out.println(vp.isValid("dkalfdja"));
    }
}
