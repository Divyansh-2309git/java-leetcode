/*
 * Problem: LC 1 - Two Sum
 *
 * Topic: Array, Hashing
 * Pattern: Hash Map
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:
 * - Create a HashMap to store previously visited numbers and their indices.
 * - Traverse the array once.
 * - For each element, calculate the complement (target - current element).
 * - If the complement already exists in the HashMap,
 *   return its index along with the current index.
 * - Otherwise, store the current element and its index.
 *
 * Key Learning:
 * - HashMap enables constant-time lookups.
 * - Store previously visited elements instead of searching ahead.
 * - This reduces the brute-force O(n²) solution to O(n).
 *
 * Date Solved: 06-08-2026
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