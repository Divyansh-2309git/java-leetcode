/*
 * Problem: LC 424 - Longest Repeating Character Replacement
 *
 * Topic: Strings
 * Pattern: Variable-Size Sliding Window + Frequency Map
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) - map stores at most 26 uppercase English characters
 *
 * Approach:
 * - Maintain a sliding window using left and right pointers.
 * - Track the frequency of each character inside the window using a HashMap.
 * - Track maxFreq, the highest frequency of any single character in the window.
 * - If the number of characters needing replacement (windowLength - maxFreq) exceeds k, shrink the window from the left.
 * - Track the maximum valid window size across the iteration.
 *
 * Key Learning:
 * - A sliding window is valid if (windowSize - maxFreq <= k).
 * - Maintaining maxFreq allows achieving O(n) total time complexity.
 *
 * Date Solved: TODO: USER INPUT REQUIRED
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: TODO: USER INPUT REQUIRED
 *
 * Revision: TODO: USER INPUT REQUIRED
 */

import java.util.HashMap;

public class LC424_LongestRepeatingCharacterReplacement {

    static class Solution {
        public int characterReplacement(String s, int k) {

            int right = 0;
            int left = 0;
            int maxFreq = 0;
            int maxVal = 0;

            HashMap<Character, Integer> map = new HashMap<>();

            while (right < s.length()) {

                char ch = s.charAt(right);

                map.putIfAbsent(ch, 0);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                maxFreq = Math.max(maxFreq, map.get(ch));

                while (right - left + 1 - maxFreq > k) {

                    map.put(
                        s.charAt(left),
                        map.get(s.charAt(left)) - 1
                    );

                    left++;
                }

                maxVal = Math.max(
                    maxVal,
                    right - left + 1
                );

                right++;
            }

            return maxVal;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(
            solution.characterReplacement("ABAB", 2)
        );
        // Expected: 4

        System.out.println(
            solution.characterReplacement("AABABBA", 1)
        );
        // Expected: 4

        System.out.println(
            solution.characterReplacement("AAAA", 2)
        );
        // Expected: 4

        System.out.println(
            solution.characterReplacement("ABCDE", 1)
        );
        // Expected: 2
    }
}