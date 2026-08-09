/*
 * Problem: LC 15 - 3Sum
 *
 * Topic: Two Pointers
 * Pattern: Sorting + Two Pointers
 * Difficulty: Medium
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Sort array, fix index i, use two pointers left and right to find target sum 0 while skipping duplicates.
 *
 * Key Learning:
 * - Two pointers after sorting to find triplets while eliminating duplicate combinations.
 *
 * Date Solved: 09-08-2026
 *
 * Status: Solved With Assistance
 *
 * Confidence: ⭐⭐⭐
 *
 * Revision: Yes
 */

import java.util.*;

public class LC15_3Sum {

    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums) ; 
            List<List<Integer>> result = new ArrayList<>();
            for(int i = 0 ; i < nums.length ; i ++){
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int left = 1 + i ; 
                int right = nums.length - 1 ; 
                while(left < right){
                    int sum = nums[i] + nums[left ] + nums[right] ; 
                    if(sum == 0 ){
                        result.add(Arrays.asList(nums[i], nums[left], nums[right])); 
                        left ++ ; 
                        right -- ; 
                        // Skip duplicate left values
                        while (left < right &&
                               nums[left] == nums[left - 1]) {
                            left++;
                        }

                        // Skip duplicate right values
                        while (left < right &&
                               nums[right] == nums[right + 1]) {
                            right--;
                        }

                    }else if(sum > 0){
                        right -- ; 
                    }else{
                        left ++ ; 
                    }
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        System.out.println(
                solution.threeSum(
                        new int[]{-1, 0, 1, 2, -1, -4}
                )
        );
        // [[-1, -1, 2], [-1, 0, 1]]

        // Test Case 2
        System.out.println(
                solution.threeSum(
                        new int[]{0, 1, 1}
                )
        );
        // []

        // Test Case 3
        System.out.println(
                solution.threeSum(
                        new int[]{0, 0, 0}
                )
        );
        // [[0, 0, 0]]
    }
}