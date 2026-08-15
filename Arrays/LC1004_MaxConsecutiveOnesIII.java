/*
 * Problem: LC 1004 - Max Consecutive Ones III
 *
 * Topic: Arrays
 * Pattern: Variable-Size Sliding Window
 * Difficulty: Medium
 *
 * Approach:
 * - Maintain a sliding window using left and right pointers.
 * - The window can contain at most k zeroes because we are allowed
 *   to flip at most k zeroes into ones.
 * - Expand the window by moving right.
 * - Whenever the number of zeroes becomes greater than k, shrink
 *   the window from the left.
 * - Continue shrinking until the window becomes valid again.
 * - For every valid window, calculate its length and update the
 *   maximum length.
 *
 * Window Condition:
 *
 *     zeroCount <= k
 *
 * If:
 *
 *     zeroCount > k
 *
 * then the current window is invalid and left must be moved forward.
 *
 * Sliding Window Pattern:
 *
 *     Expand right
 *          ↓
 *     Add nums[right]
 *          ↓
 *     Is window invalid?
 *          ↓
 *       zeroCount > k
 *          ↓
 *     Shrink using while
 *          ↓
 *     Window becomes valid
 *          ↓
 *     Update maximum length
 *
 * Example:
 *
 * nums = [1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0]
 * k = 2
 *
 * A valid window can contain at most 2 zeroes.
 *
 * When the window contains 3 zeroes:
 *
 *     [1 1 1 0 0 0]
 *             ↑
 *
 * zeroCount = 3 > k
 *
 * The window is invalid.
 *
 * Move left until one zero leaves the window:
 *
 *     [1 1 0 0 0]
 *       ↑       ↑
 *      left   right
 *
 * Continue shrinking until:
 *
 *     zeroCount <= k
 *
 * Then calculate:
 *
 *     right - left + 1
 *
 * Key Learning:
 * - This is a variable-size sliding window.
 * - Unlike fixed-size sliding windows, the window length changes.
 * - The condition determines when the window needs to shrink.
 * - Use while, not if, when the window may need to shrink multiple
 *   times before becoming valid.
 * - We don't need to count the number of ones separately.
 * - The answer is simply the length of the largest valid window.
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(1)
 *
 * Common Mistakes:
 * - Checking the condition before adding nums[right].
 * - Using if instead of while when shrinking the window.
 * - Forgetting to decrease zeroCount when a zero leaves the window.
 * - Calculating the answer using the number of ones instead of
 *   the window length.
 * - Forgetting +1 in:
 *
 *     right - left + 1
 *
 * Date Solved: 13-08-2026
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐
 *
 * Revision: Yes
 */

public class LC1004_MaxConsecutiveOnesIII {

    static class Solution {
        public int longestOnes(int[] nums, int k) {
            int left = 0;
            int right = 0;
            int zeroCount = 0;
            int maxLength = 0;

            while (right < nums.length) {

                // Add right element
                if (nums[right] == 0) {
                    zeroCount++;
                }

                // Shrink until window is valid
                while (zeroCount > k) {

                    if (nums[left] == 0) {
                        zeroCount--;
                    }

                    left++;
                }

                // Current window is valid
                maxLength = Math.max(maxLength, right - left + 1);

                right++;
            }

            return maxLength;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        System.out.println(
            solution.longestOnes(
                new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2
            )
        );
        // Expected: 6

        // Test Case 2
        System.out.println(
            solution.longestOnes(
                new int[]{0, 0, 1, 1, 1, 0, 0}, 0
            )
        );
        // Expected: 3

        // Test Case 3
        System.out.println(
            solution.longestOnes(
                new int[]{1, 1, 1, 1}, 2
            )
        );
        // Expected: 4
    }
}