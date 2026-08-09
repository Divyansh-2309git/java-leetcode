/*
 * Problem: LC 1 - Two Sum
 *
 * Topic: Hashing
 * Pattern: HashMap Index Tracking
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:
 * - Traverse array while maintaining a HashMap mapping value -> index.
 * - For current element, check if target - value exists in HashMap.
 * - If present, return indices. Otherwise store value -> index.
 *
 * Key Learning:
 * - Trade space for time to reduce O(n²) pair lookup to O(n).
 *
 * Date Solved: 06-08-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.*;

public class LC1_TwoSum {

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer , Integer > map = new HashMap<>(); 
            for(int i = 0 ; i < nums.length ; i ++){
                int val = nums[i] ; 
                if(map.containsKey(target - val)){
                    return new int[] {map.get(target - val) , i} ; 
                }else{
                    map.put(val , i ) ; 
                }
            }
            return new int[0] ;  
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        System.out.println(Arrays.toString(
                solution.twoSum(new int[]{2, 7, 11, 15}, 9)));

        // Test Case 2
        System.out.println(Arrays.toString(
                solution.twoSum(new int[]{3, 2, 4}, 6)));

        // Test Case 3
        System.out.println(Arrays.toString(
                solution.twoSum(new int[]{3, 3}, 6)));

    }
}