/**
 * Given an integer, write a function to determine if it is a power of two.
 *
 * Example 1:
 *
 * Input: 1
 * Output: true
 * Explanation: 20 = 1
 * Example 2:
 *
 * Input: 16
 * Output: true
 * Explanation: 24 = 16
 * Example 3:
 *
 * Input: 218
 * Output: false
 */
public class PowerofTwo {

    public boolean isPowerOfTwo(int n){
        if (n < 1) return false;
        if (n == 1) return true;

        return n%2 != 0 ? false : isPowerOfTwo(n/2);
    }

    //Brute force, slow
    public boolean isPowerOfTwo_slow(int n) {
        if (n == 1) return true;

        int result = 2;
        while (n > result)
        {
            result = result << 1;
            if (result == n) return true;
        }

        return false;
    }
}
