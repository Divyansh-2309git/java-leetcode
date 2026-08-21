/*
 * Problem: LC 2461 - Maximum Sum of Distinct Subarrays With Length K
 *
 * Topic: Arrays
 * Pattern: Fixed-Size Sliding Window + HashSet
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(k)
 *
 * Approach:
 * - Maintain a fixed-size sliding window of length k.
 * - Use a HashSet to ensure all elements in the window are distinct.
 * - Maintain a running sum instead of recalculating the sum for every window.
 * - When a duplicate is encountered, remove elements from the left until
 *   the duplicate is eliminated.
 * - Maintain the window size at k by removing elements from the left.
 * - Update the maximum sum for every valid window.
 *
 * Key Learning:
 * - Fixed-size sliding window can be combined with a HashSet for uniqueness.
 * - Maintain a running sum by adding the incoming element and removing
 *   the outgoing element.
 * - Use long for sums when the possible result can exceed int range.
 *
 * Date Solved: 15-08-2026
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.HashSet;

public class LC2461_MaximumSumOfDistinctSubarraysWithLengthK {

    static class Solution {
        public long maximumSubarraySum(int[] nums, int k) {
            HashSet<Integer> set = new HashSet<>() ; 
            int right = 0 ; 
            int left = 0 ; 
            long currSum = 0 ;
            long maxSum = 0 ;  
            while(right - left < k && right < nums.length ){
                while(set.contains(nums[right])){
                    currSum -= nums[left]  ;
                    set.remove(nums[left]) ; 
                    left ++ ; 
                }
                set.add(nums[right]) ; 
                currSum += nums[right] ; 
                right ++ ; 
            }
            if(set.size() != k ){
                return 0 ; 
            }else{
                maxSum = currSum ; 
            }
            
            while(right < nums.length){
                while(set.contains(nums[right]) || right - left >= k ){
                    set.remove(nums[left]) ; 
                    currSum -= nums[left] ; 
                    left ++ ; 
                }
                set.add(nums[right]) ; 
                currSum += nums[right] ; 
                maxSum = Math.max(currSum , maxSum) ; 
                right ++ ; 

            }
            return maxSum ; 

        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {1, 5, 4, 2, 9, 9, 9};
        System.out.println(
            solution.maximumSubarraySum(nums1, 3)
        );
        // Expected: 15

        // Test Case 2
        int[] nums2 = {4, 4, 4};
        System.out.println(
            solution.maximumSubarraySum(nums2, 3)
        );
        // Expected: 0

        // Test Case 3
        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println(
            solution.maximumSubarraySum(nums3, 3)
        );
        // Expected: 12
    }
}