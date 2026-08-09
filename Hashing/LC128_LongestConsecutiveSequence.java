/*
 * Problem: LC 128 - Longest Consecutive Sequence
 *
 * Topic: Hashing
 * Pattern: HashSet Sequence Starting Point Detection
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:
 * - Add all numbers to HashSet.
 * - Iterate through set and only check sequence starting points where num - 1 is not in set.
 * - Count consecutive sequence length.
 *
 * Key Learning:
 * - Identifying sequence start points avoids redundant work and achieves linear time.
 *
 * Date Solved: 08-08-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.HashSet;


public class LC128_LongestConsecutiveSequence {

    static class Solution {
        public int longestConsecutive(int[] nums) {
            HashSet<Integer> set = new HashSet<>() ; 
            int maxCount = 0; 
            for(int key : nums){
                set.add(key) ; 
            }
            for(int key : set){
                 if (!set.contains(key - 1)) {

                    int count = 1;
                    int curr = key;

                    while (set.contains(curr + 1)) {
                        curr++;
                        count++;
                    }

                    maxCount = Math.max(maxCount, count);
                 } 
            }
            return maxCount;

        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        System.out.println(
                solution.longestConsecutive(
                        new int[]{100, 4, 200, 1, 3, 2}
                )
        ); // 4

        // Test Case 2
        System.out.println(
                solution.longestConsecutive(
                        new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}
                )
        ); // 9

        // Test Case 3
        System.out.println(
                solution.longestConsecutive(
                        new int[]{1, 2, 0, 1}
                )
        ); // 3

        // Test Case 4
        System.out.println(
                solution.longestConsecutive(
                        new int[]{10}
                )
        ); // 1
    }
}