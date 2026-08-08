/*
 * Problem: LC 128 - Longest Consecutive Sequence
 *
 * Topic: Array, Hashing
 * Pattern: HashSet
 * Difficulty: Medium
 *
 * Time Complexity: O(n) average
 * Space Complexity: O(n)
 *
 * Approach:
 * - Store all numbers in a HashSet for O(1) average lookup.
 * - Iterate through each number in the set.
 * - Check if (key - 1) exists.
 * - If it exists, key is not the beginning of a sequence, so skip it.
 * - If (key - 1) does not exist, key is the start of a sequence.
 * - Use a while loop to check for consecutive numbers using (curr + 1).
 * - Keep track of the length of the current sequence.
 * - Update maxCount with the maximum sequence length.
 *
 * Key Learning:
 * - HashSet provides fast average O(1) lookup.
 * - Only start counting from the beginning of a sequence.
 * - Avoiding repeated traversal of the same sequence allows an O(n)
 *   average-time solution.
 *
 * Date Solved: 08-08-2026
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