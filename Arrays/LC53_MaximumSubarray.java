/*
 * Problem: LC 53 - Maximum Subarray
 *
 * Topic: Arrays
 * Pattern: Kadane's Algorithm
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Maintain the maximum sum of the subarray ending at the current index.
 * - At each element, decide whether to start a new subarray or extend the current one.
 * - Maintain the maximum subarray sum found so far.
 * - Handle the all-negative case by initializing with nums[0].
 *
 * Key Learning:
 * - Kadane's Algorithm finds the maximum subarray sum in O(n).
 * - currentSum represents the best subarray ending at the current position.
 * - maxSum stores the best answer found so far.
 *
 * Date Solved: 09-08-2026
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

public class LC53_MaximumSubarray {

    static class Solution {
        public int maxSubArray(int[] nums) {
            int maxSum = 0 ; 
            int currSum = 0 ; 
            int max = Integer.MIN_VALUE ; 
            for(int i = 0 ; i < nums.length ; i ++){
                max = Math.max(max, nums[i]) ; 
                currSum += nums[i] ; 
                if(currSum < 0){
                    currSum = 0 ; 
                }
                maxSum = Math.max(maxSum, currSum) ; 
            }
            if (maxSum != 0 ){
                return maxSum ; 
            }else{
                return  max ; 
                
            }
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        System.out.println(
                solution.maxSubArray(
                        new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}
                )
        ); // 6

        // Test Case 2
        System.out.println(
                solution.maxSubArray(
                        new int[]{1}
                )
        ); // 1

        // Test Case 3
        System.out.println(
                solution.maxSubArray(
                        new int[]{5, 4, -1, 7, 8}
                )
        ); // 23

        // Test Case 4
        System.out.println(
                solution.maxSubArray(
                        new int[]{-5, -2, -8, -1}
                )
        ); // -1
    }
}