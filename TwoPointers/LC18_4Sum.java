/*
 * Problem: LC 18 - 4Sum
 *
 * Topic: Two Pointers
 * Pattern: Sorting + Two Pointers
 * Difficulty: Medium
 *
 * Time Complexity: O(n³)
 * Space Complexity: O(1) auxiliary
 *
 * Approach:
 * - Sort the input array.
 * - Use two nested loops with pointers i and j to fix the first two numbers, skipping duplicates.
 * - Use two pointers left = j + 1 and right = n - 1 to find the remaining pair such that the sum equals target.
 * - Use long to accumulate sum to prevent 32-bit integer overflow.
 * - When a valid quadruplet is found, skip duplicate elements on both pointers.
 *
 * Key Learning:
 * - Extension of 3Sum with an additional outer loop; nested loops + two pointers generalizes k-Sum problems.
 * - Use 64-bit integers (long) when calculating sums of multiple 32-bit integers to prevent overflow.
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

public class LC18_4Sum {

    static class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums) ; 
            List<List<Integer>> ans = new ArrayList<>() ; 
            for(int i = 0 ; i < nums.length - 3 ; i ++){
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                for(int j = i + 1 ; j < nums.length - 2 ; j ++){
                    if (j > i + 1 && nums[j] == nums[j - 1]) {
                        continue;
                    }

                    int left = j + 1 ; 
                    int right = nums.length - 1  ; 
                    while(left < right ){
                        long sum = nums[i] + nums[left] + nums[right] + nums[j] ; 
                        if(sum == target){
                            List<Integer> list = Arrays.asList(nums[i] , nums[left] , nums[right] , nums[j]) ; 
                            ans.add(list) ; 
                            left ++ ; 
                            right -- ; 
                            while (left < right &&
                                nums[left] == nums[left - 1]) {
                                left++;
                            }
                            while (left < right &&
                                nums[right] == nums[right + 1]) {
                                right--;
                            }
                        }
                        else if(sum > target){
                            right -- ; 
                        }else{
                            left ++ ; 
                        }
                    }
                }
            }
            return ans ; 
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {1, 0, -1, 0, -2, 2};

        System.out.println(
            solution.fourSum(nums1, 0)
        );
        // Expected:
        // [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]


        // Test Case 2
        int[] nums2 = {2, 2, 2, 2, 2};

        System.out.println(
            solution.fourSum(nums2, 8)
        );
        // Expected:
        // [[2,2,2,2]]
    }
}