/*
 * Problem: LC 209 - Minimum Size Subarray Sum
 *
 * Topic: Arrays
 * Pattern: Variable-Size Sliding Window
 * Difficulty: Medium
 *
 * Approach:
 * - Maintain a sliding window using left and right pointers.
 * - Expand the window by moving right and add nums[right] to sum.
 * - Once the window sum becomes greater than or equal to target,
 *   the window becomes valid.
 * - Record the current window length.
 * - Then shrink the window from the left while the sum is still
 *   greater than or equal to target.
 * - This allows us to find the smallest valid window.
 * - Continue expanding right until the entire array is processed.
 *
 * Window Condition:
 *
 *     sum >= target
 *
 * When the condition becomes true:
 *
 *     1. Record the current window length.
 *     2. Remove nums[left].
 *     3. Move left forward.
 *     4. Repeat while sum >= target.
 *
 * Example:
 *
 * nums = [2, 3, 1, 2, 4, 3]
 * target = 7
 *
 * Window:
 *
 * [2, 3, 1, 2]
 * sum = 8 >= 7
 * length = 4
 *
 * Shrink:
 *
 * [3, 1, 2]
 * sum = 6
 *
 * Later:
 *
 * [4, 3]
 * sum = 7
 * length = 2
 *
 * Result = 2
 *
 * Important Pattern:
 *
 *     Expand
 *        ↓
 *     sum >= target
 *        ↓
 *     Record answer
 *        ↓
 *     Shrink
 *        ↓
 *     Still valid?
 *        ↓
 *     Record again
 *        ↓
 *     Shrink again
 *
 * Key Learning:
 * - This is a variable-size sliding window.
 * - For minimum-length problems, once a window becomes valid,
 *   keep shrinking it to find the smallest valid window.
 * - The answer must be updated BEFORE removing the left element.
 * - A while loop is required because multiple elements may be
 *   removed while the window remains valid.
 * - Since all numbers are positive, removing elements from the
 *   left always decreases the sum.
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(1)
 *
 * Common Mistakes:
 * - Using Integer.MIN_VALUE for a minimum answer.
 * - Updating the answer after shrinking instead of before shrinking.
 * - Using if instead of while for the shrinking condition.
 * - Using sum > target instead of sum >= target.
 * - Forgetting to increment right.
 * - Forgetting right - left + 1 when calculating window length.
 * - Returning Integer.MAX_VALUE when no valid subarray exists.
 *
 * No Valid Window:
 *
 * If minValue remains Integer.MAX_VALUE:
 *
 *     return 0;
 *
 * Date Solved: 13-08-2026
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐
 *
 * Revision: No
 */

public class LC209_MinimumSizeSubarraySum {

    static class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int right = 0;
            int left = 0;
            int sum = 0;
            int minValue = Integer.MAX_VALUE;

            while (right < nums.length) {

                sum += nums[right];

                while (sum >= target) {

                    minValue = Math.min(minValue,right - left + 1);

                    sum -= nums[left];
                    left++;
                }

                right++;
            }

            if (minValue == Integer.MAX_VALUE) {
                return 0;
            }

            return minValue;

        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        System.out.println(solution.minSubArrayLen(7, nums1));
        // Expected: 2

        // Test Case 2
        int[] nums2 = {1, 4, 4};
        System.out.println(solution.minSubArrayLen(4, nums2));
        // Expected: 1

        // Test Case 3
        int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(solution.minSubArrayLen(11, nums3));
        // Expected: 0

        // Test Case 4
        int[] nums4 = {1, 2, 3, 4, 5};
        System.out.println(solution.minSubArrayLen(15, nums4));
        // Expected: 5
    }
}