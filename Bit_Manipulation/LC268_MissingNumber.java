/*
 * Problem: LC 268 - Missing Number
 *
 * Topic: Bit Manipulation
 * Pattern: Expected Sum / XOR Cancellation
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Compute expected sum n*(n+1)/2 and subtract actual array sum, OR XOR all indices and elements.
 *
 * Key Learning:
 * - Mathematical range sum or XOR bitwise property eliminates need for HashSet space.
 *
 * Date Solved: 09-08-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

public class LC268_MissingNumber {

    static class Solution {
        public int missingNumber(int[] nums) {
            
            int n = nums.length;
            int sum = 0;

            for (int num : nums) {
                sum += num;
            }

            int expectedSum = n * (n + 1) / 2;

            return expectedSum - sum;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        System.out.println(
                solution.missingNumber(
                        new int[]{3, 0, 1}
                )
        ); // 2

        // Test Case 2
        System.out.println(
                solution.missingNumber(
                        new int[]{0, 1}
                )
        ); // 2

        // Test Case 3
        System.out.println(
                solution.missingNumber(
                        new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}
                )
        ); // 8
    }
}