/*
 * Problem: LC 1480 - Running Sum of 1d Array
 *
 * Topic: Prefix Sum
 * Pattern: Prefix Sum Array
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Iterate array accumulating sum: nums[i] += nums[i-1].
 *
 * Key Learning:
 * - In-place prefix sum updates.
 *
 * Date Solved: 30-07-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.Arrays;

public class LC1480_RunningSumOf1DArray {

    public int[] runningSum(int[] nums) {
        for (int i = 1 ; i < nums.length ; i ++){
            nums[i] = nums[i] + nums[i - 1 ] ; 
        }
        return nums; 
    }

    public static void main(String[] args) {

        LC1480_RunningSumOf1DArray solution =
                new LC1480_RunningSumOf1DArray();

        int[] nums = {1, 2, 3, 4};

        int[] ans = solution.runningSum(nums);

        System.out.println(Arrays.toString(ans));
    }
}