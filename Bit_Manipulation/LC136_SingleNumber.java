/*
 * Problem: LC 136 - Single Number
 *
 * Topic: Array, Bit Manipulation
 * Pattern: XOR
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Initialize the answer with the first element.
 * - Traverse the remaining array.
 * - XOR the current answer with each element.
 * - Duplicate numbers cancel each other out because:
 *      a ^ a = 0
 *      a ^ 0 = a
 * - The remaining value is the unique number.
 *
 * Key Learning:
 * - XOR is useful when every element appears exactly twice except one.
 * - XOR is associative and commutative, so the order doesn't matter.
 * - Bit Manipulation can often replace HashMaps and reduce space complexity.
 *
 * Date Solved: 07-08-2026
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