/*
 * Problem: LC 219 - Contains Duplicate II
 *
 * Topic: Hashing
 * Pattern: HashMap Index Tracking
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:
 * - Maintain HashMap of value -> last index.
 * - If current index - previous index <= k, return true.
 *
 * Key Learning:
 * - HashMap index tracking for proximity checks.
 *
 * Date Solved: 09-08-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.HashMap;


public class LC219_ContainsDuplicateII {

    static class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            HashMap<Integer , Integer > map = new HashMap<>() ; 
            for(int i = 0 ; i < nums.length ; i ++){
                int val = nums[i] ; 
                if(!map.containsKey(val)){
                    map.put(val , i ) ; 
                }else{
                    int index = map.get(val) ; 
                    if(Math.abs(i - index) <= k ){
                        return true ; 
                    }
                    map.put(val , i) ; 
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        System.out.println(
                solution.containsNearbyDuplicate(
                        new int[]{1, 2, 3, 1}, 3
                )
        ); // true

        // Test Case 2
        System.out.println(
                solution.containsNearbyDuplicate(
                        new int[]{1, 0, 1, 1}, 1
                )
        ); // true

        // Test Case 3
        System.out.println(
                solution.containsNearbyDuplicate(
                        new int[]{1, 2, 3, 1, 2, 3}, 2
                )
        ); // false

        // Test Case 4
        System.out.println(
                solution.containsNearbyDuplicate(
                        new int[]{1, 2, 3, 1}, 2
                )
        ); // false
    }
}