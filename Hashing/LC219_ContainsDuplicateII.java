/*
 * Problem: LC 219 - Contains Duplicate II
 *
 * Topic: Array, HashMap
 * Pattern: HashMap + Index Tracking
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:
 * - Use a HashMap to store each number and its most recent index.
 * - Iterate through the array.
 * - If the current number already exists in the map,
 *   get its previous index.
 * - Check whether the distance between the current index
 *   and previous index is less than or equal to k.
 * - If it is, return true.
 * - Otherwise, update the number's index to the current index.
 * - If no valid pair is found, return false.
 *
 * Key Learning:
 * - HashMap can be used to remember the most recent position
 *   of an element.
 * - For duplicate-distance problems, storing indices is useful.
 * - Updating the index each time ensures we compare against
 *   the closest previous occurrence.
 *
 * Date Solved: 09-08-2026
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