/*
 * Problem: LC 451 - Sort Characters By Frequency
 *
 * Topic: Hashing
 * Pattern: Frequency Counting + Bucket Sort / Sorting
 * Difficulty: Medium
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 *
 * Approach:
 * - Build character frequency map, then sort by frequency or use Bucket Sort.
 *
 * Key Learning:
 * - Sorting elements by frequency counts.
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


public class LC451_SortCharactersByFrequency {

    static class Solution {
        public String frequencySort(String s) {
            HashMap<Character , Integer > map = new HashMap<>() ; 
            List<Map.Entry<Character , Integer >> list = new ArrayList<>(map.entrySet()) ; 
            for(int i = 0 ; i < s.length() ; i ++){
                char ch = s.charAt(i) ; 
                map.putIfAbsent(ch, 0) ; 
                map.put(ch , map.get(ch) + 1) ; 
            }
            System.out.println(list) ; 

            return "" ; 
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        System.out.println(solution.frequencySort("tree"));
        // Expected: "eert" or "eetr"

        // Test Case 2
        System.out.println(solution.frequencySort("cccaaa"));
        // Expected: "cccaaa" or "aaaccc"

        // Test Case 3
        System.out.println(solution.frequencySort("Aabb"));
        // Expected: "bbAa" or "bbaA"

        // Test Case 4
        System.out.println(solution.frequencySort("a"));
        // Expected: "a"

        // Test Case 5
        System.out.println(solution.frequencySort(""));
        // Expected: ""
    }
}