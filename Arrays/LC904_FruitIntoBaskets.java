/*
 * Problem: LC 904 - Fruit Into Baskets
 *
 * Topic: Arrays
 * Pattern: Variable-Size Sliding Window + Frequency Map
 * Difficulty: Medium
 *
 * Approach:
 * - Maintain a sliding window using left and right pointers.
 * - Each fruit type is represented by a key in a HashMap.
 * - The value stored for each key represents how many times that
 *   fruit occurs inside the current window.
 * - We are allowed to have at most 2 distinct fruit types.
 * - Expand the window by moving right.
 * - Add the current fruit to the frequency map.
 * - If the map contains more than 2 distinct fruit types, the
 *   window becomes invalid.
 * - Shrink the window from the left until only 2 distinct fruit
 *   types remain.
 * - For every valid window, calculate its length and update the
 *   maximum.
 *
 * Window Condition:
 *
 *     map.size() <= 2
 *
 * If:
 *
 *     map.size() > 2
 *
 * then the window is invalid and we must move left.
 *
 * Example:
 *
 * fruits = [1, 2, 1, 2, 3]
 *
 * Window:
 *
 * [1, 2, 1, 2]
 *
 * Frequency:
 *
 *     1 -> 2
 *     2 -> 2
 *
 * Distinct types = 2
 *
 * Therefore the window is valid.
 *
 * Length:
 *
 *     right - left + 1 = 4
 *
 * When 3 enters:
 *
 * [1, 2, 1, 2, 3]
 *
 * Frequency:
 *
 *     1 -> 2
 *     2 -> 2
 *     3 -> 1
 *
 * Distinct types = 3
 *
 * Since:
 *
 *     map.size() > 2
 *
 * the window is invalid.
 *
 * Shrink from the left:
 *
 * Remove elements until one fruit type disappears from the window.
 *
 * Once the map contains only 2 types again, the window becomes
 * valid.
 *
 * Sliding Window Pattern:
 *
 *     Add fruits[right]
 *           ↓
 *     Add/update frequency
 *           ↓
 *     map.size() > 2?
 *           ↓
 *          YES
 *           ↓
 *     Remove fruits[left]
 *           ↓
 *     Decrease its frequency
 *           ↓
 *     Frequency becomes 0?
 *           ↓
 *     Remove it from map
 *           ↓
 *     left++
 *           ↓
 *     Window becomes valid
 *           ↓
 *     Update maximum length
 *
 * Important:
 *
 * The current window length can be calculated directly using:
 *
 *     right - left + 1
 *
 * There is no need to calculate the window length by summing the
 * values in map.values().
 *
 * Key Learning:
 * - A HashMap can be used to track frequencies inside a variable-
 *   size sliding window.
 * - HashMap.size() gives the number of distinct elements in the
 *   current window.
 * - When a frequency becomes 0, the key must be removed from the
 *   map so that map.size() correctly represents the number of
 *   distinct elements.
 * - For maximum-length problems, expand the window while it is
 *   valid and shrink only when the condition is violated.
 * - The window length is:
 *
 *     right - left + 1
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(n)
 *
 * In practice, the map contains at most 3 fruit types at any
 * point before shrinking, so the effective auxiliary space is O(1)
 * for this problem.
 *
 * Common Mistakes:
 * - Using map.size() to represent the total number of fruits
 *   instead of the number of distinct fruit types.
 * - Forgetting to decrease the frequency when moving left.
 * - Forgetting to remove a key when its frequency becomes 0.
 * - Using if instead of while when the window may need to shrink
 *   multiple times.
 * - Maintaining an unnecessary currSum to calculate the window
 *   length.
 * - Forgetting that the current window length is:
 *
 *     right - left + 1
 *
 * Date Solved: 15-08-2026
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.HashMap;


public class LC904_FruitIntoBaskets {

    static class Solution {
        public int totalFruit(int[] fruits) {
            HashMap<Integer , Integer> map = new HashMap<>() ; 
            int left = 0 ; 
            int right = 0 ; 
            int currSum = 0 ; 
            int maxSum = 0 ; 
            while(right < fruits.length){
                currSum = 0 ; 
                int fruit = fruits[right] ; 
                map.put(fruit , map.getOrDefault(fruit, 0) + 1 ) ; 
                while(map.size() > 2){
                    map.put(fruits[left] , map.get(fruits[left]) - 1 ) ; 
                    if(map.get(fruits[left]) == 0 ){
                        map.remove(fruits[left]) ; 
                    }
                    left ++ ; 
                }
                currSum = right - left + 1 ; 
                maxSum = Math.max(currSum , maxSum) ; 

                right ++ ; 
            }

            return maxSum;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        int[] fruits1 = {1, 2, 1};
        System.out.println(
            solution.totalFruit(fruits1)
        );
        // Expected: 3


        // Test Case 2
        int[] fruits2 = {0, 1, 2, 2};
        System.out.println(
            solution.totalFruit(fruits2)
        );
        // Expected: 3


        // Test Case 3
        int[] fruits3 = {1, 2, 3, 2, 2};
        System.out.println(
            solution.totalFruit(fruits3)
        );
        // Expected: 4


        // Test Case 4
        int[] fruits4 = {1, 1, 1, 1};
        System.out.println(
            solution.totalFruit(fruits4)
        );
        // Expected: 4
    }
}