
import java.util.HashSet;

/*
 * Problem: LC 3 - Longest Substring Without Repeating Characters
 *
 * Topic: Strings
 * Pattern: Sliding Window
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(min(m, n))
 *
 * Approach:
 * - Sliding window with left and right pointers using HashSet/HashMap to track window characters.
 *
 * Key Learning:
 * - Sliding window dynamic expansion and contraction.
 *
 * Date Solved: TODO: 10 - 8 - 2026 
 *
 * Status: Solved (Defered before )
 *
 * Confidence: TODO: USER INPUT REQUIRED
 *
 * Revision: Yes
 */

public class LC3_LongestSubstringWithoutRepeatingCharacters {

    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            int left = 0 ; 
            int maxCount = 0 ; 
            HashSet<Character> set = new HashSet<>(); 
            for(int i = 0 ; i < s.length() ; i ++){
                char val = s.charAt(i) ; 
                if(set.contains(val)){
                    while(s.charAt(left) != val){
                        set.remove(s.charAt(left)) ; 
                        left ++ ; 
                    }
                    set.remove(s.charAt(left)) ; 
                    left ++ ; 
                }
                set.add(s.charAt(i)) ; 
                maxCount = Math.max(maxCount , set.size());                 
            }
            return maxCount;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        String s1 = "abcabcbb";
        System.out.println(solution.lengthOfLongestSubstring(s1));
        // Expected: 3

        // Test Case 2
        String s2 = "bbbbb";
        System.out.println(solution.lengthOfLongestSubstring(s2));
        // Expected: 1

        // Test Case 3
        String s3 = "pwwkew";
        System.out.println(solution.lengthOfLongestSubstring(s3));
        // Expected: 3

        // Test Case 4
        String s4 = "";
        System.out.println(solution.lengthOfLongestSubstring(s4));
        // Expected: 0

        // Test Case 5
        String s5 = "abcdef";
        System.out.println(solution.lengthOfLongestSubstring(s5));
        // Expected: 6
    }
}