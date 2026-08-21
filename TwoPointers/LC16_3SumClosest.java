/*
 * Problem: LC 16 - 3Sum Closest
 *
 * Topic: Two Pointers
 * Pattern: Sorting + Two Pointers
 * Difficulty: Medium
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Sort the input array.
 * - Iterate with index i, and place two pointers left = i + 1 and right = n - 1.
 * - Compute current three-sum and calculate its absolute difference from target.
 * - If current difference is smaller than minimum difference seen so far, update closest sum.
 * - If sum equals target, return immediately.
 * - If sum > target, decrement right; otherwise increment left.
 *
 * Key Learning:
 * - Sorting enables two-pointer convergence to efficiently find the closest sum in O(n²) time.
 *
 * Date Solved: TODO: USER INPUT REQUIRED
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: TODO: USER INPUT REQUIRED
 *
 * Revision: TODO: USER INPUT REQUIRED
 */

import java.util.*;

public class LC16_3SumClosest {

    static class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums) ; 
            int closestSum = Integer.MAX_VALUE ; 
            int val = 0 ; 
            for(int i = 0 ; i < nums.length ; i ++){
                int left = i + 1 ;  
                int right = nums.length - 1 ; 
                
                while(left < right){
                    int sum = nums[i] + nums[left] + nums[right] ; 
                    if(Math.abs(target - sum) < closestSum){
                        val = sum ;  
                        closestSum = Math.abs(target - sum );  
                    }
                    if(sum == target ){
                        return sum ; 
                    }
                    if(sum > target){
                        right -- ; 
                    }else{
                        left ++ ; 
                    }

                }
            }
            return val ; 
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {-1, 2, 1, -4};

        System.out.println(
            solution.threeSumClosest(nums1, 1)
        );
        // Expected: 2


        // Test Case 2
        int[] nums2 = {0, 0, 0};

        System.out.println(
            solution.threeSumClosest(nums2, 1)
        );
        // Expected: 0
    }
}