/*
 * Problem: LC 643 - Maximum Average Subarray I
 *
 * Topic: Arrays
 * Pattern: Fixed-Size Sliding Window
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Maintain a window of exactly k elements.
 * - Calculate the sum of the first window.
 * - Slide the window one position at a time.
 * - Remove the element leaving the window.
 * - Add the element entering the window.
 * - Keep track of the maximum window sum.
 * - Divide the maximum sum by k to obtain the maximum average.
 *
 * Key Learning:
 * - A fixed-size sliding window always contains exactly k elements.
 * - When the window moves, do not recalculate the entire sum.
 * - Remove the leftmost element and add the new rightmost element.
 * - This reduces the solution from O(n * k) to O(n).
 *
 * Window Movement:
 *
 * [1, 12, -5, -6] 50 3
 *  ↑           ↑
 * left        right
 *
 * Remove 1, add 50:
 *
 * 1 [12, -5, -6, 50] 3
 *
 * Remove 12, add 3:
 *
 * 1 12 [-5, -6, 50, 3]
 *
 * Common Mistakes:
 * - Allowing the window to become larger/smaller than k.
 * - Accessing nums[right] after right has moved outside the array.
 * - Recalculating the entire window sum every time.
 * - Initializing the maximum average to 0 when all values can be negative.
 *
 * Date Solved: 11-08-2026
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

public class LC643_MaximumAverageSubarrayI {

    static class Solution {
        public double findMaxAverage(int[] nums, int k) {
            double maxAverage = Double.NEGATIVE_INFINITY;
            double average = 0.0;

            int left = 0;
            int right = k;

            // First window
            for (int i = 0; i < k; i++) {
                average += nums[i];
            }

            maxAverage = Math.max(maxAverage, average / k);

            // Slide the window
            while (right < nums.length) {

                average -= nums[left];
                average += nums[right];

                left++;
                right++;

                maxAverage = Math.max(maxAverage, average / k);
            }

            return maxAverage;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        System.out.println(solution.findMaxAverage(nums1, 4));
        // Expected: 12.75

        // Test Case 2
        int[] nums2 = {5};
        System.out.println(solution.findMaxAverage(nums2, 1));
        // Expected: 5.0

        // Test Case 3
        int[] nums3 = {0, 1, 1, 3, 3};
        System.out.println(solution.findMaxAverage(nums3, 4));
        // Expected: 2.0
    }
}