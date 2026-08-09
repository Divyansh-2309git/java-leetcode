/*
 * Problem: LC 136 - Single Number
 *
 * Topic: Bit Manipulation
 * Pattern: XOR Cancellation
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - XOR all elements together.
 * - Duplicates cancel out (a ^ a = 0), leaving the single unique number (a ^ 0 = a).
 *
 * Key Learning:
 * - Bitwise XOR properties for linear time and constant space uniqueness check.
 *
 * Date Solved: 07-08-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

public class LC136_SingleNumber {

    static class Solution {
        public int singleNumber(int[] nums) {
            int ans = nums[0];

            for (int i = 1; i < nums.length; i++) {
                ans ^= nums[i];
            }

            return ans;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        System.out.println(solution.singleNumber(new int[]{2, 2, 1}));           // 1

        // Test Case 2
        System.out.println(solution.singleNumber(new int[]{4, 1, 2, 1, 2}));     // 4

        // Test Case 3
        System.out.println(solution.singleNumber(new int[]{1}));                  // 1

        // Test Case 4
        System.out.println(solution.singleNumber(new int[]{7, 3, 7}));           // 3

        // Test Case 5
        System.out.println(solution.singleNumber(new int[]{9, 5, 5, 9, 8}));     // 8
    }
}