/*
 * Problem: LC 438 - Find All Anagrams in a String
 *
 * Topic: Strings
 * Pattern: Fixed-Size Sliding Window + Frequency Map
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) - map stores at most 26 lowercase English characters
 *
 * Approach:
 * - Maintain a fixed-size sliding window of length p.length() across string s.
 * - Build a target frequency map for string p and a window frequency map for string s.
 * - Slide the window: if the window map matches the target map, add starting index (right - n) to result.
 * - Remove the character leaving the window on the left and add the new incoming character on the right.
 *
 * Key Learning:
 * - Fixed-size sliding window is effective for substring permutation/anagram matching.
 * - Map comparison or frequency array comparison takes O(1) time for constant alphabet size (26).
 *
 * Date Solved: TODO: USER INPUT REQUIRED
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: TODO: USER INPUT REQUIRED
 *
 * Revision: TODO: USER INPUT REQUIRED
 */

import java.util.*;

public class LC438_FindAllAnagramsInAString {

    static class Solution {
        public List<Integer> findAnagrams(String s, String p) {

            int n = p.length();

            HashMap<Character, Integer> oldMap = new HashMap<>();
            HashMap<Character, Integer> map = new HashMap<>();

            List<Integer> ans = new ArrayList<>();

            int right = 0;

            // Frequency map of p
            for (int i = 0; i < n; i++) {
                oldMap.putIfAbsent(p.charAt(i), 0);
                oldMap.put(p.charAt(i),
                        oldMap.get(p.charAt(i)) + 1);
            }

            // First window
            for (int i = 0; i < n; i++) {
                map.putIfAbsent(s.charAt(i), 0);
                map.put(s.charAt(i),
                        map.get(s.charAt(i)) + 1);

                right++;
            }

            // Sliding window
            while (right <= s.length()) {

                int left = right - n;

                // Check current window
                if (map.equals(oldMap)) {
                    ans.add(left);
                }

                // No next window
                if (right == s.length()) {
                    break;
                }

                // Remove element leaving the window
                char oldChar = s.charAt(left);

                map.put(oldChar, map.get(oldChar) - 1);

                if (map.get(oldChar) == 0) {
                    map.remove(oldChar);
                }

                // Add element entering the window
                char newChar = s.charAt(right);

                map.putIfAbsent(newChar, 0);
                map.put(newChar,
                        map.get(newChar) + 1);

                // Move right
                right++;
            }

            return ans;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        String s1 = "cbaebabacd";
        String p1 = "abc";

        System.out.println(solution.findAnagrams(s1, p1));
        // Expected: [0, 6]

        String s2 = "abab";
        String p2 = "ab";

        System.out.println(solution.findAnagrams(s2, p2));
        // Expected: [0, 1, 2]

        String s3 = "abcdef";
        String p3 = "gh";

        System.out.println(solution.findAnagrams(s3, p3));
        // Expected: []
    }
}