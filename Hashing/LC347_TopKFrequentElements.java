/*
 * Problem: LC 347 - Top K Frequent Elements
 *
 * Topic: Hashing
 * Pattern: Frequency Counting + Bucket Sort / Heap
 * Difficulty: Medium
 *
 * Time Complexity: O(n) with Bucket Sort / O(n log k) with Heap
 * Space Complexity: O(n)
 *
 * Approach:
 * - Build frequency map, then use Bucket Sort or PriorityQueue to retrieve top k elements.
 *
 * Key Learning:
 * - Frequency grouping with Bucket Sort or Heap.
 *
 * Date Solved: TODO: USER INPUT REQUIRED
 *
 * Status: ⏸️ Deferred
 *
 * Confidence: TODO: USER INPUT REQUIRED
 *
 * Revision: Yes
 */

import java.util.*;

public class LC347_TopKFrequentElements {

    static class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            
            return new int[0];
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        System.out.println(Arrays.toString(
                solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));

        // Test Case 2
        System.out.println(Arrays.toString(
                solution.topKFrequent(new int[]{1}, 1)));

        // Test Case 3
        System.out.println(Arrays.toString(
                solution.topKFrequent(new int[]{4, 4, 4, 6, 6, 7, 7, 7, 7}, 2)));

    }
}