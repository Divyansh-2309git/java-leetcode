/*
 * Problem: LC 451 - Sort Characters By Frequency
 *
 * Topic: String, HashMap, Sorting
 * Pattern: Frequency Counting + Sorting
 * Difficulty: Medium
 *
 * Time Complexity:
 * Space Complexity:
 *
 * Approach:
 * - Count the frequency of each character using a HashMap.
 * - Group characters according to their frequencies.
 * - Sort the frequencies in descending order.
 * - Append each character according to its frequency.
 *
 * Key Learning:
 * - A HashMap can be used to store character frequencies.
 * - Multiple characters can have the same frequency.
 * - Characters with the same frequency need to be grouped
 *   so that each character is repeated consecutively.
 * - A HashMap itself is not sorted by its values, so the
 *   entries/frequencies need to be organized separately.
 *
 * Date Attempted: 08-08-2026
 *
 * Status: ⏸️ Deferred
 *
 * Reason:
 * - Put on hold to revisit with a fresh mind.
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