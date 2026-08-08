/*
 * Problem: LC 1480 - Running Sum of 1D Array
 *
 * Topic: Arrays
 * Pattern: Prefix sum 
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:Traverse from index 1 onwards.
 * Each element becomes the sum of itself and the previous running sum.
 *
 * Key Learning:Running Sum is the simplest application of Prefix Sum.
 * Updating the array in-place reduces extra space to O(1).
 *
 * Date Solved:30-7-2026
 *
 * Confidence:⭐⭐⭐⭐⭐
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