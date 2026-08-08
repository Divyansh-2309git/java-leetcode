/*
 * Problem: LC 268 - Missing Number
 *
 * Topic: Array, Math
 * Pattern: Expected Sum
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - The array contains n distinct numbers from the range 0 to n,
 *   with exactly one number missing.
 * - Calculate the expected sum of all numbers from 0 to n using:
 *   n * (n + 1) / 2.
 * - Calculate the actual sum of all elements in the array.
 * - Subtract the actual sum from the expected sum.
 * - The difference is the missing number.
 *
 * Key Learning:
 * - The required range is based on nums.length, not the maximum
 *   value present in the array.
 * - Expected sum - actual sum directly gives the missing number.
 *
 * Date Solved: 09-08-2026
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